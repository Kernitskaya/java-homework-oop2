package ru.smarts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Radio {
    static final int MIN_STATION_NUMBER = 0;
    static final int MAX_VOLUME = 100;
    static final int MIN_VOLUME = 0;

    @Getter @Setter
    private int stationNumber;
    @Getter @Setter
    private int volume;
    @Getter @Setter
    private int stationCount = 10;

    public Radio(int stationNumber, int volume) {
        this.stationNumber = stationNumber;
        this.volume = volume;
    }

    public void next() {
        stationNumber = (stationNumber == stationCount) ? MIN_STATION_NUMBER : (stationNumber += 1);
    }

    public void prev() {
        stationNumber = (stationNumber == MIN_STATION_NUMBER) ? stationCount : (stationNumber -= 1);
    }

    public void increaseVolume() {
        volume = volume == MAX_VOLUME ? volume : (volume += 1);
    }

    public void decreaseVolume() {
        volume = volume == MIN_VOLUME ? volume : (volume -= 1);
    }

}
