package a0466countRepetitions;

import java.util.HashMap;
import java.util.Map;

public class second0466 {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int s1Cnt=0,s2Cnt=0,p=0;
        Map<Integer,int[]> map=new HashMap<>();
        while (s1Cnt<n1){
            for (int i=0;i<s1.length();i++){
                if (s1.charAt(i)==s2.charAt(p)){
                    p++;
                    if(p==s2.length()){
                        p=0;
                        s2Cnt++;
                    }
                }
            }
            s1Cnt++;
            if (!map.containsKey(p)){
                map.put(p,new int[]{s1Cnt,s2Cnt});
            }else{
                int[] last=map.get(p);
                int loop1=s1Cnt-last[0];
                int loop2=s2Cnt-last[1];
                s2Cnt+=loop2*((n1-s1Cnt)/loop1);
                s1Cnt=s1Cnt+((n1-s1Cnt)/loop1)*loop1;
            }
        }
        return s2Cnt/n2;
    }
}
