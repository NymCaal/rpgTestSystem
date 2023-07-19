package com.actors.skill;

import com.actors.Actor;

public interface Skill {
    public void useOn(Actor target);
    public String getDescription();
}
