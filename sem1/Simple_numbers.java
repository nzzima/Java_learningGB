package sem1;

public class Simple_numbers {
    public static void main(String[] args) {
        PrintSimple();
    }

    public static void PrintSimple() {
        boolean isSimple = true;
        for (int i = 2; i <= 20; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) System.out.println(i);
            isSimple = true;
        }
    }
}
