package com.actors.skill;

import com.actors.Actor;

public class AbstractSkill implements Skill {

    public void useOn(Actor... targets) {
        for (Actor target : targets) {
            useOn(target);
        }
    }

    @Override
    public void useOn(Actor target) {

    }

    @Override
    public String getDescription() {
        return null;
    }
}
