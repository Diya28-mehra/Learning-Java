import java.util.*;
public class selectionsort {

    public static void selection(int[] arr){
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxindex=getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }

    public static int getmaxindex(int[] arr, int start, int end){
        int max=start;
        for (int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args){
        int arr[]={42,423,32,14,224};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }
}
