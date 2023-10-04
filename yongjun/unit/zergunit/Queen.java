package StarCraft.yongjun.unit.zergunit;

import StarCraft.yongjun.unit.AirUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.List;

public class Queen extends AirUnit {
    public Queen() {
        this.armor = 15;
        this.power = 25;
        this.name = "Queen";
    }

    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
