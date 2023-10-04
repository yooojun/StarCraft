package StarCraft.yongjun.unit.protossunit;

import StarCraft.yongjun.unit.GroundUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.List;

public class Dragoon extends GroundUnit {
    public Dragoon() {
        this.name = "Dragoon";
        this.power = 3;
        this.armor = 15;
        this.type = 'B';
    }

    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
