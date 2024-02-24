public class IcecreamParlor {

    static List<Integer> icecreamParlor(int m, List<Integer> cost) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < cost.size(); i++) {
            int complement = m - cost.get(i);
            if (map.containsKey(complement)) {
                result.add(map.get(complement) + 1);
                result.add(i + 1);
                break;
            }
            map.put(cost.get(i), i);
        }
        
        return result;
    }
