package StarCraft.yongjun;

import StarCraft.yongjun.tribe.Tribe;
import StarCraft.yongjun.unit.Unit;
import java.util.LinkedList;
import java.util.List;

public abstract class GamePlayer {

    protected String name;
    protected Tribe tribe;
    protected List<Unit> units;
    public GamePlayer(String name, Tribe tribe) {
        this.name = name;
        this.tribe = tribe;
        units = new LinkedList<>();
    }

    public void addUnit(Tribe tribe){
        units = tribe.productionUnit();
    }
    public String getName() {
        return name;
    }

    public Tribe getTribe() {
        return tribe;
    }

    public List<Unit> getUnits() {
        return units;
    }
}
