import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        double tempStart = 0.0;
        double tempEnd = 0.0;


        boolean done = false;
        do
        {
            System.out.println("Please enter amount to convert to Fahrenheit: ");
            if(in.hasNextDouble())
            {
                tempStart = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                String trash = in.next();
                System.out.println("You said your temp was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);


        tempEnd = (tempStart * 1.8) + 32;

        System.out.println("The temperature in Fahrenheit is:  " + tempEnd);

    }
}