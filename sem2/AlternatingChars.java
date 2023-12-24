// 📌 Дано четное число N (>0) и символы c1 и c2.
// 📌 Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

package sem2;

public class AlternatingChars {
    public static void main(String[] args) {
        int N = 80000;
        char c1 = 'a';
        char c2 = 'b';

        System.out.println("For String: ");
        long start = System.currentTimeMillis();
        alternatingChars(N, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("For StringBuilder: ");
        start = System.currentTimeMillis();
        alternatingCharsSb(N, c1, c2);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static String alternatingChars (int N, char c1, char c2) {
        String str = "";

        for (int i = 0; i < N / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }

        return str;
    }

    public static String alternatingCharsSb (int N, char c1, char c2) {
        StringBuilder sb = new StringBuilder(N);

        for (int i = 0; i < N / 2; i++) {
            sb.append(c1).append(c2);
        }

        return sb.toString();
    }
}
