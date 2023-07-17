package com.actors;

public class Actor {
    int maxHp;
    int currentHp;

    String name;

    boolean downed;
    StatSheet stats;
    Faction faction;

    Float aggro;
    Actor(StatSheet stats, Faction faction, String name){
        this.stats = stats;
        this.faction = faction;
        this.name = name;
        downed = false;
        this.aggro = 0f;
        this.currentHp = 5;
        this.maxHp = 5;
    }

    public String getName() {
        return name;
    }

    public Float getAggro() {
        return aggro;
    }

    public void attack(Actor target){
        int attackPwr = stats.vigor;
        target.takeDmg(attackPwr);
        this.aggro += attackPwr;
        if(this.aggro >= 100f)
            this.aggro = 100f;
        System.out.println(this.name + " attacked " + target.getName() + " for " + attackPwr +" damage ");
    }

    public void takeDmg(float dmg){
        currentHp -= dmg;
        if(currentHp <= 0) {
            downed = true;
        }
    }
    public Faction getFaction() {
        return faction;
    }

    public StatSheet getStats() {
        return stats;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int initative(){
        return stats.deftness;
    }

    public boolean isDowned(){
        return downed;
    }

}
