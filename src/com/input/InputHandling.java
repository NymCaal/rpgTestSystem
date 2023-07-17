package com.input;

import com.actors.Actor;

import java.util.Scanner;

public class InputHandling {
    static Scanner in = new Scanner(System.in);

    public static void drawCombatOptions(Actor currentActor, String... targets){
        System.out.println("playerTurn " + currentActor.getName());
        System.out.println("choose option:");
        System.out.println("A: attack");
        System.out.println("B: defend");
        System.out.println("C: item");

        String option = in.nextLine();
    }
}
