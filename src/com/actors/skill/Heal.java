package com.actors.skill;

import com.actors.Actor;

public class Heal extends AbstractSkill
{
    int factor = 5;
    @Override
    public void useOn(Actor target) {
        target.getHp().increaseCurrent(factor);
    }

    @Override
    public String getDescription() {
        return "Heals Target for";
    }
}
