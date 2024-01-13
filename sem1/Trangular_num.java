package sem1;

import java.util.Scanner;

public class Trangular_num {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = Sum(N);
        int facto = Factorial(N);
        System.out.print("Sum reault = " + sum);
        System.out.print("\nFactorial result = " + facto);
        sc.close();
    }

    public static int Sum(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        return result;
    }

    public static int Factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
