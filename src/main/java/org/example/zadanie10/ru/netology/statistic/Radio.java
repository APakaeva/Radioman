package org.example.zadanie10.ru.netology.statistic;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {          // задает границы станций
        if (newCurrentRadioStation < 0) {
            return;
        }
        else if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation < 9) { // если нажать на кнопку некст, переключается на след
            currentRadioStation = currentRadioStation + 1;
        }
        else if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) { // если нажать на прев, переключает на предыдущ
            currentRadioStation = currentRadioStation - 1;
        }
        else if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {          // задает границы звука
        if (newCurrentVolume < 0) {
            return;
        }
        else if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void volumePlus() {
        if (currentVolume >= 0 && currentVolume < 10) {                                          // увеличение громкости
            currentVolume = currentVolume + 1;
        }
        else if (currentVolume == 10) {
            currentVolume = 10;
        }
    }

    public void volumeMinus() {
        if (currentVolume <= 10 && currentVolume > 0) {
            currentVolume = currentVolume - 1;                            // уменьшение громкости
        }
        else if (currentVolume == 0) {
            currentVolume = 0;
        }
    }
}





