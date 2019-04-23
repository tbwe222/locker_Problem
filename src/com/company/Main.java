package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean[] lockers = new boolean[100];

        for (int i = 0; i <= lockers.length; i++) {
            for (int j = i; j < lockers.length; j+=(i+1)){
                lockers[j] = !lockers[j];
            }
        }
        System.out.print("Lockers that remain open: ");
        for (int i = 0; i < lockers.length; i++){
            if(lockers[i]){
                System.out.print((i+1)+" ");
            }
        }
    }
}
