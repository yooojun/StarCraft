package StarCraft.yongjun.unit;

import StarCraft.yongjun.tribe.Tribe;

public abstract class Unit extends Tribe {
    protected double armor;
    protected double power;
    protected String name;

    protected char type; // G - gound A - Air B- both

    public int getType() {
        return type;
    }

    public void attack(Unit unit) {
        unit.setArmor(unit.armor - this.getPower());

    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }


    public String getName() {
        return name;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }
}
