import java.util.*;
public class basic { 
    public static int binarysearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
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
    public static void main(String[] args){
        int arr[]= {1,24,35,56,78,94,100,200,300};
        int target=100;
        System.out.print(binarysearch(arr,target));
    }
}


/*
 * 
 */
/*
 * public static int[] search(int arr[][],int target){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    } 

    public static void main(String[] args){
        int arr[][]={
            {23,4,1},
            {2,55,56,43,23},
            {21,45,76},
            {18,12}
        };
        int target=12;
        int ans[]=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
 */

/*
   //minimum value
 * public static int minelement(int arr[]){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
   public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int arr[]=new int[n];
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print(minelement(arr));
 */
/*
 *  Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int arr[]=new int[n];
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int start=sc.nextInt();
    int end=sc.nextInt();
    int target=sc.nextInt();
    System.out.println(linearsearch(arr,target,start,end));
   }

   public static int linearsearch(int[] arr, int target, int start, int end){
    if (arr.length==0){
        return-1;
    }
    for (int index=start;index<end;index++){
        int ele=arr[index];
        if  (ele==target){
            return index;
        }
    }
    return -1;
   }
 */

/*  //Search in string
 *  public static void main(String[] args){
        String name="Diya Mehra";
        char target='e';
        System.out.println(search1(name,target));
        System.out.println(search2(name,target));

    }

    public static boolean search2(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (char ch: str.toCharArray()){
            if (ch==target){
                return true;
            }
        }
        return false;
    }

    public static boolean search1(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
 */

/*      //linear search
 *      Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int idx=-1;
        int digit=in.nextInt();
        for (int i=0;i<n;i++){
            if (digit==a[i]){
                idx=i;
                break;
            }
        }
        System.out.print(idx);
        
 */

/*      //Multidimensional Lists
        Scanner sc = new Scanner (System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
        for (int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        //add elements
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.print(list); */
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    Scanner scan=new Scanner (System.in);
// 	    int n=scan.nextInt();
// 	    for (int i=1;i<=n;i++){
// 	        for (int j=1;j<=n;j++){
// 	            System.out.print(n+" ");
// 	        }
// 	        System.out.println();
// 	    }
// 	}
// }
/*      Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
     */


// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		int n=sc.nextInt();
// 		if (n==1){
// 		    System.out.print(0);
// 		}
// 		else if (n==2){
// 		    System.out.print(1);
// 		}
// 		else{
// 		    int a=0;
// 		    int b=1;
// 		    int c=0;
// 		    for (int i=3;i<=n;i++){
// 		        c=a+b;
// 		        a=b;
// 		        b=c;
// 		    }
// 		    System.out.print(c);
// 		}
// 	}
// }





// import java.util.Scanner;
// public class basic{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int e=0,o=0;
//         for (int i=1;i<=10;i++){
//             int n=sc.nextInt();
//             if (n%2==0){
//                 e+=1;
//             }
//             else{
//                 o+=1;
//             }
//         }
//         System.out.print(e+" "+o);
//     }
// }



// import java.util.Scanner;
// public class basic {
//     public static void main(String[] args){
//         int ans='a';
//         System.out.println(ans);
//     }

// }


// import java.util.Scanner;

// public class basic{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String a=sc.next();
//         String b=sc.next();
//         char c=a.charAt(4);
//         if (c=='h'){
//             if (a.equals(b)){
//                 System.out.print("Stings are equal");
//             }
//             else{
//                 System.out.print("Strings are not equal");
//             }
//         }
//         else{
//             int ans=a.compareTo(b);
//             if (ans>0){
//                 System.out.print(a);
//             }
//             else{
//                 System.out.print(b);
//             }
//         }
//         sc.close();
//     }
// }

// public class basic {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();
        
//         System.out.println("Hello, " + name + "!");
//     }
// }
