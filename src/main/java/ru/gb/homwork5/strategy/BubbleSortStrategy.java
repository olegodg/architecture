package ru.gb.homwork5.strategy;

public class BubbleSortStrategy implements SortStrategy{
    @Override
    public int[] sort(int[] data) {
        long start = System.currentTimeMillis();
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // меняем элементы местами
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        long stop = System.currentTimeMillis()-start;
        System.out.println("Время с использованием пузырьковой сортировки:"+stop);
        return data;
    }
}
