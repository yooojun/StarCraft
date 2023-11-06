package StarCraft.yongjun;

import StarCraft.yongjun.tribe.Race;
import StarCraft.yongjun.tribe.Tribe;
import StarCraft.yongjun.unit.Unit;

public class Player extends GamePlayer{

    public Player(String name, Race race) {
        super(name, race);
        addUnit(this.race);
    }



    public void destroyedUnit(Unit unit){
        units.remove(unit);
    }




}
