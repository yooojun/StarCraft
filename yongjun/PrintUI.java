package StarCraft.yongjun;

import java.util.List;

public class PrintUI {
    public static void startGame() {
        System.out.println("StarCraft를 시작합니다.");

    }

    public static void addPlayer() {
        System.out.println("몇명이서 플레이 하시겠습니까?");
        System.out.print("최소 1명 ~ 최대 " + Game.MAXPLAYER + "명 ");
    }

    public static void addComputer() {
        System.out.println("Computer를 몇 기 추가 하시겠습니까?");
        System.out.print("최소 0기 ~ 최대 " + Game.MAXPLAYER + "기 ");
    }

    public static void PlayerNameSet(int i) {
        System.out.println(i + " 번쨰 Player의 이름을 입력하세요.(5글자 이내로 입조)");
    }

    public static void wrongInput() {
        System.out.println("잘못된 입력입니다.");
    }

    public static void endGame() {
        System.out.println("게임을 종료합니다.");
    }

    public static void reInput() {
        System.out.println("다시 입력하세요.");
    }


    public static void selectTribe() {
        System.out.println("종족을 선택해 주세요(숫자로 입력)");
        System.out.println("1. Terran 2. Protoss 3. Zerg");
    }

    public static void unitList(GamePlayer player) {
        System.out.println(player.name + " " + player.tribe.getName());
        for (int i = 0; i < player.units.size(); i++) {
            System.out.println(i + ". " + player.units.get(i).getName() +
                    "(현재 방어력: " + player.units.get(i).getArmor() + ")");
        }
    }

    public static void winnerIs(GamePlayer winner) {
        System.out.println("winner is " + winner.getName());
    }

    public static void playerTurn(GamePlayer player) {
        System.out.println(player.getName() + "님의 차례 입니다.");
        System.out.print("공격할 상대를 골라주세요(Computer : c, Player : p) : ");
    }

    public static void gamePlayerDefeat(GamePlayer player) {
        System.out.println(player.getName() + "은 패배하였습니다.");
    }

    public static void failAttack() {
        System.out.println("공격할 수 없는 대상입니다.");
    }

    public static void playersList(List<GamePlayer> gamePlayers) {
        for (GamePlayer computer : gamePlayers) {
            PrintUI.unitList(computer);
            System.out.println();
        }
    }

    public static void selectTarget(List<GamePlayer> players) {
        System.out.println("공격할 적을 선택하세요(숫자 입력)");
        for (GamePlayer player : players) {
            System.out.println(player.name + " " + player.tribe.getName());
        }
    }

    public static void selectAttacker(GamePlayer player) {
        unitList(player);
        System.out.println("공격을 수행할 유닛을 선택하세요(숫자 입력)");
    }

    public static void selectTargetUnit(GamePlayer gamePlayer) {
        System.out.println("공격할 적군 유닛을 선택하세요(숫자 입력)");
        unitList(gamePlayer);
    }


}
