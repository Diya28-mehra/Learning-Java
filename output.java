import java.util.*;
public class output {
    public static String StringChallenge(String sen){
        String s1="";
        String ls="";
        for (int i=0;i<sen.length();i++){
            if (sen.charAt(i)!=' '){
                s1+=sen.charAt(i);
            }
            else{
                if (s1.length()>ls.length()){
                    ls=s1;
                    s1="";
                }
            }
        }

        return ls;
    }

    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6}};
        System.out.print(arr);
    }
}
