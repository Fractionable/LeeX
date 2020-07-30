/* Jeffery Dixon 
   LeeX Alpaha 
*/
// package to for scanner user input.
import java.util.Scanner;

// Class for holding shoes.
class Items { 
          // Holds prices of jordans 1s 
          public int shoes[][] = {{9, 280},
                                  {7 , 320},
                                  {10, 260}};
}

// Class for shirts array extend items & mehtod for exit message. 
class MoreItems extends Items{
    
      public  int shirts[] = { 90 , 120};
    void Motto(){
        System.out.println("we buy and sell!");
    }
}


// Main class for output.
public class Main
{
  public static void main(String args[])
  { 
     // controls do while loop menu selction  
     int menu;
     
     // do while loop 
     
     do { 
         
     // Decalrign method
     MoreItems mto = new MoreItems();
     
     // Holds user input for menu selction
     int num;
     int num1;
     int num2;
     
     // input for purchases
     int sz;
     int sell;
    
     // shoe inventory 
    Items j1 = new Items();
    
     // Object created for user input
     Scanner in = new Scanner(System.in);

  
     // Menu & Name of program 
     System.out.println("Welcome to LeeX! ");
     // Output message 
     mto.Motto();
     
     System.out.println("1. Buy ");
     
     System.out.println("2. Sell ");
     
     System.out.println("3. Exit ");
     
     // Get User input and output choice
     System.out.println("Enter an menu option: ");
     // Ask user for input selcetion 
     num = in.nextInt();
     // out put user selction
     System.out.println("You picked option: "+num);
     menu = num;
    
     // shoe & item selction
     // menu optios using switch statments.
     switch ( num ){
         // option number 1
         // case allows user to buy items from LeeX inverntory 
         case 1: 
             System.out.println("Select shoe size to buy shoe or number for shirt");
             System.out.println("Avaliable Shoe ");
             System.out.println("Jordan Royal Toe 1's");
             System.out.println("Sz|$");
             // for loop to output multi dimensial array. 
             for(int i = 0; i < 3; i++){
                  for (int j = 0; j < 2; j++)
                 System.out.print( j1.shoes[i][j] + " ");
                 System.out.println();
             }
             // Object decalaration
             Scanner on = new Scanner(System.in);
             System.out.println("----------------------");
             System.out.println("1. Supreme motion logo XL $" + mto.shirts[0]);
             System.out.println("2. Red Camo BAPE shirt  $" + mto.shirts[1]);
             System.out.println("3. Yellow / Green Camo BAPE shirt  $" + mto.shirts[1]);
             // User Input for itmem.
             num1 = on.nextInt();
             sz = num1;
             
             if (num1 == 7){
                 System.out.println("Thank you for purchasing " );
                 System.out.print(j1.shoes[1][1]);
                 System.out.println();
             }
              else if(num1 == 9){
                 System.out.println("Thank you for purchasing " );
                 System.out.print(j1.shoes[0][1]);
                 System.out.println();
             }
             else if (num1 == 10){
                 System.out.println("Thank you for purchasing " );
                 System.out.print(j1.shoes[2][1]);
                 System.out.println();
             }
             else if (num1 == 1)
             {
                 System.out.println("Thank your for purchasing");
                 System.out.println("Supreme motion logo XL $" + mto.shirts[0]);
                 System.out.println();
             }
             else if (num1 == 2)
             {
                 System.out.println("Thank your for purchasing");
                 System.out.println("Red Camo BAPE shirt  $" + mto.shirts[1]);
                 System.out.println();
             }
             if (num1 == 3)
             {
                 System.out.println("Thank your for purchasing");
                 System.out.println("Yellow / Green Camo BAPE shirt  $" + mto.shirts[1]);
                 System.out.println();
             }
             break;
        // option number 2
        // case 2 allows user to sell items listed 
        case 2:
            System.out.println("You picked Sell.");
            System.out.println("Choose a number on what item you have for sell.");
            System.out.println("Price listed is what we buy for!");
            System.out.println("1. Supreme motion logo XL $65.");
            System.out.println("2. BAPE college tee XL $110");
            System.out.println("3. Air Jordan 1 netruel grey sz 7 $250");
            System.out.println("4. Air Jordan 4 Cactus Jack sz 10 $300");
            Scanner jeff = new Scanner(System.in);
            num2 = jeff.nextInt();
            sell = num2;
            if (num2 == 1)
            {
                System.out.println("Thank your for selling item");
                System.out.println("Pay out is $65");
                System.out.println();
            }
            if (num2 == 2)
            {
                System.out.println("Thank your for selling item");
                System.out.println("Pay out is $110");
                System.out.println();
            }
            if (num2 == 3)
            {
                System.out.println("Thank your for selling item");
                System.out.println("Pay out is $250");
                System.out.println();
            }
            if (num2 == 4)
            {
                System.out.println("Thank your for selling item");
                System.out.println("Pay out is $300");
                System.out.println();
            }
            
            break;
        // option number 3
        // case 3 allows user to exit program.
        case 3:
          System.out.println("Thanks for shopping at LeeX");
          System.out.print("Where ");
          mto.Motto();
          System.out.println();
            break;
        }
     }while(menu != 3);
  }
}