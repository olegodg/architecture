package ru.gb.homwork5.iterator;


import java.util.ArrayList;
import java.util.Iterator;

public class StationList implements Iterable<RadioStation> {
    private ArrayList<RadioStation> stations = new ArrayList<>();
    private int counter = 0;

    public void addStation(RadioStation station) {
        stations.add(station);
    }

    public void removeStation(RadioStation toRemove) {
        double toRemoveFrequency = toRemove.getFrequency();
        stations.removeIf(station -> Double.compare(station.getFrequency(), toRemoveFrequency) == 0);
        System.out.println("Успешно удалена - "+toRemove.getFrequency());
    }

    public int count() {
        return stations.size();
    }

    @Override
    public Iterator<RadioStation> iterator() {
        return new Iterator<RadioStation>() {
            @Override
            public boolean hasNext() {
                return counter < stations.size();
            }

            @Override
            public RadioStation next() {
                if(!hasNext()) {
                    throw new IndexOutOfBoundsException("No more elements");
                }
                return stations.get(counter++);
            }
        };
    }
}