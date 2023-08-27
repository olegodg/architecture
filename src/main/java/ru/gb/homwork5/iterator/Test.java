package ru.gb.homwork5.iterator;

public class Test {
    public static void main(String[] args) {
        StationList stationList = new StationList();

        stationList.addStation(new RadioStation(90.5));
        stationList.addStation(new RadioStation(100.5));
        stationList.addStation(new RadioStation(101.7));
        stationList.addStation(new RadioStation(104.3));
        stationList.addStation(new RadioStation(108.9));

        for ( RadioStation station: stationList) {
            System.out.println(station.getFrequency());
        }


        stationList.removeStation(new RadioStation(101.7));

    }
}
