import java.util.Scanner;

/**
 *
 * @author Solomon Uriri
 */
public class KelvintoCelcious {

    /**
     * @param args the command line arguments
     */
    static int  TK, T;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user = new Scanner( System.in );
        String inputFileName, outputFileName;
       
       // prepare the input file
        System.out.print("Please, enter temperature in kelvin here to generate the celcious equivalent"+ " ");
        TK = user.nextInt();
        T = (int) (TK-273.15);
        System.out.println(T+" "+"degree celcious");
    }
    
}
