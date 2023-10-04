package StarCraft.yongjun.unit.terranunit;

import StarCraft.yongjun.unit.AirUnit;
import StarCraft.yongjun.unit.GroundUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.List;

public class Wraith extends AirUnit {
    public Wraith() {
        this.name = "Wraith";
        this.power = 3;
        this.armor = 10;
    }

    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
