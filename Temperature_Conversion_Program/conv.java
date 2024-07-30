import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.print("Enter a temperature value: ");
        double temperature = in.nextDouble();
        
        System.out.print("Enter the original unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        String unit = in.next().toUpperCase();
        
double celsius, fahrenheit, kelvin;
        
        switch (unit) {
            case "C":
                celsius = temperature;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                break;
            case "F":
                fahrenheit = temperature;
                celsius = (fahrenheit - 32) * 5/9;
                kelvin = (fahrenheit + 459.67) * 5/9;
                break;
            case "K":
                kelvin = temperature;
                celsius = kelvin - 273.15;
                fahrenheit = (kelvin * 9/5) - 459.67;
                break;
            default:
                System.out.println("Invalid unit entered. Please use C, F, or K.");
                in.close();
                return;
        }
        
        System.out.println("Celsius: " + String.format("%.2f", celsius) + " °C");
        System.out.println("Fahrenheit: " + String.format("%.2f", fahrenheit) + " °F");
        System.out.println("Kelvin: " + String.format("%.2f", kelvin) + "K");
        
        in.close();
    }
}
