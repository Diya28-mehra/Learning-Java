import java.util.*;
public class infinitearray {
    public static void main(String[] args){
        int []arr={1,3,46,58,65,71,88,92,97,103};
        int target=92;
        System.out.println(ans(arr,target));
    }

    public static int binarysearch(int arr[],int target, int start , int end){
        while(start<=end){
            int mid = (start+end)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    
    public static int ans(int[] arr, int target){
        //find range
        //first start with a box of 2
        int start=0;
        int end=1;

        //condition for the target
        while (target>arr[end]){
            int newstart=end+1;//temp
            end=end+2*(end-start+1);
            start=newstart;
        }

        return binarysearch(arr,target,start,end);
    }
}










