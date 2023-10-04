package StarCraft.yongjun;

import StarCraft.yongjun.tribe.Protoss;
import StarCraft.yongjun.tribe.Terran;
import StarCraft.yongjun.tribe.Tribe;
import StarCraft.yongjun.tribe.Zerg;
import StarCraft.yongjun.unit.Unit;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    List<GamePlayer> players;
    List<GamePlayer> computers;
    public static final int MAXPLAYER = 1;
    public static final int NAMELENGTH = 5;

    public Game() {
        this.players = new LinkedList<>();
        this.computers = new LinkedList<>();
    }

    public void start() {
        PrintUI.startGame();
        Scanner scanner = new Scanner(System.in);
        int playerNumber;
        int computerNumber;
        playerNumber = playerSetting(scanner);
        computerNumber = computerSetting(scanner);
        gamePlayerSet(playerNumber, computerNumber, scanner);
        gamePlay(players, computers, scanner);
    }

    private void gamePlay(List<GamePlayer> players, List<GamePlayer> computers, Scanner scanner) {
        GamePlayer winner = null;

        while (true) {
            PrintUI.playersList(computers);
            PrintUI.playersList(players);
            winner = winnerCheck(players, computers);
            if (winner != null) {
                PrintUI.winnerIs(winner);
                PrintUI.endGame();
                break;
            }
            for (GamePlayer computer : computers) {
                ComputerAttackTurn(computer, players);
            }
            for (GamePlayer player : players) {
                playerAttackTurn(player, players, computers, scanner);
            }

        }
    }

    private void playerAttackTurn(GamePlayer player, List<GamePlayer> players, List<GamePlayer> computers, Scanner scanner) {
//        PrintUI.forSingle();
        PrintUI.playerTurn(player);  //다인용 코드
        playerAttack(player, computers, scanner);


        // 다인용 코드
        while (true) {
            char choose = scanner.next().toLowerCase().charAt(0);
            if (choose == 'c') {
                playerAttack(player, computers, scanner);
                break;
            } else if (choose == 'p') {
                playerAttack(player, players, scanner);
                break;
            } else {
                PrintUI.wrongInput();
                PrintUI.reInput();
            }
        }
    }

    private static void playerAttack(GamePlayer player, List<GamePlayer> players, Scanner scanner) {
        int targetUnit;
        int attacker;
        int target;

        while (true) {
            PrintUI.selectTarget(players);
            try {
                target = scanner.nextInt();
                PrintUI.selectAttacker(player);

                attacker = scanner.nextInt();
                PrintUI.selectTargetUnit(players.get(target));

                targetUnit = scanner.nextInt();
                Unit atUnit = player.getUnits().get(attacker);
                Unit tagetUnit = players.get(target).getUnits().get(targetUnit);

                atUnit.attack(tagetUnit);
                defeatCheck(players, tagetUnit, target, targetUnit);
                break;
            } catch (NumberFormatException | IndexOutOfBoundsException | InputMismatchException e) {
                PrintUI.wrongInput();
                PrintUI.reInput();
            }
        }
    }

    private void ComputerAttackTurn(GamePlayer computer, List<GamePlayer> players) {
        Unit unit = computer.getUnits().get((int) (Math.random() * computer.units.size()));
        int targetNumber = (int) (Math.random() * players.size());
        int targetUnitNumber = (int) (Math.random() * players.get(targetNumber).getUnits().size());
        Unit targetUnit = players.get(targetNumber).getUnits().get(targetUnitNumber);
        unit.attack(targetUnit);

        defeatCheck(players, targetUnit, targetNumber, targetUnitNumber);

    }

    private static void defeatCheck(List<GamePlayer> players, Unit targetUnit, int targetNumber, int targetUnitNumber) {
        if (targetUnit.getArmor() <= 0) {
            players.get(targetNumber).getUnits().remove(targetUnitNumber);
            if (players.get(targetNumber).getUnits().isEmpty()) {
                PrintUI.gamePlayerDefeat(players.get(targetNumber));
                players.remove(targetUnitNumber);
            }
        }
    }

    private GamePlayer winnerCheck(List<GamePlayer> players, List<GamePlayer> computers) {
        if (players.isEmpty()) {
            return computers.get(0);
//            if (computers.size() == 1) {
//                return computers.get(0);
//            } else {
//                return null;
        } else if (computers.isEmpty()) {
            if (players.size() == 1) {
                return players.get(0);
            } else {
                return null;
            }
        } else
            return null;

    }

    private void gamePlayerSet(int playerNumber, int computerNumber, Scanner scanner) {
        for (int i = 0; i < playerNumber; i++) {
            PrintUI.PlayerNameSet(i + 1);
            String nickName = selectName(scanner);
            Tribe tribe = selectTribe(scanner);
            Player player = new Player(nickName, tribe);
            players.add(player);
        }
        for (int i = 0; i < computerNumber; i++) {
            String name = "computer";
            String computerName = name + i;
            Tribe tribe = computerTribe((int) (Math.random() * 3) + 1);
            Computer computer = new Computer(computerName, tribe);
            computers.add(computer);
        }


    }

    private Tribe computerTribe(int computerTribe) {
        switch (computerTribe) {
            case 1:
                return new Terran();
            case 2:
                return new Protoss();
            case 3:
                return new Zerg();
            default:
                return null;
        }
    }

    private Tribe selectTribe(Scanner scanner) {
        PrintUI.selectTribe();
        int selTirbe = 0;
        while (true) {
            try {
                selTirbe = scanner.nextInt();
            } catch (NumberFormatException e) {
                PrintUI.wrongInput();
            }

            switch (selTirbe) {
                case 1:
                    return new Terran();
                case 2:
                    return new Protoss();
                case 3:
                    return new Zerg();
                default:
                    PrintUI.wrongInput();

            }
        }
    }

    private String selectName(Scanner scanner) {
        String playerName;
        while (true) {
            playerName = scanner.next();
            if (playerName.length() > NAMELENGTH || playerName.isEmpty()) {
                PrintUI.wrongInput();
            } else {
                break;
            }
        }
        return playerName;
    }

    private int computerSetting(Scanner scanner) {
        return setting(scanner, 'C');
    }

    private int playerSetting(Scanner scanner) {
        return setting(scanner, 'P');
    }

    public int setting(Scanner scanner, char c) {
        int inputNumber = -1;
        if (c == 'P') {
            PrintUI.addPlayer();
        } else {
            PrintUI.addComputer();
        }

        while (true) {
            try {
                inputNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                PrintUI.wrongInput();
                PrintUI.endGame();
                throw new InputMismatchException();
            }

            if (c == 'P') {

                if (inputNumber < 1 || inputNumber > MAXPLAYER) {
                    PrintUI.wrongInput();
                    PrintUI.reInput();
                } else {
                    break;
                }
            } else {
                if (inputNumber < 0 || inputNumber > MAXPLAYER) {
                    PrintUI.wrongInput();
                    PrintUI.reInput();
                } else {
                    break;
                }
            }
        }
        return inputNumber;
    }
}
