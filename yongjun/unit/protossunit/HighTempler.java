package StarCraft.yongjun.unit.protossunit;

import StarCraft.yongjun.unit.GroundUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.List;

public class HighTempler extends GroundUnit {
    public HighTempler() {
        this.name = "HighTempler";
        this.power = 10;
        this.armor = 2;

    }

    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
