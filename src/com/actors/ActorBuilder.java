package com.actors;

public class ActorBuilder {
    StatSheetBuilder statsBuilder;
    Faction faction;

    String name;

    public static ActorBuilder newBuilder(){
        return new ActorBuilder();
    }


    public ActorBuilder setStatsBuilder(StatSheetBuilder statsBuilder) {
        this.statsBuilder = statsBuilder;
        return this;
    }

    public StatSheetBuilder getStatsBuilder() {
        return statsBuilder;
    }

    public ActorBuilder setFaction(Faction faction) {
        this.faction = faction;
        return this;
    }

    public String getName() {
        return name;
    }

    public ActorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Faction getFaction() {
        return faction;
    }

    public Actor build(){
        return new Actor(statsBuilder.build(), faction, name);
    }
}
