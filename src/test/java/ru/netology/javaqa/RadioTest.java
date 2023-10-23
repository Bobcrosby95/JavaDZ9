package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void VolumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        radio.increaseVolume();
        int expected = 21;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(35);
        radio.decreaseVolume();
        int expected = 34;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadiostationIncrease() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.increaseRadiostation();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadiostationDecrease() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.decreaseRadiostation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeDecreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadiostationIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.increaseRadiostation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadiostationDecreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadiostation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadiostationBoundary() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadiostationBoundary2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.increaseRadiostation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadiostationBoundaryNegative() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeBoundaryNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeIncreaseBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
