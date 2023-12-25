package sem1;

public class Calculator {
    public static void main(String[] args) {
        int res = Calc('/', 5, 6);
        System.out.println(res);
    }

    public static int Calc(char op, int a, int b) {
        int result = 0;
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
        }
        return result;
    }
}
