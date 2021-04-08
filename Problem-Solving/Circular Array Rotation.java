import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int q = in.nextInt();
    int[] a = new int[n];
    for(int a_i=0; a_i < n; a_i++){
        a[a_i] = in.nextInt();
    }
    for(int a0 = 0; a0 < q; a0++){
        int m = in.nextInt();
        System.out.println(a[(n - (k % n)+ m) % n]);
    }               
}
}
