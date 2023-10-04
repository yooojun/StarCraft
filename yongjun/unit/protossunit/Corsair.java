package StarCraft.yongjun.unit.protossunit;

import StarCraft.yongjun.unit.AirUnit;
import StarCraft.yongjun.unit.GroundUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.List;

public class Corsair extends AirUnit {
    public Corsair() {
        this.name = "Corsair";
        this.power = 4;
        this.armor = 12;
    }

    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
