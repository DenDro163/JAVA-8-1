package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void testSetStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        int expected = 7;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStationUnderLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStationOverLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test

    public void testNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(6);
        rad.next(rad.getCurrentStation());
        int expected = 7;
        int actual = rad.next(rad.getCurrentStation());
        assertEquals(expected, actual);
    }

    @Test
    public void testNextStationAfterMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next(rad.getCurrentStation());
        int expected = 0;
        int actual = rad.next(rad.getCurrentStation());
        assertEquals(expected, actual);
    }

    @Test

    public void testPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(6);
        rad.prev(rad.getCurrentStation());
        int expected = 5;
        int actual = rad.prev(rad.getCurrentStation());
        assertEquals(expected, actual);
    }

    @Test

    public void testPrevStationLessMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev(rad.getCurrentStation());
        int expected = 9;
        int actual = rad.prev(rad.getCurrentStation());
        assertEquals(expected, actual);
    }

    @Test
    public void testSetVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.increaseVolume(rad.getCurrentVolume());
        int expected = 8;
        int actual = rad.increaseVolume(rad.getCurrentVolume());
        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeAboveLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume(rad.getCurrentVolume());
        int expected = 10;
        int actual = rad.increaseVolume(rad.getCurrentVolume());
        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(6);
        rad.decreaseVolume(rad.getCurrentVolume());
        int expected = 5;
        int actual = rad.decreaseVolume(rad.getCurrentVolume());
        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume(rad.getCurrentVolume());
        int expected = 0;
        int actual = rad.decreaseVolume(rad.getCurrentVolume());
        assertEquals(expected, actual);
    }
}