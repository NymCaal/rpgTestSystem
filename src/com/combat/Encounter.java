package com.combat;

import com.actors.Actor;
import java.util.*;

public class Encounter {

    Scanner in = new Scanner(System.in);
    Queue<Actor> turnOrder;
    List<Actor> party;
    List<Actor> enemies;

    public Encounter(List<Actor> party, List<Actor> enemies){
        turnOrder = new LinkedList<>();
        this.party = party;
        this.enemies = enemies;
        SortedMap<Integer,Actor> sortedActors = new TreeMap<>();
        for(Actor actor : party) {
            sortedActors.put(actor.initative(), actor);
        }

        for (Actor actor : enemies) {
            sortedActors.put(actor.initative(), actor);
        }

        for (int i : sortedActors.keySet()) {
            turnOrder.add(sortedActors.get(i));
        }
    }

    public void continueTurnOrder(){
        Actor currentActor = turnOrder.remove();
        if(!currentActor.isDowned()) {
            switch (currentActor.getFaction()){
                case PARTY:
                    playerTurn(currentActor);
                    break;
                case ENEMY:
                    cpuTurn(currentActor);
                    break;
                default:
                    break;
            }
        }
        turnOrder.add(currentActor);
    }

    public void playerTurn(Actor currentActor){
        System.out.println("playerTurn " + currentActor.getName());
        String targetName = in.nextLine();
        Actor target = turnOrder.stream()
                .filter(actor -> actor.getFaction() != currentActor.getFaction())
                .filter(actor -> actor.getName().equals(targetName))
                .findFirst()
                .get();
        currentActor.attack(target);

    }

    public void cpuTurn(Actor currentActor){
        System.out.println("enemyTurn " + currentActor.getName() + " hp: " + currentActor.getCurrentHp());
        Actor target = turnOrder.stream()
                .filter(actor -> actor.getFaction() != currentActor.getFaction())
                .findAny()
                .get();
        currentActor.attack(target);
    }

}
