package com.company;
import java.util.Scanner;
public class practice_loop {
    public static void main(String[] args){
        int i,sum=0;
        Scanner sc = new Scanner(System.in);

        for(i=1;i<11;i++){
            sum+=8*i;
        }
        System.out.println(sum);
    }
}
