package StarCraft.yongjun.tribe;

import StarCraft.yongjun.unit.Unit;
import StarCraft.yongjun.unit.protossunit.*;
import StarCraft.yongjun.unit.terranunit.*;
import StarCraft.yongjun.unit.zergunit.*;
import java.util.LinkedList;
import java.util.List;

public class Terran extends Race {
    private static final int MAXZERGUNIT = 5;
    private static final int UNITTYPE = 6;


    public Terran() {
        this.name = "Terran";
    }

    @Override
    public List<Unit> productionUnit() {
        List<Unit> terranList = new LinkedList<>();
        for (int i = 0; i < MAXZERGUNIT; i++) {
            int unitNumber = (int) (Math.random() * UNITTYPE) + 1;
            switch (unitNumber) {
                case 1:
                    terranList.add(new Marine());
                    break;
                case 2:
                    terranList.add(new Tank());
                    break;
                case 3:
                    terranList.add(new Valkyrie());
                    break;
                case 4:
                    terranList.add(new Wraith());
                    break;
                case 5:
                    terranList.add(new Goliath());
                    break;
                case 6:
                    terranList.add(new BattleCruzer());
                    break;
            }
        }
        return terranList;
    }
}
