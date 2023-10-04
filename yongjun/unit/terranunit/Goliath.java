package StarCraft.yongjun.unit.terranunit;

import StarCraft.yongjun.unit.GroundUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.List;

public class Goliath extends GroundUnit {
    public Goliath() {
        this.name = "Goliath";
        this.power = 5;
        this.armor = 15;
        this.type = 'B';
    }

    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
