import java.util.*;
public class binarysearch{
    public static int ceiling(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=target){
                return arr[i];
            }
        }
        return -1;
    }

    public static int ceiling2(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];        
    }

    public static int floor(int[] arr, int target){
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]<=target){
                return arr[i];
            }
        }
        return -1;
    }

    public static int floor2(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }

    public static void main(String[] args){
        int arr[]={22,34,55,67,73,85,97};
        int target=40;
        System.out.println(ceiling(arr,target));
        System.out.println(floor(arr,target));
        System.out.println(ceiling2(arr,target));
        System.out.println(floor2(arr,target));
    }
}

