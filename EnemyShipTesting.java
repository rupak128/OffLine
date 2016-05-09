import java.util.Scanner;

/**
 * Created by Rupak on 5/10/2016.
 */
public class EnemyShipTesting {

    public static void main(String[] args) {
        EnemyFactory ob = new EnemyFactory();
        EnemyShip ship = null;
        System.out.println("What type of ship? (U/B/R");
        Scanner input = new Scanner(System.in);
        String str = "";
        if(input.hasNextLine())
        {
            str = input.nextLine();
        }
        ship = ob.makeEnemyShip(str);
        doStuff(ship);
    }

    public static void doStuff(EnemyShip a) {
        a.displayEnemyShip();
        a.followHeroShip();
        a.enemyShipShoots();
    }

}
