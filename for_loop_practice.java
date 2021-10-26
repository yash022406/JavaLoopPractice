package com.company;

public class for_loop_practice {
    public static void main(String[] args){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
