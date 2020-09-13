package a0022generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class first0022 {
    public static List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        for (int i=1;i<=n;i++){
            if (ans.isEmpty()){
                ans.add("()");
                continue;
            }
            List<String> tmp=(List<String>) ((ArrayList<String>) ans).clone();
            ans.clear();
            for (String str:tmp){
                for (int j=0;j<=str.length();j++){
                    StringBuffer tmpBuffer=new StringBuffer(str);
                    tmpBuffer.insert(j,"()");
                    String tmpStr = tmpBuffer.toString();
                    if (!ans.contains(tmpStr))
                        ans.add(tmpStr);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(5));
    }
}
