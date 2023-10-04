package StarCraft.yongjun.unit.terranunit;

import StarCraft.yongjun.unit.GroundUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.List;

public class Marine extends GroundUnit {
    public Marine() {
        this.name = "Marine";
        this.power = 3;
        this.armor = 10;
        this.type = 'B';
    }

    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
