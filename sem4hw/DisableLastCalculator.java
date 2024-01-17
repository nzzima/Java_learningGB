package sem4hw;

import java.util.Deque;
import java.util.LinkedList;

public class DisableLastCalculator {
    static Deque<Double> deque = new LinkedList<>();
    public static void main(String[] args) {
        double res = calculate('+', 3, 7);
        System.out.println(res);
        double res2 = calculate('+', 4, 7);
        System.out.println(res2);
        double res3 = calculate('<', 0, 0);
        System.out.println(res3);
    }

    public static double calculate(char op, int a, int b) {
        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '<':
                result = deque.element();
            default:
                break;
        }
        deque.add(result);
        return result;
    }
}
