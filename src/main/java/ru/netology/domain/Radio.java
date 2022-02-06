package ru.netology.domain;

public class Radio {

    private int currentStation;// Текущая станция
    private int currentVolume;// Текущая громкость

    public int getCurrentStation() {// геттер норм
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {// Выставить номер станции с условием  диапазонов  станций
        if (currentStation < 0) {
            return;// Ранний выход
        }
        if (currentStation > 9) {
            return;// Ранний выход
        }
        this.currentStation = currentStation;//
    }

    public int next(int currentStation) {// Следующая станция
        if (currentStation == 9) {
            setCurrentStation(currentStation = 0);
        } else {
            this.currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int prev(int currentStation) {// Предыдущ станция
        if (currentStation == 0) {
            setCurrentStation(currentStation = 9);
        } else {
            this.currentStation = currentStation - 1;
        }
        return currentStation;
    }

    public int getCurrentVolume() {// геттер норм
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {// Сеттер на звук
        if (currentVolume < 0) {
            return;// Ранний выход
        }
        if (currentVolume > 10) {
            return;// Ранний выход
        }
        this.currentVolume = currentVolume;//
    }

    public int increaseVolume(int currentVolume) {// Увеличить громкость
        if (this.currentVolume < 10) {
            this.currentVolume = this.currentVolume + 1;
        } else {
            this.currentVolume= this.currentVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume(int currentVolume) {// Уменьшить громкость
        if (this.currentVolume > 0) {
            this.currentVolume = this.currentVolume - 1;
        } else {
            this.currentVolume = this.currentVolume;
        }
        return currentVolume;
    }


}










