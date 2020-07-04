import java.util.Scanner;

/**
 *
 * @author Solomon Uriri
 */
public class CelcioustoKelvin {
    static int TC, TB;
    
     public static void main(String[] args) {
        Scanner user = new Scanner( System.in );
     
       
       // prepare the input file
        System.out.print("Please, enter temperature in celcious here to generate the Kelvin equivalent:"+" ");
        TC = user.nextInt();
        TB = (int) (TC+273.15);
        System.out.println(TB+" "+"degree Kelvin"); 
     }
    
}
