
public class Main {
    public static void main(String[] args) {
        ArithmeticOperations arithOperat = new ArithmeticOperations(25, 50);

        System.out.println("Number1: " + arithOperat.number1);
        System.out.println("Number2: " + arithOperat.number2);

        Addition addVar = new Addition();
        System.out.println(addVar.resultOfAddition);

        System.out.println("Is number even: " + addVar.isEven);

    }
    }
