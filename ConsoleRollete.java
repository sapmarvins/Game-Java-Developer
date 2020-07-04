import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Solomon Uriri
 */
public class ConsoleRollete {
 
public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner user = new Scanner( System.in );
        String inputFileName, outputFileName;
      do{ 
       // prepare the input file
        System.out.print("What is your name: ");
        String UserName = user.nextLine().trim();
        //File input = new File( UserName );
        //Scanner scan = new Scanner( input );
         System.out.print("What to bet on? Please, enter number to place bet:"+" ");
        String BetOn = user.nextLine().trim();
        int BetOn1 = Integer.parseInt(BetOn);
        
         System.out.print("Please enter bet amount:");
        Float Amount = user.nextFloat();
        //File input1 = new File( BetOn );
        //Scanner scan = new Scanner( input1 );
   
      
        
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int rand = random.nextInt(1,37);
        System.out.println("Number:"+" "+rand);
      
       
       //String evenOdd = (rand % 2 == 0) ? "even" : "odd";

        //System.out.println(rand + " is " + evenOdd);
      try{
            FileWriter myObj = new FileWriter("PlayersName.txt", true);
            BufferedWriter writer = new BufferedWriter (myObj);
       if(BetOn1>36){
             
             // System.out.println("Odd"+" "+"win"+" "+ss);
              // myObj.write(UserName+" "+"Odd"+" "+"win"+" "+ss);
              // writer.write(UserName+" "+BetOn+" "+ss);
               writer.write("Player:"+UserName+" "+ "Bet:"+BetOn1+" "+"Outcome:"+" "+"Lose"+" "+"Winnings:"+"0.00");
           writer.newLine();
                  }
        else if (rand == BetOn1){
           Float ss = 36 * Amount;
          String outcome = "win";
          //System.out.println(ss+" "+outcome);
           //myObj.write(UserName+" "+BetOn+" "+ss);
           writer.write("Player:"+" "+UserName+" "+ "Bet:"+" "+BetOn+" "+"Outcome:"+" "+"win"+" "+"Winnings:"+" "+ss);
           writer.newLine();
                   }      
        else if(rand % 2 == 0){
              Float ss = 2 * Amount;
              //System.out.println("Even"+" "+"win"+" "+ss);
              // myObj.write(UserName+" "+"Even"+" "+"win"+" "+ss);
              // writer.write(UserName+" "+BetOn+" "+ss);
               //System.out.println("Even"+" "+"win"+" "+ss);
              writer.write("Player:"+" "+UserName+" "+ "Bet:"+" "+"Even"+" "+"Outcome:"+" "+"win"+" "+"Winnings:"+" "+ss);
           writer.newLine();
        }
        else if(rand % 2 != 0){
              Float ss = 2 * Amount;
             // System.out.println("Odd"+" "+"win"+" "+ss);
              // myObj.write(UserName+" "+"Odd"+" "+"win"+" "+ss);
              // writer.write(UserName+" "+BetOn+" "+ss);
               writer.write("Player:"+" "+UserName+" "+ "Bet:"+" "+"Odd"+" "+"Outcome:"+" "+"win"+" "+"Winnings:"+" "+ss);
           writer.newLine();
       }
        
       
        
        
      else {
            System.out.println("Player:"+UserName+" "+ "Bet:"+BetOn+" "+"Outcome:"+" "+"Lose"+" "+"Winnings:"+"0.00");
        }
          
       //myObj.close();
          writer.close();
      }
      
      
    catch (FileNotFoundException e){
    System.out.println("An error occurred.");
      e.printStackTrace();
}
   
        try {
      File myObj = new File("PlayersName.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        System.out.println("Do you want to continue: please enter y for yes or n for no:"+ " ");
        
       
      }
      
      while(user.next().equalsIgnoreCase("y"));
      PrintWriter writer = new PrintWriter("PlayersName.txt");
      writer.print("");
      writer.close();
    }
    
}
