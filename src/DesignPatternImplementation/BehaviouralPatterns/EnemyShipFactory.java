package DesignPatternImplementation.BehaviouralPatterns;

public class EnemyShipFactory {
    EnemyShip enemyShip = null;

    public EnemyShip makeEnemyShip(String newShipType){
        if(newShipType.equals("UNO")){
            return new UFOEnemyShip();
        }
        else if(newShipType.equals("Rocket")){
            return new RocketEnemyShip();
        }
        else if(newShipType.equals("Big UFO")){
            return new BigUFOEnemyShip();
        }
        else{
            return null;
        }

    }
}
