package lections;

public class stringBuilder_use {
    public static void main(String[] args) {
        var start = System.currentTimeMillis();
        //String str = "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 1_000_000; i++) {
            //str += "+";
            sb.append("+");
        }
        
        System.out.printf("Time = " + (System.currentTimeMillis() - start )+ " msc");
    }
}
