public class IfStatementOne {
    public static void main(String[] args) {

        int temperature = 10;
        int freezingPoint = 0;
        char degreeSymbol = 'º';

        if (temperature > 0) {
            System.out.printf("%d%c is above %d%c\n.", temperature, degreeSymbol, freezingPoint, degreeSymbol);
        }

        if (temperature < 0) {
            System.out.printf("%d%c is below %d%c\n.", temperature, degreeSymbol, freezingPoint, degreeSymbol);
        }

        if (temperature == 0) {
            System.out.printf("%d%c is  %d%c\n.", temperature, degreeSymbol, freezingPoint, degreeSymbol);
        }

    }
}