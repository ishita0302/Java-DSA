//import java.util.*;
public class ReverseString {
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("hello world");   //sc.nextLine();
        for(int i=0;i<str.length()/2;i++){
            int front = i;
            int back = str.length()-1-i;
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);
            str.setCharAt(front,backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);
    }
}
