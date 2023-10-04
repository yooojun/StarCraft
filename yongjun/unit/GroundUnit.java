package StarCraft.yongjun.unit;

import StarCraft.yongjun.PrintUI;

public abstract class GroundUnit extends Unit {

    public GroundUnit() {
        this.type = 'G';
    }

    @Override
    public void attack(Unit unit) {
        if (unit.getType() == 'A' && (this.getType() != 'B' && this.getType() != 'A')) {
            PrintUI.failAttack();
        } else {
            super.attack(unit);
        }
    }
}
