// 📌 Напишите метод, который находит самую длинную строку общего
// префикса среди массива строк.
// 📌 Если общего префикса нет, вернуть пустую строку "".

package sem1;

public class prefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "floght"}; //prefix = fl (for first&second words prefix = flow)
        String prefix = strs[0];
        prefix = getPrefix(strs, prefix);
        System.out.print("Total prefix = " + prefix);
    }

    private static String getPrefix(String[] strs, String prefix) {
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if(prefix.isEmpty()) break;
        }
        return prefix;
    }
}
