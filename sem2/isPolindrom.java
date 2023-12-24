// 📌 Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

package sem2;

public class isPolindrom {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.err.printf("IsPolindrom: %s\n", is_polindrom(str));
    }

    private static boolean is_polindrom(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return str.equals(result.toString());
    }
}
