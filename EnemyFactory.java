import java.util.Scanner;

/**
 * Created by Rupak on 5/10/2016.
 */
public class EnemyFactory {

    public EnemyShip makeEnemyShip(String str)
    {
        //EnemyShip ob = null;
        //System.out.println("What type of ship? (U/B/R");
        //Scanner input = new Scanner(System.in);
        //if(input.hasNextLine())
        //{
        //    String str = input.nextLine();
        //}

        if(str.equals("U"))
        {
            return new UfoEnemyShip();
        }
        else if(str.equals("R"))
        {
            return new RocketEnemyShip();
        }
        else if(str.equals("B"))
        {
            return new BigUfoEnemyShip();
        }
        else
        {
            return null;
        }
    }
}
