/* 
 * Program by: Anika Gaal
 * Created on: November 28, 2023
 * Last edited: November 30, 2023
 * Description: Intended to convert input temperature between Celsius, Fahrenheit, and Kelvin.
 */

import java.util.Scanner;

  public class Equations {

    private double temperature;
    private String tempType;
    private double calcC;
    private double calcF;
    private double calcK;

    Scanner keyboard = new Scanner(System.in);

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String convertTemperature(String tempType) {
        String response;
        String message = "";
        boolean isInputBad = true;
        double calcCelsius;
        double calcFahrenheit;
        double calcKelvin;
        String cMessage;
        String fMessage;
        String kMessage;  

        while (isInputBad) {
            switch (tempType){
                case "f":
                    calcC = (temperature - 32) * 5/9;
                    calcK = calcC + 273.15;
                    fMessage = String.format("The current temperature is %.2f Fahrenheit%n", temperature);
                    cMessage = String.format("The temperature in Celsius is: %.2f Degrees%n", calcC);
                    kMessage = String.format("The temperature in Kelvin is: %.2f K%n", calcK);
                    message = fMessage + cMessage + kMessage;
                    isInputBad = false;
                    break;
                case "c":
                    calcF = (temperature * 9/5) + 32;
                    calcK = temperature + 273.15;
                    cMessage = String.format("The current temperature is %.2f Celsius%n", temperature);
                    fMessage = String.format("The temperature in Fahrenheit is: %.2f Degrees%n", calcF);
                    kMessage = String.format("The temperature in Kelvin is: %.2f K%n", calcK);
                    message = cMessage + fMessage + kMessage;
                    isInputBad = false;
                case "k":
                    calcC = temperature - 273.15;
                    calcF = (temperature - 273.15)*(9/5) + 32;
                    kMessage = String.format("The current temperature is %.2f K%n", temperature);
                    cMessage = String.format("The temperature in Celsius is: %.2f Degrees%n", calcC);
                    fMessage = String.format("The temperature in Fahrenheit is: %.2f Degrees%n", calcF);
                    message = kMessage + cMessage + fMessage;
                    isInputBad = false;
                default:
                    System.out.println("Please enter a valid temperature scale.");
                    break;
            }
        }        
        /*
        while (isInputBad) {
            if (response.equalsIgnoreCase("f")) {
                calcCelsius = (temperature - 32) * 5/9;
                calcKelvin = calcCelsius + 273.15;
                fMessage = String.format("The current temperature is %.2f Fahrenheit%n", temperature);
                cMessage = String.format("The temperature in Celsius is: %.2f Degrees%n", calcCelsius);
                kMessage = String.format("The temperature in Kelvin is: %.2f K%n", calcKelvin);
                message = fMessage + cMessage + kMessage;
                isInputBad = false;
            } else if (response.equalsIgnoreCase("c")) {
                calcFahrenheit = (temperature * 9/5) + 32;
                calcKelvin = temperature + 273.15;
                cMessage = String.format("The current temperature is %.2f Celsius%n", temperature);
                fMessage = String.format("The temperature in Fahrenheit is: %.2f Degrees%n", calcFahrenheit);
                kMessage = String.format("The temperature in Kelvin is: %.2f K%n", calcKelvin);
                message = cMessage + fMessage + kMessage;
                isInputBad = false;
            } else if (response.equalsIgnoreCase("k")) {
                calcCelsius = temperature - 273.15;
                calcFahrenheit = (temperature - 273.15)*(9/5) + 32;
                kMessage = String.format("The current temperature is %.2f K%n", temperature);
                cMessage = String.format("The temperature in Celsius is: %.2f Degrees%n", calcCelsius);
                fMessage = String.format("The temperature in Fahrenheit is: %.2f Degrees%n", calcFahrenheit);
                message = kMessage + cMessage + fMessage;
                isInputBad = false;
            } else {
                System.out.println("Please enter a valid temperature scale: "); // crash
            } 
        }
        */
        return message;
    }
}