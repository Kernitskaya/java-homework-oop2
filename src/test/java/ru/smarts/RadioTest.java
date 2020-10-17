package ru.smarts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @MethodSource("argumentsNextStationProvider")
    void testNextStation(int stationNumber, int expectedResult) {
        Radio radio = new Radio(stationNumber, 0);
        radio.next();
        assertEquals(expectedResult, radio.getStationNumber());
    }

    static Stream<Arguments> argumentsNextStationProvider() {
        return Stream.of(
                Arguments.of(8, 9),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsPrevStationProvider")
    void testPrevStation(int stationNumber, int expectedResult) {
        Radio radio = new Radio(stationNumber, 0);
        radio.prev();
        assertEquals(expectedResult, radio.getStationNumber());
    }

    static Stream<Arguments> argumentsPrevStationProvider() {
        return Stream.of(
                Arguments.of(1, 0),
                Arguments.of(0, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsIncreaseVolumeProvider")
    void testIncreaseVolume(int volume, int expectedResult) {
        Radio radio = new Radio(0, volume);
        radio.increaseVolume();
        assertEquals(expectedResult, radio.getVolume());
    }

    static Stream<Arguments> argumentsIncreaseVolumeProvider() {
        return Stream.of(
                Arguments.of(9, 10),
                Arguments.of(100, 100)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsDecreaseVolumeProvider")
    void testDecreaseVolume(int volume, int expectedResult) {
        Radio radio = new Radio(0, volume);
        radio.decreaseVolume();
        assertEquals(expectedResult, radio.getVolume());
    }

    static Stream<Arguments> argumentsDecreaseVolumeProvider() {
        return Stream.of(
                Arguments.of(1, 0),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsConstructorProvider")
    void testConstructor(int stationNumber, int volume, int stationCount, int expectedResult) {
        Radio radio = new Radio( stationNumber, volume, stationCount);
        radio.next();
        assertEquals(expectedResult, radio.getStationNumber());
    }

    static Stream<Arguments> argumentsConstructorProvider() {
        return Stream.of(
                Arguments.of(14, 0, 15, 15)
        );
    }

}