import java.util.*;

public class MapSorting {
    static HashMap<String, Integer> sorting(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        HashMap<String, Integer> result = new LinkedHashMap<String, Integer>();
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // TODO Auto-generated method stub
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        for (Map.Entry<String, Integer> m : list) {
            result.put(m.getKey(), m.getValue());
        }

        return result;
    }

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("shramana", 10);
        map.put("das", 556);
        map.put("disha", 100);
        map.put("rima", 9);
        map.put("puchku", 50);

        Map<String, Integer> sortedMap = sorting(map);
        for (Map.Entry<String, Integer> m : sortedMap.entrySet()) {
            System.out.println("Key: " + m.getKey() + "  " + "Value: " + m.getValue());
        }

    }
}
