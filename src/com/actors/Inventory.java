package com.actors;

import com.actors.items.AbstractEquipment;

public class Inventory {
    AbstractEquipment headSlot;
    AbstractEquipment torsoSlot;
    AbstractEquipment legsSlot;
    AbstractEquipment leftArmSlot;
    AbstractEquipment rightArmSlot;

    public AbstractEquipment getHeadSlot() {
        return headSlot;
    }

    public void setHeadSlot(AbstractEquipment headSlot) {
        this.headSlot = headSlot;
    }

    public AbstractEquipment getTorsoSlot() {
        return torsoSlot;
    }

    public void setTorsoSlot(AbstractEquipment torsoSlot) {
        this.torsoSlot = torsoSlot;
    }

    public AbstractEquipment getLegsSlot() {
        return legsSlot;
    }

    public void setLegsSlot(AbstractEquipment legsSlot) {
        this.legsSlot = legsSlot;
    }

    public AbstractEquipment getLeftArmSlot() {
        return leftArmSlot;
    }

    public void setLeftArmSlot(AbstractEquipment leftArmSlot) {
        this.leftArmSlot = leftArmSlot;
    }

    public AbstractEquipment getRightArmSlot() {
        return rightArmSlot;
    }

    public void setRightArmSlot(AbstractEquipment rightArmSlot) {
        this.rightArmSlot = rightArmSlot;
    }
}
