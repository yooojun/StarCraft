package StarCraft.yongjun.unit.zergunit;

import StarCraft.yongjun.tribe.Zerg;
import StarCraft.yongjun.unit.GroundUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.List;

public class Ultralisk extends GroundUnit{
    public Ultralisk() {
        this.power = 5;
        this.armor = 15;
        this.name = "Ultralisk";
    }

    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
