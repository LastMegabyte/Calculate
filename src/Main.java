import java.util.Scanner;

class Main {
    public static void main(String[] args)  {
        try { Scanner scan = new Scanner(System.in);
        System.out.println("Enter your arithmetic operation:");
        String input = scan.nextLine();
        String[] operands = input.split("[0-9]+");
        String[] operators = input.split("[/*+-]");
        int result = Integer.parseInt(operators[0]);
        for (int i = 0; i < operators.length; i++) {
            if (operands[i].equals("+")) {
                result += Integer.parseInt(operators[i]);
            } else if (operands[i].equals("-")) {
                result -= Integer.parseInt(operators[i]);
            } else if (operands[i].equals("*")) {
                result *= Integer.parseInt(operators[i]);
            } else if (operands[i].equals("/")) {
                result /= Integer.parseInt(operators[i]);
            }
        } System.out.println(result); }
        catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
        System.err.println("Exception");
    }
    }
}