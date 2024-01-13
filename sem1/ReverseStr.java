package sem1;

public class ReverseStr {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String result = reverse_str(str);
        System.out.println(result);
    }

    public static String reverse_str(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
