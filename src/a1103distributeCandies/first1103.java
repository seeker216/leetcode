package a1103distributeCandies;

public class first1103 {
    /**
     * 先算能分几轮完整的，完整的分好，然后再算不能完整分配的那轮
     * @param candies
     * @param num_people
     * @return
     */
    public static int[] distributeCandies(int candies, int num_people) {
        int[] ans=new int[num_people];
        int base=(num_people+1)*num_people/2;
        int sum=0,n=0;
        //第n轮需要n*Math.pow(num_people,2)+base个糖，看足够分几轮完整的。多算了一个1，要减去
        while(sum<=candies){
            sum+=n*Math.pow(num_people,2)+base;
            n++;
        }
        n--;
        //能完整分配的
        for(int i=0;i<num_people;i++){
            int tmp=n*((n-1)*num_people+2*(i+1))/2;
            if (candies>=tmp){
                ans[i]=tmp;
                candies-=tmp;
            }else{
                ans[i]+=candies;
                candies=0;
                break;
            }
        }
        //不能完整分配的
        for(int i=0;i<num_people;i++){
            int num=n*num_people+i+1;
            if(candies>=num){
                candies-=num;
                ans[i]+=num;
            }else{
                ans[i]+=candies;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(distributeCandies(10,3));
    }
}
