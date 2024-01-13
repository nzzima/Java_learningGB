package sem2;

public class sql_json_parse {
    public static void main(String[] args) {
        String sql_req = "select * from students where ";
        String json_info = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(form_where(sql_req, json_info));
    }

    public static String form_where(String request, String json_inf) {
        //System.out.println(json_inf);
        StringBuilder result = new StringBuilder(request);
        String json_new = json_inf.replace("{", "");
        String json_new1 = json_new.replace("}", "");
        String json_new2 = json_new1.replaceAll("\"", "");
        String[] array = json_new2.split(", ");

        for (int i = 0; i < array.length; i++) {
            String[] array_words = array[i].split(":");
            if(array_words[1].equals("null") == false) {
                if (i != 0) {
                    result.append(" and ");
                    result.append(array_words[0]).append(" = ").append("\'" + array_words[1] + "\'");
                }
                else {
                    result.append(array_words[0]).append(" = ").append("\'" + array_words[1] + "\'");
                }
            }
        }
        return result.toString();
    }
}
