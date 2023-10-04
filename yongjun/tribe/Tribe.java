package StarCraft.yongjun.tribe;

import StarCraft.yongjun.unit.Unit;
import java.util.List;

public abstract class Tribe {
    protected String name;
    public abstract List<Unit> productionUnit();

    public String getName() {
        return name;
    }
}
