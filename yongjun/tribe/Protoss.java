package StarCraft.yongjun.tribe;

import StarCraft.yongjun.unit.Unit;
import StarCraft.yongjun.unit.protossunit.*;
import StarCraft.yongjun.unit.terranunit.Marine;
import java.util.LinkedList;
import java.util.List;

public class Protoss extends Race {
    private static final int MAXZERGUNIT = 4;
    private static final int UNITTYPE = 6;

    public Protoss() {
        this.name = "Protoss";
    }

    @Override
    public List<Unit> productionUnit() {
        List<Unit> protossList = new LinkedList<>();
        for (int i = 0; i < MAXZERGUNIT; i++) {
            int unitNumber = (int) (Math.random() * UNITTYPE) + 1;
            switch (unitNumber) {
                case 1:
                    protossList.add(new Zealot());
                    break;
                case 2:
                    protossList.add(new Dragoon());
                    break;
                case 3:
                    protossList.add(new HighTempler());
                    break;
                case 4:
                    protossList.add(new Scout());
                    break;
                case 5:
                    protossList.add(new Corsair());
                    break;
                case 6:
                    protossList.add(new Carrier());
                    break;
            }
        }
        return protossList;
    }

}
