import java.util.*;
public class cyclicsort {
    static void csort(int[] arr){
        int i=0;
        while(i<arr.length && arr[i] != i + 1){
            int correct =arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap (int arr[], int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int arr[]={229,99,334,13,921};
        csort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
