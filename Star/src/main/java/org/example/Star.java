package org.example;

import jdk.dynalink.NamedOperation;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rock=0\npaper=1\nscissors=2\nplease choose your input to play: ");
        int user = sc.nextInt();
        int rando = new Random().nextInt(3);
        String mach = switch (rando) {
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "scissor";
            default -> null;
        };
        System.out.println(mach);
        if(rando==user){
            System.out.println("It's a tie");
        }else if((rando==0 && user==1)||(rando==1 && user==2)||(rando==2 && user==0)){
            System.out.println("You win");
        }else{
            System.out.println("I win!");
        }





    }
}


