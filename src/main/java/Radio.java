public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        else {currentStation = 0;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation <=9){
            currentStation = currentStation - 1;
        }
        if (currentStation < 0)  {
            currentStation = 9;
        }
        return currentStation;

    }



    private int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int volumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int volumeDown() {
        if (currentVolume <= 100) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        return currentVolume;

    }


}
