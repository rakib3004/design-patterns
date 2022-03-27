package DesignPatternImplementation.BehaviouralPatterns;

public class EnemyShipFactory {
    EnemyShip enemyShip = new EnemyShip();

    public EnemyShip makeEnemyShip(String shipType){
        return enemyShip;
    }
}
