package com.actors.skill;

import com.actors.Actor;
import com.actors.DamageType;

import static com.actors.DamageType.FIRE;

public class FlameSweep extends AbstractSkill{

    int factor = 5;
    DamageType damageType = FIRE;

    @Override
    public void useOn(Actor... targets) {
        for(Actor target : targets) {
            target.takeDmg(factor, damageType);
        }
    }

    @Override
    public String getDescription() {
        return "Multi target fire spell, deals " + factor + "fire damage to each foe ";
    }
}
