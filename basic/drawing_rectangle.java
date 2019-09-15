package com.some_package.name;

/* 
Drawing a rectangle

Use the keyboard to enter two numbers m and n.
Using a for loop, display an n x m rectangle made of eights

example: m = 2, n = 4
8888
8888

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br1.readLine());
        
        for(int x = 1; x <= m*n; x++){
            //found the multiple of n
            if(x % n == 0){
                System.out.println(8);
            }else{
                System.out.print(8);
            }
        }
    }
}