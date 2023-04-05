package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Необходимо реализовать следующий метод:
        1. Получаем на входе массив чисел
        2. Все четные числа увеличиваем на единицу
        3. Возвращаем кусок списка с 3-го по 7-й элемент*/

        int[] number = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(modifyArray(number)));


    }

    static int[] modifyArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                array[i]++;
            }

        }
        int[] modifyNumber = new int[5];
        System.arraycopy(array, 2, modifyNumber, 0, 5);
        return modifyNumber;
    }
 }
