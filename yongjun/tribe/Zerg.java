package StarCraft.yongjun.tribe;

import StarCraft.yongjun.unit.Unit;
import StarCraft.yongjun.unit.zergunit.*;
import java.util.LinkedList;
import java.util.List;


public class Zerg extends Race {
    private static final int MAXZERGUNIT = 8;
    private static final int UNITTYPE = 6;

    public Zerg() {
        this.name = "Zerg";
    }

    @Override
    public List<Unit> productionUnit() {
        List<Unit> zerglist = new LinkedList<>();
        for (int i = 0; i < MAXZERGUNIT; i++) {
            int unitNumber = (int) (Math.random() * UNITTYPE) + 1;
            switch (unitNumber) {
                case 1:
                    zerglist.add(new Zergling());
                    break;
                case 2:
                    zerglist.add(new Hydralisk());
                    break;
                case 3:
                    zerglist.add(new Ultralisk());
                    break;
                case 4:
                    zerglist.add(new Mutalisk());
                    break;
                case 5:
                    zerglist.add(new Guardian());
                    break;
                case 6:
                    zerglist.add(new Queen());
                    break;
            }
        }
        return zerglist;
    }
}
