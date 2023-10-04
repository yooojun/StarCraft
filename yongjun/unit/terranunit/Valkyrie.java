package StarCraft.yongjun.unit.terranunit;

import StarCraft.yongjun.unit.AirUnit;
import StarCraft.yongjun.unit.GroundUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.Arrays;
import java.util.List;

public class Valkyrie extends AirUnit {
    public Valkyrie() {
        this.name = "Valkyrie";
        this.power = 4;
        this.armor = 12;
    }

    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
