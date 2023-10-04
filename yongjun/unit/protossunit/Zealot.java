package StarCraft.yongjun.unit.protossunit;

import StarCraft.yongjun.unit.GroundUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.List;

public class Zealot extends GroundUnit {
    public Zealot() {
        this.name = "Zealot";
        this.power = 5;
        this.armor = 20;
    }

    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
