package StarCraft.yongjun;

import StarCraft.yongjun.tribe.Tribe;

public class Computer extends GamePlayer{

    public Computer(String name, Tribe tribe) {
        super(name, tribe);
        addUnit(this.tribe);
    }
}
