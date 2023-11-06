package StarCraft.yongjun;

import StarCraft.yongjun.tribe.Race;


public class Computer extends GamePlayer{

    public Computer(String name, Race race) {
        super(name, race);
        addUnit(this.race);
    }
}
