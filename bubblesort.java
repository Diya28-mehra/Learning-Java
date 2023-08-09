import java.util.*;
public class bubblesort {
    public static void main(String[] args){
        int[] arr={-4,0,45,-13,40};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

}
