import java.util.Scanner;

/**
 *
 * @author Solomon Uriri
 */
public class KilotoMile {
     static Double  MI,KLO;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user = new Scanner( System.in );
        
       
       // prepare the input file
        System.out.print("Please, enter in kilometer to convert to mile:"+ " ");
        KLO = user.nextDouble();
        MI = 1.60934/KLO;
        System.out.println(MI+" "+"mile");
    }
}
