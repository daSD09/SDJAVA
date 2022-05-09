import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertList {
    static String[] convertToArray(List<String> list) {
        String[] arr = list.toArray(new String[0]);
        return arr;
    }

    static List<String> convertToList(String[] arr) {
        List<String> list = Arrays.asList(arr);
        return list;
    }

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("shramana");
        list.add("rima");
        list.add("disha");
        list.add("puchku");
        int size = list.size();

        String[] arr = convertToArray(list);
        for (String s : arr) {
            System.out.println(s);
        }

        List<String> list2 = convertToList(arr);
        System.out.println(list2);

    }

}
