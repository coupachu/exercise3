import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double fInput = 0;
        do {
            fInput = takeInput();
            if (fInput >= -460) {
                double conversion = convert(fInput);
                System.out.println(display(conversion));
            }
        }
        while (fInput >= -460);
    }
    static double takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("input a temperature in fahrenheit");
        double taken = input.nextInt();
        return taken;
    }
    static double convert(double a){
        double convertedNum = Math.round((a-32)*.5556);
        return convertedNum;
    }
    static String display(double a){
        String myReturn = "That is " + a + " degrees celcius.";
        return myReturn;
    }

}