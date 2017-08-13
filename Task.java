
/**
 * This program is meant to test your knowledge of Methods.
 * 
 * @Daniela Moreno
 * @January 22,2016
 */
public class Task
{
    /**
     * method favorite(): returns ( ( ( (16 * 65 ) + 12 ) * 72 ) / 68 ) - 1
     * 
     * @param  
     * @return     
     */
    public static int favorite() {
        int favoriteNumber = 0;
        favoriteNumber =( ( ( (16 * 65 ) + 12 ) * 72 ) / 68 )- 1;
        return favoriteNumber; // change method body to produce correct answer
    }

    /**
     * method isDateable(): returns whether the second age is dateable for
     * a person of the first age
     * 
     * @param
     * @return 
     */
    public static boolean isDateable(int y1, int y2) {
        int a = y1;
        int b = y2;
        if( b >= ((a / 2) + 7))
            return true;
        else {
            return false;
        }// change method body to product correct answer
    }

    // method piggyBank(): returns what the change is worth in cents
    // write the method body and signature yourself
    public static int piggyBank(int pennies,int nickels,int dimes, int quarters, int halfDollars){
        int totalCents = 0;
        int amountOfPennies = pennies;
        int nickelsInCents = nickels * 5;
        int dimesInCents = dimes * 10;
        int quartersInCents = quarters * 25;
        int halfDollarsInCents = halfDollars * 50;
        totalCents = amountOfPennies + nickelsInCents + dimesInCents + quartersInCents + halfDollarsInCents;
        return totalCents;
    }

    // method wasted(): prints line that is number of wasted gallons of water 
    // write the method body and signature yourself
    public static void wasted(double r, int d){
        int numberOfWastedGallons = 0;
        final int DRIPS_PER_GALLON = 15140;   
        numberOfWastedGallons = ((int)( r * 1440) * d )/ DRIPS_PER_GALLON;
        System.out.println(numberOfWastedGallons + " gallons");

    }

}
