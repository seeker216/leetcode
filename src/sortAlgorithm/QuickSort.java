package sortAlgorithm;

import java.util.Arrays;

public class QuickSort {

    public static void myQucikSort(int[] A,int l,int r){
        int i=l,j=r;
        if (l>r)
            return;
        int p=A[l];
        while (i<j){
            while (i<j&&A[j]>=p)
                j--;
            while (i<j&&A[i]<=p)
                i++;

            if (i<j){
                int tmp=A[i];
                A[i]=A[j];
                A[j]=tmp;
            }
        }
        A[l]=A[i];
        A[i]=p;
        myQucikSort(A,l,j-1);
        myQucikSort(A,j+1,r);
    }

    public static void main(String[] args) {
        int[] A=new int[]{4,3,1,2};
        myQucikSort(A,0,A.length-1);
        System.out.println(Arrays.toString(A));
    }
}
