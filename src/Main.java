import com.actors.Actor;
import com.actors.ActorBuilder;
import com.actors.Faction;
import com.actors.StatSheetBuilder;
import com.combat.Encounter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Encounter testFight = new Encounter(generateParty(), generateEnemies());
        for(int i =0 ; i <10 ; i++) {
            testFight.continueTurnOrder();
        }
    }

    private static List<Actor> generateParty(){
        List<Actor> party = new ArrayList<>();
        party.add(ActorBuilder.newBuilder()
                .setStatsBuilder(StatSheetBuilder.newBuilder()
                        .setVigor(1)
                        .setDeftness(2)
                        .setEducation(3)
                        .setSavvy(4)
                        .setLuck(5))
                .setFaction(Faction.PARTY)
                .setName("Justine")
                .build());
        party.add(ActorBuilder.newBuilder()
                .setStatsBuilder(StatSheetBuilder.newBuilder()
                        .setVigor(1)
                        .setDeftness(4)
                        .setEducation(3)
                        .setSavvy(4)
                        .setLuck(5))
                .setFaction(Faction.PARTY)
                .setName("Trent")
                .build());
        return party;
    }

    private static List<Actor> generateEnemies(){
        List<Actor> party = new ArrayList<>();
        party.add(ActorBuilder.newBuilder()
                .setStatsBuilder(StatSheetBuilder.newBuilder()
                        .setVigor(1)
                        .setDeftness(8)
                        .setEducation(3)
                        .setSavvy(4)
                        .setLuck(5))
                .setFaction(Faction.ENEMY)
                .setName("Evil Gary")
                .build());
        party.add(ActorBuilder.newBuilder()
                .setStatsBuilder(StatSheetBuilder.newBuilder()
                        .setVigor(2)
                        .setDeftness(1)
                        .setEducation(3)
                        .setSavvy(4)
                        .setLuck(5))
                .setFaction(Faction.ENEMY)
                .setName("Evil Dave")
                .build());
        return party;
    }
}