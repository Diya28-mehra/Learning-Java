import java.util.*;

public class shiftrow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[4][4];
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int k = sc.nextInt();
        sol1(arr,k);
    }


    public static void sol1(int[][] arr, int k){
        for (int row=0;row<arr.length;row++){
            for (int col=k;col<arr.length;col++){
                System.out.print(arr[row][col]+" ");
            }
            for (int col=0;col<k;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
