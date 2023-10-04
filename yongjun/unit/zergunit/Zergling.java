package StarCraft.yongjun.unit.zergunit;

import StarCraft.yongjun.tribe.Zerg;
import StarCraft.yongjun.unit.GroundUnit;
import StarCraft.yongjun.unit.Unit;
import java.util.LinkedList;
import java.util.List;

public class Zergling extends GroundUnit {


    public Zergling(){
        this.name = "Zergling";
        this.armor = 2;
        this.power = 2;
    }


    @Override
    public List<Unit> productionUnit() {
        return null;
    }
}
//        return new LinkedList<>().add(new Zergling());
