package ru.gb.homwork5.strategy;

public class InsertsSortStrategy implements SortStrategy {
    @Override
    public int[] sort(int[] data) {

        long start = System.currentTimeMillis();
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;
        }
        long stop = System.currentTimeMillis()-start;
        System.out.println("Время сортирвоки с помощью  сортировки вставками:"+stop);

        return data;
}
}
