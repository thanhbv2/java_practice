package interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hiPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hiPoints, int strength, String weapon) {
        this.name = name;
        this.hiPoints = hiPoints;
        this.strength = strength;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + this.name + '\'' +
                ", hiPoints=" + this.hiPoints +
                ", strength=" + this.strength +
                ", weapon='" + this.weapon + '\'' +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHiPoints() {
        return this.hiPoints;
    }

    public void setHiPoints(int hiPoints) {
        this.hiPoints = hiPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hiPoints);
        values.add(2, "" + this.strength);
        values.add(3, "" + this.weapon);
        return values;
    }

    @Override
    public void read(List<String> saveValues) {
        if(saveValues != null && saveValues.size() > 0){
            this.name = saveValues.get(0);
            this.hiPoints = Integer.parseInt(saveValues.get(1));
            this.strength = Integer.parseInt(saveValues.get(2));
            this.weapon = saveValues.get(3);
        }
    }
}
