package a0039combinationSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class first0039 {
    List<List<Integer>> ans=new LinkedList<>();

    /**
     * 回溯法，首先对于返回值为嵌套list的，需要把返回值定义在函数外
     * 需要定义辅助函数进行回溯
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length<1||target<0)
            return ans;
        List<Integer> tmp=new LinkedList<>();
        combine(0,tmp,candidates,target);
        return ans;
    }

    /**
     * start表示从candidates中选择数字的开始位置，为了避免重复
     * 由于list是引用传递，因此每次回溯完成后需要把最新加入的数字删除
     * @param start
     * @param list
     * @param candidates
     * @param target
     */
    void combine(int start,List<Integer> list,int[] candidates,int target){
        if (target<0)
            return;
        else if (target==0){
            ans.add(new LinkedList<>(list));
            return;
        }else {
            for (int i=start;i<candidates.length;i++){
                list.add(candidates[i]);
                combine(i,list,candidates,target-candidates[i]);
                list.remove(list.size()-1);
            }
        }
    }
}
