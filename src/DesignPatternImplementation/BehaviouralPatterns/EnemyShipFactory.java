package DesignPatternImplementation.BehaviouralPatterns;

public class EnemyShipFactory {
    EnemyShip enemyShip = new EnemyShip();

    public EnemyShip makeEnemyShip(String newShipType){
        if(newShipType.equals("UNO")){
        }
        return enemyShip;

    }
}
