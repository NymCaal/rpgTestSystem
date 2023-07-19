package com.actors;

public class Actor {
    ResourceBar hpBar;
    ResourceBar spBar;

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
        this.hpBar = new ResourceBar(10);
        this.spBar = new ResourceBar(5);
    }

    public String getName() {
        return name;
    }

    public Float getAggro() {
        return aggro;
    }

    public void attack(Actor target){
        int attackPwr = stats.vigor;
        target.takeDmg(attackPwr,DamageType.FIRE);
        this.aggro += attackPwr;
        if(this.aggro >= 100f)
            this.aggro = 100f;
        System.out.println(this.name + " attacked " + target.getName() + " for " + attackPwr +" damage ");
    }

    public void takeDmg(float dmg, DamageType damageType){
        hpBar.decreaseCurrent((int)dmg);
        if(hpBar.getCurrent()  <= 0) {
            downed = true;
        }
    }
    public Faction getFaction() {
        return faction;
    }

    public StatSheet getStats() {
        return stats;
    }

    public ResourceBar getHp() {
        return hpBar;
    }

    public ResourceBar getSp() {
        return spBar;
    }

    public int initative(){
        return stats.deftness;
    }

    public boolean isDowned(){
        return downed;
    }

}
