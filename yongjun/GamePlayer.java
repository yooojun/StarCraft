package StarCraft.yongjun;

import StarCraft.yongjun.tribe.Race;

import StarCraft.yongjun.unit.Unit;
import java.util.LinkedList;
import java.util.List;

public abstract class GamePlayer {

    protected String name;
    protected Race race;
    protected List<Unit> units;
    public GamePlayer(String name, Race race) {
        this.name = name;
        this.race = race;
        units = new LinkedList<>();
    }

    public void addUnit(Race race){
        units = race.productionUnit();
    }
    public String getName() {
        return name;
    }

    public Race getrace() {
        return race;
    }

    public List<Unit> getUnits() {
        return units;
    }
}
