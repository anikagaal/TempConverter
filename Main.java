/* 
 * Program by: Anika Gaal
 * Created on: November 28, 2023
 * Last edited: November 28, 2023
 * Description: Intended to convert input temperature between Celsius, Fahrenheit, and Kelvin.
 */
import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
      
        Equations calc = new Equations();
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the current temperature: ");
        calc.setTemperature(keyboard.nextDouble());

        System.out.print("Please enter the temperature scale: ");
        calc.convertTemperature(keyboard.next());

        System.out.print("Program by Anika Gaal");
        
    }
}
