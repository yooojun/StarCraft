package StarCraft.yongjun.tribe;

import StarCraft.yongjun.unit.Unit;
import java.util.List;

public abstract class Race extends Tribe {
    protected String name;
    public String getName() {
        return name;
    }

    public abstract List<Unit> productionUnit();

}
