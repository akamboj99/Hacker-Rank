import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int valeys = 0;
        int level = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='D'){
                if(level==0){
                   valeys++; 
                }
                level--;
            }
            else{
                level++;
            }
            
        }
        System.out.println(valeys);
    }
}
