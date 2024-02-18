import java.util.Scanner;

public class Addition {
    Scanner scanner = new Scanner(System.in);
    double dnumber1 = scanner.nextDouble();
    double dnumber2 = scanner.nextDouble();
    double resultOfAddition = addition(dnumber1, dnumber2);
        public static double addition(double number1, double number2){
        double resultAddition = number1 + number2;
        return resultAddition;
    }
    boolean isEven = isEven(resultOfAddition);
        public static boolean isEven (double resultOfAddition){
        boolean isEven = (resultOfAddition % 2) == 0;
        return isEven;
}
}
