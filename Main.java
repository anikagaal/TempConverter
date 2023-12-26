/* 
 * Program by: Anika Gaal
 * Created on: November 28, 2023
 * Last edited: November 30, 2023
 * Description: Intended to convert input temperature between Celsius, Fahrenheit, and Kelvin.
 */
import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {

        String tempMessage = "Please enter the current temperature: ";
        String scaleMessage = "Please enter the temperature scale: ";

        Equations calc = new Equations();
        
        Scanner keyboard = new Scanner(System.in);

        calc.setTemperature(User.inputDouble(tempMessage));

        System.out.print("Please enter the temperature scale: ");
        calc.convertTemperature(keyboard.next()).toLowerCase();

        System.out.print("Program by Anika Gaal");
        
    }
}
