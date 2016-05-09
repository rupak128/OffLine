/**
 * Created by Rupak on 5/10/2016.
 */
public abstract class EnemyShip {

    private String name;
    private double damage;

    public String getName(){return name;}

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage(){return damage;}

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void followHeroShip()
    {
        System.out.println(getName()+" follows a hero ship");
    }
    public void displayEnemyShip()
    {
        System.out.println(getName()+" is on the screen");
    }
    public void enemyShipShoots()
    {
        System.out.println(getName()+" damages "+getDamage());
    }
}
