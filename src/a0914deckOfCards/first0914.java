package a0914deckOfCards;

import jdk.nashorn.internal.ir.IfNode;

import java.util.*;
import java.util.stream.Collectors;

public class first0914 {
    /*
    WA:[1,1,1,1,2,2,2,2,2,2]
     */
    public boolean hasGroupsSizeX(int[] deck) {
        int len=deck.length;
        if (len<2)
            return false;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<len;i++){
            if (map.containsKey(deck[i])){
                map.put(deck[i],map.get(deck[i])+1);
            }else {
                map.put(deck[i],1);
            }
        }
        map=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldVal,newVal)->oldVal,
                LinkedHashMap::new
        ));
        int x=0;
        for (Map.Entry entry:map.entrySet()){
            int val= (int) entry.getValue();
            if (x==0){
                x= val;
            }
            if (val==x||val%x==0){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
