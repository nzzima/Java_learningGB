// 📌 Напишите метод, который сжимает строку.
// 📌 Пример: вход aaaabbbcdd.
// результат a4b3c1d2.

package sem2;

public class CompressString {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        String result = compressString(str);
        System.out.println(result);
    }

    private static String compressString(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == currentChar) {
                count++;
            }
            else {
                result.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        result.append(currentChar).append(count); //For count last char in str
        return result.toString();
    }
    
}
