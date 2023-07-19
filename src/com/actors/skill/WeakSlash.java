package com.actors.skill;

import com.actors.Actor;
import com.actors.DamageType;

import static com.actors.DamageType.SLASH;

public class WeakSlash extends AbstractSkill{

    int factor = 5;
    DamageType damageType = SLASH;
    @Override
    public void useOn(Actor target) {
        target.takeDmg(factor, damageType);
    }

    @Override
    public String getDescription() {
        return "does minor slashing damage to a foe";
    }
}
