package ru.smarts;

public class Radio {
    static final int MAX_STATION_NUMBER = 9;
    static final int MIN_STATION_NUMBER = 0;
    static final int MAX_VOLUME= 10;
    static final int MIN_VOLUME= 0;

    private int stationNumber;
    private int volume;

    public Radio(int stationNumber, int volume) {
        this.stationNumber = stationNumber;
        this.volume = volume;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    void next() {
        stationNumber = (stationNumber == MAX_STATION_NUMBER) ? MIN_STATION_NUMBER : (stationNumber += 1);
    }

    void prev() {
        stationNumber = (stationNumber == MIN_STATION_NUMBER) ? MAX_STATION_NUMBER : (stationNumber -= 1);
    }

    void increaseVolume() {
        volume = volume == MAX_VOLUME ? volume : (volume += 1);
    }

    void decreaseVolume() {
        volume = volume == MIN_VOLUME ? volume : (volume -= 1);
    }

}
