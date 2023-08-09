import java.util.*;
public class twodarray {
    public static int[] binarysearch(int[][] matrix, int row, int colstart, int colend , int target){
        while (colstart<=colend){
            int mid = colstart + (colend-colstart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            else if (matrix[row][mid]<target){
                colstart=mid+1;
            }else{
                colend=mid-1;
            }
        }
        return new int[]{-1,-1};    
    }
    
    public static int[] search (int matrix[][], int target){
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious, matrix may be empty

        if (rows==1){
            return binarysearch(matrix,0,0,cols-1,target);
        }
        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;

        while(rstart<(rend-1)){
            int mid = rstart+(rend-rstart)/2;
            if (matrix[mid][cmid] == target){
                return new int[]{mid,cmid};
            }
            if (matrix[mid][cmid]<target){
                rstart=mid;
            }
            else{
                rend=mid;
            }
        }
        //now we have two rows
        //check whether the target is in the two cols
        if (matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if (matrix[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }

        // search in 1st half
        if (target<=matrix[rstart][cmid-1]){
            return binarysearch(matrix,rstart,0,cmid-1,target);
        }
        // search in 2nd half
        if (target>=matrix[rstart][cmid+1]){
            return binarysearch(matrix,rstart,cmid+1,cols-1,target);
        }
        // search in 3rd half
        if (target<=matrix[rstart+1][cmid-1]){
            return binarysearch(matrix,rstart+1,0,cmid-1,target);
        }
        // search in 4th half
        else{
            return binarysearch(matrix,rstart+1,cmid+1,cols-1,target);
        }
    }
    public static void main(String[] main){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,6)));
    }
}

    /*static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        while(r<matrix.length && c>=0){
            if (matrix[r][c]==target){
                return new int[]{r,c};
            }
            if (matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int arr[][]={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        System.out.print(Arrays.toString(search(arr,37)));
    }*/

