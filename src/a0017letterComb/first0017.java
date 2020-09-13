package a0017letterComb;

import java.util.ArrayList;
import java.util.List;

public class first0017 {
    public static List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        char[][] dic=new char[10][4];
        dic[2]=new char[]{'a','b','c'};
        dic[3]=new char[]{'d','e','f'};
        dic[4]=new char[]{'g','h','i'};
        dic[5]=new char[]{'j','k','l'};
        dic[6]=new char[]{'m','n','o'};
        dic[7]=new char[]{'p','q','r','s'};
        dic[8]=new char[]{'t','u','v'};
        dic[9]=new char[]{'w','x','y','z'};
        for (int i=0;i<digits.length();i++){
            char[] tmp=dic[digits.charAt(i)-'0'];
            if (ans.isEmpty()){
                for (char ch:tmp)
                    ans.add(String.valueOf(ch));
            }else{
                List<String> tmpList=(List<String>) ((ArrayList<String>) ans).clone();
                for (String str:tmpList){
                    for (char ch:tmp){
                        ans.add(str.concat(String.valueOf(ch)));
                        ans.remove(str);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("29"));
    }
}
