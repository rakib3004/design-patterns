package DesignPatternImplementation.BehaviouralPatterns;

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


        }

    }
}
