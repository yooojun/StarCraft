package StarCraft.yongjun.unit.protossunit;

import StarCraft.yongjun.unit.AirUnit;
import StarCraft.yongjun.unit.GroundUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.List;

public class Carrier extends AirUnit {
    public Carrier() {
        this.name = "Carrier";
        this.power = 25;
        this.armor = 40;
    }

    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
