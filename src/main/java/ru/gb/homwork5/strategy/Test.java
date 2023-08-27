package ru.gb.homwork5.strategy;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] data = new int[1000];
        for (int i = 0; i < 1000; i++) {
            data[i]=  new Random().nextInt(100000);
        }

       new Thread( ()-> {
            Sorter sorter = new Sorter(new BubbleSortStrategy());
            System.out.println(Arrays.toString(sorter.sort(data)));
        }).start();

        new Thread( ()-> {
            Sorter sorter2 = new Sorter(new InsertsSortStrategy());
            System.out.println(Arrays.toString(sorter2.sort(data)));
        }).start();






    }
}
