/* 
 * Program by: Anika Gaal
 * Created on: November 28, 2023
 * Last edited: November 28, 2023
 * Description: Intended to convert input temperature between Celsius, Fahrenheit, and Kelvin.
 */

 /*
  * F = (9/5)*celsius + 32
  * F = (kelvin - 273.15)(9/5) + 32
  * C = 5/9(fahrenheit - 32)
  * C = kelvin - 273.15
  * K = celsius + 273.15
  * K = (F - 32)(5/9) + 273.15
  */
import java.util.Scanner;

  public class Equations {
    private double fahrenheit;
    private double celsius;
    private double kelvin;

    Scanner keyboard = new Scanner(System.in);

    public double getFahrenheit() {
        return fahrenheit;
    }
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getKelvin() {
        return kelvin;
    }
    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }
    public String convertTemperature() {
        String response;
        String message = "";
        boolean isInputBad = true;
        double calcCelsius;
        double calcFahrenheit;
        double calcKelvin;
        response = keyboard.next();
        while (isInputBad) {
            if (response.equalsIgnoreCase("f")) {
                calcCelsius = (5/9)*(fahrenheit-32);
                calcKelvin = calcCelsius + 273.15;
                message = String.format("The current temperature is %.2f Fahrenheit.%nThe temperature in Celsius is: %.2f degrees.%nThe temperature in Kelvin is: %.2f K.", fahrenheit, calcCelsius, calcKelvin);
                // System.out.printf("The temperature in Celsius is: %.2f degrees.", calcCelsius);
                // System.out.printf("The temperature in Kelvin is: %.2f K", calcKelvin);
                isInputBad = false;
            } else if (response.equalsIgnoreCase("c")) {
                calcFahrenheit = (9/5) * celsius + 32;
                calcKelvin = celsius + 273.15;
                message = String.format("The current temperature is %.2f Celsius.%nThe temperature in Fahrenheit is: %.2f degrees.%nThe temperature in Kelvin is: %.2f K.", celsius, calcFahrenheit, calcKelvin);
                isInputBad = false;
            } else if (response.equalsIgnoreCase("k")) {
                calcCelsius = kelvin - 273.15;
                calcFahrenheit = (kelvin - 273.15)*(9/5) + 32;
                message = String.format("The current temperature is %.2f K.%nThe temperature in Celsius is: %.2f degrees.%nThe temperature in Fahrenheit is: %.2f degrees.", kelvin, calcCelsius, calcFahrenheit);
                isInputBad = false;
            } else {
                System.out.println("Please enter a valid temperature scale: ");
                isInputBad = true;
            } 
        }
            return message;
    }
}