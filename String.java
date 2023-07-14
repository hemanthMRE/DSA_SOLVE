import java.util.*;
public class bsdk{
    public static String subString(String stg, int si, int ei){
        String str = "";
        for(int i=si; i<=ei; i++){
            str += stg.charAt(i) ;
        }
            return str;
    }

    public static void main(String[] args){
    String stg = "hello world";
   // stg.subString(0,5);
   System.out.println(stg.substring(0,7));

    }
}