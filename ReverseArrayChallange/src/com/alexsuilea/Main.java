package com.alexsuilea;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array)); // diferenta intre primul si al doilea reverse este ca la primul
        //creem un nou array folosind "new" si nu este transmis prin referinta ceea ce inseamana ca dupa ce folosim
        //metoda reverse primul array nu se mai modifica.
    }

    private static void reverse(int[] array){
        int[] newArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            newArray[i] = array[i];
        }

        boolean flag = true;
        while(flag){
            flag = false;
            for(int i=0; i<newArray.length-1; i++){
                if(newArray[i] < newArray[i+1]){
                    int aux = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = aux;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

//    private static void reverse(int[] array){
//        boolean flag = true;
//        while(flag){
//            flag = false;
//            for(int i=0; i<array.length-1; i++){
//                if(array[i] < array[i+1]){
//                    int aux = array[i];
//                    array[i] = array[i+1];
//                    array[i+1] = aux;
//                    flag = true;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
}
