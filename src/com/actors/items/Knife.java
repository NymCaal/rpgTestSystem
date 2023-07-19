package com.actors.items;

import com.actors.skill.Skill;
import com.actors.skill.WeakSlash;

import static com.actors.items.EquipmentType.ONE_HAND_WEAPON;

public class Knife extends AbstractEquipment{
    EquipmentType equipmentType= ONE_HAND_WEAPON;
    String name = "Knife";
    String description = "A small one handed bladed weapon";

    Skill skill;

    public Knife(){
        skill = new WeakSlash();
    }

    @Override
    public Skill getSkill() {
        return skill;
    }
}
