import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio (int size){
        int maxStation = size-1;
    }
    public Radio (){

    }


    private int currentStation;

    public int nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
        return currentStation;
    }

    public int prevStation() {
        currentStation = currentStation - 1;
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        return currentStation;

    }


    private int currentVolume;

    public int volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        //if (currentVolume >= maxVolume) {
           else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int volumeDown() {
        currentVolume = currentVolume - 1;
        //if (currentVolume <= 100) {
        //currentVolume = currentVolume - 1;
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        return currentVolume;

    }


}
