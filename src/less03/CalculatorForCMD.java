package less03;

public class CalculatorForCMD {

    public static void main(String[] args) {

        String operator = args [0];

        int a = Integer.parseInt(args[1]);

        int b =  Integer.parseInt(args[2]);

        switch (operator) {
            case "add":
                System.out.println(Math.addExact(a, b));
                break;
            case "subtraction":
                System.out.println(Math.subtractExact(a, b));
                break;
            case "multiply":
                System.out.println(Math.multiplyExact(a, b));
                break;
            case "divide":
                double div = (double) a / b;
                System.out.println(div);
                break;
        }
    }

}
