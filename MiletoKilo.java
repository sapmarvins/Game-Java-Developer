import java.util.Scanner;

/**
 *
 * @author Solomon Uriri
 */
public class MiletoKilo {
    static Double  M,KL;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user = new Scanner( System.in );
        String inputFileName, outputFileName;
       
       // prepare the input file
        System.out.print("Please, enter in Mile to convert to Kilometer:"+ " ");
        M = user.nextDouble();
        KL = M /1.60934;
        System.out.println(KL+" "+"km");
    }
    
}

