package a0049groupAnagrams;

import java.util.*;

import static java.util.Arrays.*;

public class first0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new LinkedList<>();
        Map<String,List<String>> map=new HashMap<>();
        for (String s:strs){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sortS=new String(charArray);
            if (map.containsKey(sortS)){
                map.get(sortS).add(s);
            }else {
                List<String> list=new LinkedList<>();
                list.add(s);
                map.put(sortS,list);
            }
        }
        Set<Map.Entry<String,List<String>>> set=map.entrySet();
        for (Map.Entry<String,List<String>> s:set){
            ans.add(s.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        char[] ch=new char[]{'a','z','f'};
        System.out.println(ch);
        sort(ch);
        System.out.println(ch);
        String s=new String(ch);
        System.out.println(s);
    }
}
