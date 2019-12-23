import sun.reflect.generics.tree.Tree;

import java.awt.geom.FlatteningPathIterator;
import java.io.IOException;
import java.util.*;

public class Main {

    /**
     * T1 两数相加问题
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if (hm.containsKey(target-nums[i])){
                res[1]=i;
                res[0]=hm.get(target-nums[i]);
            }
            hm.put(nums[i],i);
        }
        return res;
    }
    /**
     * T20 括号合法问题
     */
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<Character>();
        char[] c=s.toCharArray();
        if (s.length()==0)
            return true;
        for (int i=0;i<c.length;i++){
            if (c[i]=='('||c[i]=='{'||c[i]=='[')
                st.push(c[i]);
            else if (st.empty())
                return false;
            else if(c[i]==')'){
                if(st.peek()=='(')
                    st.pop();
                else
                    return false;
            }else if(c[i]=='}'){
                if(st.peek()=='{')
                    st.pop();
                else
                    return false;
            }else if(c[i]==']'){
                if(st.peek()=='[')
                    st.pop();
                else
                    return false;
            }
        }
        if (st.empty())
            return true;
        else
            return false;
    }
    public static boolean isValid_a(String s){
        Stack<Character> st=new Stack<>();
        if (s.length()==0)
            return true;
        for (char c:s.toCharArray()){
            switch (c){
                case '(':
                case '{':
                case '[':
                    st.push(c);
                    break;
                case ')':
                    if (st.empty()||st.peek()!='(')
                        return false;
                    st.pop();
                    break;
                case '}':
                    if (st.empty()||st.peek()!='{')
                        return false;
                    st.pop();
                    break;
                case ']':
                    if (st.empty()||st.peek()!='[')
                        return false;
                    st.pop();
                    break;
            }
        }
        return st.empty();
    }
    /**
     * T21 合并排序链表问题
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x;}
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3=null;
        if (l1==null)
            return l2;
        if(l2==null)
            return l1;
        if (l1.val<=l2.val){
            l3=new ListNode(l1.val);
            l1=l1.next;
        }else{
            l3=new ListNode(l2.val);
            l2=l2.next;
        }
        ListNode h=l3;
        while (l1!=null||l2!=null){
            if (l1==null){
                l3.next=l2;
                l2=l2.next;
                l3=l3.next;
            }
            else if (l2==null){
                l3.next=l1;
                l1=l1.next;
                l3=l3.next;
            }
            else if (l1.val<=l2.val){
                l3.next=new ListNode(l1.val);
                l1=l1.next;
                l3=l3.next;
            }else{
                l3.next=new ListNode(l2.val);
                l2=l2.next;
                l3=l3.next;
            }
        }
        return h;
    }
    public static ListNode mergeTwoLists_a(ListNode l1,ListNode l2){
        if (l1==null)
            return l2;
        if (l2==null)
            return l1;
        if (l1.val<=l2.val) {
            l1.next = mergeTwoLists_a(l1.next, l2);
            return l1;
        }else{
            l2.next=mergeTwoLists_a(l1,l2.next);
            return l2;
        }
    }
    /**
     * T53 最大子串问题
     */
    public static int maxSubArray(int[] nums) {
        int Csum,Msum;
        Csum=0;
        Msum=nums[0];
        for (int i=0;i<nums.length;i++)
        {
            Csum+=nums[i];
            Csum=Csum>nums[i]?Csum:nums[i];
            Msum=Msum>Csum?Msum:Csum;
        }
        return Msum;
    }
    /**
     * T70 爬楼梯问题
     */
    public static int climbStairs(int n) {
        if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else
            return climbStairs(n-2)+climbStairs(n-1);
    }
    public static int climbStairs_a(int n){
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2];
        return dp[n];
    }
    /**
     * T101 对称二叉树问题
     */
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static boolean isSymmetric(TreeNode root) {
        if (root==null||(root.left==null&&root.right==null))
            return true;
        if (root.left==null||root.right==null)
            return false;
        return isSymm(root.left,root.right);
    }
    public static boolean isSymm(TreeNode left,TreeNode right){
        if ((left==null&&right!=null)||(left!=null&&right==null))
            return false;
        if (left.left==null&&right.right==null&&left.right==null&&right.left==null)
            return left.val==right.val;
        if (left.left==null&&right.right==null) {
            if (left.val == right.val)
                return isSymm(left.right, right.left);
            else
                return false;
        }
        if (left.right==null&&right.left==null) {
            if (left.val == right.val)
                return isSymm(left.left, right.right);
            else
                return false;
        }
        if (left.val==right.val&&isSymm(left.left,right.right)&&isSymm(left.right,right.left))
            return true;
        else
            return false;
    }
    public static boolean isSymmetric_a(TreeNode root){
        return isMirror(root,root);
    }
    public static boolean isMirror(TreeNode tn1,TreeNode tn2){
        if (tn1==null&&tn2==null)return true;
        if (tn1==null||tn2==null)return false;
        else return (tn1.val==tn2.val)&&isMirror(tn1.left,tn2.right)&&isMirror(tn1.right,tn2.left);
    }
    /**
     * T104 二叉树最大深度
     */
    public static int maxDepth(TreeNode root){
        if (root==null)
            return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    /**
     * T121 买卖股票问题
     */
    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
    public static int maxProfit_a(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<minPrice)
                minPrice=prices[i];
            else if(prices[i]-minPrice>maxProfit)
                maxProfit=prices[i]-minPrice;
        }
        return maxProfit;
    }
    /**
     * T136 只出现一次的数字问题
     */
    public static int singleNumber(int[] nums) {
        int n=0;
        for (int i=0;i<nums.length;i++)
            n^=nums[i];
        return n;
    }
    /**
     * T141 判断是否有环
     */
    public static boolean hasCycle(ListNode head) {
        if (head==null||head.next==null)
            return false;
        ListNode fast=head.next.next,slow=head.next;
        while (fast!=null&&slow!=null&&fast.next!=null){
            if (fast.val==slow.val)
                return true;
            fast=fast.next.next;
            slow=slow.next;
        }
        return false;
    }
    public static boolean hasCycle_a(ListNode head){
        if (head==null||head.next==null)
            return false;
        ListNode fast=head.next;
        ListNode slow=head;
        while (fast!=slow){
            if (fast==null||fast.next==null)
                return false;
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
    /**
     * T155 最小栈问题
     */
    static class MinStack {
        ArrayList<Integer> s;
        /** initialize your data structure here. */
        public MinStack() {
            s=new ArrayList<>();
        }

        public void push(int x) {
            s.add(x);
        }

        public void pop() {
            s.remove(s.size()-1);
        }

        public int top() {
            return s.get(s.size()-1);
        }

        public int getMin() {
            int min=Integer.MAX_VALUE;
            for (int i=0;i<s.size();i++){
                if (min>s.get(i))
                    min=s.get(i);
            }
            return min;
        }
    }
    class MinStack_a {
        int min = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<Integer>();
        public void push(int x) {
            // only push the old minimum value when the current
            // minimum value changes after pushing the new value x
            if(x <= min){
                stack.push(min);
                min=x;
            }
            stack.push(x);
        }

        public void pop() {
            // if pop operation could result in the changing of the current minimum value,
            // pop twice and change the current minimum value to the last minimum value.
            if(stack.pop() == min) min=stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }
    /**
     * T160 两链表交叉问题
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode B=headB;
        for (;headA!=null;headA=headA.next){
            headB=B;
            for (;headB.next!=null;headB=headB.next){
                if (headA==headB)
                    return headA;
            }
        }
        return null;
    }
    public static ListNode getIntersectionNode_a(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while( a != b){
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }
        return a;
    }

    /**
     * T169 找到出现最多的元素的问题
     */
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i:nums){
            if (hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else
                hm.put(i,1);
        }
        Iterator it=hm.entrySet().iterator();
        while (it.hasNext()){
            HashMap.Entry m=(HashMap.Entry)it.next();
            Integer key=(Integer) m.getKey();
            Integer value=(Integer)m.getValue();
            if (value>nums.length/2)
                return key;
        }
        return 0;
    }
    public static int majorityElement_a(int[] nums){
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    /**
     * T198 抢劫房屋问题
     */
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        System.arraycopy(nums,0,dp,0,nums.length);
        if (nums.length==1)
            return nums[0];
        dp[1]=Math.max(dp[0],nums[1]);
        for (int i=2;i<nums.length;i++)
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        return dp[nums.length-1];
    }

    /**
     * T206 反向链表问题
     */
    public static ListNode reverseList_a(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    /**
     * T226 反转二叉树问题
     */
    public static TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        else{
            TreeNode left=invertTree(root.left);
            TreeNode right=invertTree(root.right);
            root.left=right;
            root.right=left;
            return root;
        }
    }

    /**
     * T234 链表回文问题
     */
    public static boolean isPalindrome(ListNode head) {
        if (head==null)
            return true;
        int len=0;
        ListNode h=head;
        Stack<ListNode> st=new Stack<>();
        while (head!=null){
            len++;
            head=head.next;
        }
        head=h;
        for (int i=0;i<len/2;i++){
            st.push(head);
            head=head.next;
        }
        head=len%2==0?head:head.next;
        for (int i=0;i<len/2;i++){
            if (head.val!=st.pop().val)
                return false;
            head=head.next;
        }
        return true;

    }

    /**
     * T283 移动0问题
     */
    public static void moveZeroes(int[] nums) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                for (int j=i+1;j<nums.length;j++){
                    if(nums[j]!=0) {
                        nums[i] = nums[j];
                        nums[j]=0;
                        break;
                    }
                }
            }
        }
    }

    /**
     * T437 计算树路径和问题
     */
    public static int pathSum(TreeNode root, int sum) {
        if (root==null)
            return 0;
        return pathFrom(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    public static int pathFrom(TreeNode root,int sum){
        if (root==null)
            return 0;
        return (root.val==sum?1:0)+pathFrom(root.left,sum-root.val)+pathFrom(root.right,sum-root.val);
    }

    /**
     * T438 寻找字符串中字谜的问题
     */
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        if (s.length()<p.length())
            return result;
        HashMap<Character,Integer> hm=new HashMap<>();
        for (char c:p.toCharArray())
            hm.put(c,hm.getOrDefault(c,0)+1);
        int counter=hm.size();
        int begin=0,end=0;
        while (end<s.length()){
            char c=s.charAt(end);
            if (hm.containsKey(c)){
                hm.put(c,hm.get(c)-1);
                if (hm.get(c)==0)
                    counter--;
            }
            end++;

            while (counter==0){
                char tempc=s.charAt(begin);
                if (hm.containsKey(tempc)){
                    hm.put(tempc,hm.get(tempc)+1);
                    if (hm.get(tempc)>0)
                        counter++;
                }
                if (end-begin==p.length())
                    result.add(begin);
                begin++;
            }
        }
        return result;
    }

    /**
     * T448 返回数组中未出现的元素
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<Integer>();
        Set<Integer> set=new HashSet<>();
        for (int i=1;i<=nums.length;i++){
            set.add(i);
        }
        for (int i=0;i<nums.length;i++){
            if (set.contains(nums[i]))
                set.remove(nums[i]);
        }
//        for (int i=0;i<nums.length;i++){
//            if (!Arrays.asList(nums).contains(i+1))
//                result.add(i+1);
//        }
        return new ArrayList<>(set);
    }

    /**
     * 汉明距离
     */
    public static int hammingDistance(int x, int y) {
        int n=0;
        int[] xx=toBin(x);
        int[] yy=toBin(y);
        for (int i=0;i<32;i++)
            n=xx[i]==yy[i]?n:n+1;
        return n;
    }
    public static int[] toBin(int n){
        int[] bin=new int[32];
        for (int i=31;i>=0;i--)
            bin[31-i]=n>>>i&1;
        return bin;
    }

    /**
     * T538 二叉查找树转换
     */
    public static TreeNode convertBST(TreeNode root) {
        HashSet<Integer> set=new HashSet<>();
        preOrder(root,set);
        addVal(root,set);
        return root;
    }
    public static void preOrder(TreeNode root,HashSet s){
        if (root==null)
            return;
        s.add(root.val);
        preOrder(root.left,s);
        preOrder(root.right,s);
    }
    public static void addVal(TreeNode root,HashSet s){
        if (root==null)
            return;
        int val=root.val;
        for (Object i:s)
            root.val+=((Integer)i>val?(Integer)i:0);
        addVal(root.left,s);
        addVal(root.right,s);
    }

    /**
     * T543 二叉树直径
     */
    static int ans;
    public static int diameterOfBinaryTree(TreeNode root) {
        ans=1;
        depth(root);
        return ans-1;
    }
    public static int depth(TreeNode root){
        if (root==null)
            return 0;
        int l=depth(root.left);
        int r=depth(root.right);
        ans=Math.max(ans,l+r+1);
        return Math.max(l,r)+1;
    }

    /**
     * T572 另一树的子树问题
     */
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        return traverse(s,t);
    }
    public static boolean isIdentical(TreeNode s,TreeNode t){
        if (s==null&&t==null)
            return true;
        if (s==null||t==null)
            return false;
        return (s.val==t.val)&&isIdentical(s.left,t.left)&&isIdentical(s.right,t.right);
    }
    public static boolean traverse(TreeNode s,TreeNode t){
        return s!=null&&(isIdentical(s,t)||traverse(s.left,t)||traverse(s.right,t));
    }

    class Solution {
//        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        }

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res=new ArrayList<>();
            for (int i:nums){

            }
            return res;
        }
    }

    public static void main(String[] args) throws IOException {
        TreeNode tn1=new TreeNode(2);
        TreeNode tn2=new TreeNode(1);
        tn1.right=new TreeNode(1);
        if (isSubtree(tn1,tn2))
            System.out.println("yes");
    }
}
