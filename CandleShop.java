import java.util.Scanner;
    public class CandleShop
    {
        public static void main(String[] args) 
        {
//Project 3

// store setup
            Scanner sc = new Scanner(System.in);
//variables for candle types
            int type1,type2,type3;
//display for user input and user input for each candle type scanner
            System.out.println("How many type 1 candles would you like to buy?");
            type1 = sc.nextInt();
            System.out.println("How many type 2 candles would you like to buy?");
            type2 = sc.nextInt();
            System.out.println("How many type 3 candles would you like to buy?");
            type3 = sc.nextInt();
// getter to find out the price of each type of candle
            double totalPrice = 0.0;
// multiply number of candles by their price and sum in the total price
            totalPrice+=( type1 * 1.00 );
            totalPrice+=( type2 * 2.00 );
            totalPrice+=( type3 * 3.00 );
// getter for burn time of each candle with int
            int burnTime = 1;
//burn time multiplied by input of type and price
            burnTime+=( type1 * 9 );
            burnTime+=( type2 * 10 );
            burnTime+=( type3 * 11 );
// cost per minute calculated, multiplying by 60, dividing by burn time
            double eachCandle = (totalPrice/ (burnTime));
            double perMin = (eachCandle * 60);
// display
            System.out.println(type1 + " " + " of the Type 1 candles ");
            System.out.println(type2 + " " + " of the Type 2 candles ");
            System.out.println(type3 + " " + " of the Type 3 candles" );
            
            System.out.println("Total price of candles: " + "$" + totalPrice);
            System.out.println("The total burn time per candle: " + burnTime);
            System.out.println("Cost per minute to burn the candles  " + perMin);
        }
    }