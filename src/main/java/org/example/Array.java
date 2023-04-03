package org.example;

public class Array {

    int[] modifyArray(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                array[i]++;
                System.out.println(array[i]);
            }
        }
        return null;
    }
}
