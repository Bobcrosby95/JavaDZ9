package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldRadioStation() {
        Radio radio = new Radio();

        radio.setToRadiostation();

        int expected = 9;
        int actual = radio.currentRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldnextRadioStation() {
        Radio radio = new Radio();

        radio.nextRadiostation(8);

        int expected = 9;
        int actual = radio.currentRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldnextRadioStation2() {
        Radio radio = new Radio();

        radio.nextRadiostation(0);

        int expected = 1;
        int actual = radio.currentRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldnextRadioStation3() {
        Radio radio = new Radio();

        radio.nextRadiostation(9);

        int expected = 9;
        int actual = radio.currentRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldnextRadioStation4() {
        Radio radio = new Radio();

        radio.nextRadiostation(10);

        int expected = 0;
        int actual = radio.currentRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldprevRadioStation() {
        Radio radio = new Radio();

        radio.prevRadiostation(9);

        int expected = 8;
        int actual = radio.currentRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldprevRadioStation2() {
        Radio radio = new Radio();

        radio.prevRadiostation(0);

        int expected = 0;
        int actual = radio.currentRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(101);

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume2() {
        Radio radio = new Radio();

        radio.increaseVolume(99);

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume3() {
        Radio radio = new Radio();

        radio.increaseVolume(100);

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.decreaseVolume(0);

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume2() {
        Radio radio = new Radio();

        radio.decreaseVolume(100);

        int expected = 99;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume3() {
        Radio radio = new Radio();

        radio.decreaseVolume(-1);

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
