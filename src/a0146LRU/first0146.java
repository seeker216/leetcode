package a0146LRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class first0146 {
    class LRUCache {
        int capacity=0;
        Map<Integer,Integer> map=null;
        public LRUCache(int capacity) {
            this.capacity=capacity;
            map=new LinkedHashMap<Integer, Integer>((int) Math.ceil(capacity/0.75f+1),0.75f,true){
                @Override
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    return size() > capacity;
                }
            };
        }

        public int get(int key) {
            if (map.containsKey(key))
                return map.get(key);
            else
                return -1;
        }

        public void put(int key, int value) {
            map.put(key,value);
        }
    }

}
