package com.test;

import com.actors.Inventory;
import com.actors.items.Knife;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class InventoryTest {

    Inventory inventory;
    @BeforeEach
    void setup(){
        inventory = new Inventory();
    }
    @Test
    void setHeadSlot() {


    }

    @Test
    void setTorsoSlot() {
    }

    @Test
    void setLegsSlot() {
    }

    @Test
    void setLeftArmSlot() {
    }

    @Test
    void setRightArmSlot() {
        Knife knife = new Knife();
        inventory.setRightArmSlot(knife);
    }
}