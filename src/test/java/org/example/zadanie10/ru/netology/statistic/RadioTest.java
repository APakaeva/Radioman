package org.example.zadanie10.ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void shouldUpVolume1() {
        Radio radio = new Radio();
        int expected = 1;
        radio.upVolume();
        int actual = radio.currentVolume; // повышение звука
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotUpVolume100() {
        Radio radio = new Radio();
        int expected = 100;
        radio.currentVolume = expected; // повысить звук при = 100
        radio.upVolume();
        int actual = radio.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownVolumeFrom1() {
        Radio radio = new Radio();
        int expected = 1;
        radio.currentVolume = 2; // понижение звука
        radio.downVolume();
        int actual = radio.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownVolumeFrom0() {
        Radio radio = new Radio();
        int expected = 0;
        radio.downVolume();
        int actual = radio.currentVolume; // понижение звука при = 0
        assertEquals(expected, actual);
    }

    @Test
    void shouldUpStation() {
        Radio radio = new Radio();
        int expected = 1;
        radio.upStation();
        int actual = radio.getCurrentStation();            //повышение станции
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownStation() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentStation(2);                 //понижение станции
        radio.downStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldAfter9To0Station() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation(9);            //переход вперед от станции = 9
        radio.upStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTransitFrom0To9Station() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentStation(0);
        radio.downStation();
        int actual = radio.getCurrentStation();    //переход назад от станции = 0
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setCurrentStation(expected);     //ввод станции
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationPlusMax() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation(12);
        int actual = radio.getCurrentStation(); //ввод станции больше максимума
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationMinusMin() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation(-12);
        int actual = radio.getCurrentStation(); // ввод станции меньше минимума
        assertEquals(expected, actual);
    }
}
