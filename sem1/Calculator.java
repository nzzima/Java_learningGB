package sem1;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {
    private static Logger logger = Logger.getLogger(Calculator.class.getName());
    public static void main(String[] args) {
        System.out.print("Enter: ");
        Scanner sc = new Scanner(System.in);
        String request = sc.nextLine();
        String[] operation = request.split(" ");

        switch(operation[1].charAt(0)) {
            case '+':
                Integer sum = Sum(Integer.valueOf(operation[0]), Integer.valueOf(operation[2]));
                System.out.print("Result: " + sum);
                break;
            case '-':
                Integer substract = Substraction(Integer.valueOf(operation[0]), Integer.valueOf(operation[2]));
                System.out.print("Result: " + substract);
                break;
            case '*':
                Integer multi = Multiplication(Integer.valueOf(operation[0]), Integer.valueOf(operation[2]));
                System.out.print("Result: " + multi);
                break;
            case '/':
                Double divis = Division(Double.valueOf(operation[0]), Double.valueOf(operation[2]));
                System.out.print("Result: " + divis);
                break;
        }
        sc.close();
    }

    public static int Sum(int a, int b) {
        int result = a + b;
        try {
            writeLog("Success sum");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int Multiplication(int a, int b) {
        int result = a * b;
        try {
            writeLog("Success multiplication");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static double Division(double a, double b) {
        double result = a / b;
        try {
            writeLog("Success division");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int Substraction(int a, int b) {
        int result = a - b;
        try {
            writeLog("Success substraction");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void writeLog(String msg) throws IOException {
        try {
            Handler fileHandler = new FileHandler("sem1/Calc_log", true);
            logger.addHandler(fileHandler);
            logger.log(Level.INFO, msg);
        } catch (Exception e) {
            System.out.println("Error logging");
        }
    }
}