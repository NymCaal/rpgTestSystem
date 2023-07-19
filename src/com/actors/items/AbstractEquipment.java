package com.actors.items;

import com.actors.skill.Skill;

public class AbstractEquipment {
    EquipmentType equipmentType;
    String name;
    String description;

    Skill skill;

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Skill getSkill() {
        return skill;
    }
}
