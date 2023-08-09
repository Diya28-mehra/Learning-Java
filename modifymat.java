import java.util.*;
public class modifymat {
    public static void main(String[] ans){
        Scanner sc = new Scanner(System.in);
        int mat[][]=new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        sol1(mat);
    }

    public static void sol1(int mat[][]){
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if (mat[i][j]==1){
                    replacewithone(mat,i,j);
                }
            }
        }
        replaceminusone(mat);
        showmat(mat);
    }

    public static void replacewithone(int mat[][], int i , int j){
        for (int row=0;row<mat.length;row++){
            if (mat[row][j]!=1){
                mat[row][j]=-1;
            }
        }
        for (int col=0;col<mat.length;col++){
            if (mat[i][col]!=1){
                mat[i][col]=-1;
            }
        }
    }

    public static void replaceminusone(int mat[][]){
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if (mat[i][j]==-1){
                    mat[i][j]=1;
                }
            }
        }
    }

    public static void showmat(int mat[][]){
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
