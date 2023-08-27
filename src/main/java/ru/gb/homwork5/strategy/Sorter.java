package ru.gb.homwork5.strategy;

public class Sorter { private SortStrategy sorter;

    public Sorter(SortStrategy sorter) {
        this.sorter = sorter;
    }

    public int[] sort(int[] dataset) {
        return sorter.sort(dataset);
    }
}
