package StarCraft.yongjun;

import StarCraft.yongjun.tribe.Tribe;
import StarCraft.yongjun.unit.Unit;

public class Player extends GamePlayer{

    public Player(String name, Tribe tribe) {
        super(name, tribe);
        addUnit(this.tribe);
    }



    public void destroyedUnit(Unit unit){
        units.remove(unit);
    }




}
