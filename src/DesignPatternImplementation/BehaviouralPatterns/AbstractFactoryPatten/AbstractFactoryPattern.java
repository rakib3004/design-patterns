package DesignPatternImplementation.BehaviouralPatterns.AbstractFactoryPatten;

import java.util.Scanner;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        // create factory object
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        // enemy ship object

        EnemyShip theEnemy = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of ship? (UFO/ Rocket/ BossUFO)");

        if (scanner.hasNextLine()){
            String shipType = scanner.nextLine();

            theEnemy=shipFactory.makeEnemyShip(shipType);

            if(theEnemy!=null){
                doStuffEnemy(theEnemy);

            }
            else{
                System.out.println("Please Enter (UFO/ Rocket/ Big UFO) again on next time! ");
            }
        }

    }

    public static void doStuffEnemy(EnemyShip theEnemy){


        System.out.println("Do Stuff Enemy "+theEnemy);
        return;
    }
}
