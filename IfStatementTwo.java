import java.util.Scanner;

public class IfStatementTwo {
    public static void main(String[] args) {

        int temperature;
        int freezingPoint = 0;
        char degreeSymbol = 'º';

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current temperature: ");

        temperature = scanner.nextInt();

        if (temperature > 0) {
            System.out.printf("%d%c is above freezing (%d%c).\n", temperature, degreeSymbol, freezingPoint, degreeSymbol);
        } else if (temperature < 0) {
            System.out.printf("%d%c is below freezing (%d%c).\n", temperature, degreeSymbol, freezingPoint, degreeSymbol);
        } else {
            System.out.printf("%d%c is freezing (%d%c).\n", temperature, degreeSymbol, freezingPoint, degreeSymbol);
        }
    }
}