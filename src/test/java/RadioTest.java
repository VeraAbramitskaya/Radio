import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio station = new Radio(10);

        station.setCurrentStation(3);

        Assertions.assertEquals(3, station.getCurrentStation());
    }

    @Test
    public void shouldSetStationLess0() {
        Radio station = new Radio(10);

        station.setCurrentStation(-1);

        Assertions.assertEquals(0, station.getCurrentStation());
    }


    @Test
    public void shouldSetStation10() {
        Radio station = new Radio(10);

        station.setCurrentStation(10);

        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio station = new Radio(10);

        station.setCurrentStation(10);

        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio station = new Radio(10);

        station.setCurrentStation(8);

        Assertions.assertEquals(7, station.prevStation());
    }

    @Test
    public void shouldSetPrevStation0() {
        Radio station = new Radio(10);

        station.setCurrentStation(0);

        Assertions.assertEquals(9, station.prevStation());
    }

    @Test
    public void shouldSetPrevStation9() {
        Radio station = new Radio(10);

        station.setCurrentStation(9);

        Assertions.assertEquals(8, station.prevStation());
    }

    @Test
    public void shouldSetPrevStation10() {
        Radio station = new Radio(10);

        station.setCurrentStation(10);

        Assertions.assertEquals(9, station.prevStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio station = new Radio(10);

        station.setCurrentStation(8);

        Assertions.assertEquals(9, station.nextStation());
    }

    @Test
    public void shouldSetNextStation9() {
        Radio station = new Radio(10);

        station.setCurrentStation(9);

        Assertions.assertEquals(0, station.nextStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(3);

        Assertions.assertEquals(3, volume.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeLess0() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        Assertions.assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume101() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        Assertions.assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentStation(110);

        Assertions.assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeUp() {
        Radio volume = new Radio();

        volume.setCurrentVolume(80);

        Assertions.assertEquals(81, volume.volumeUp());
    }

    @Test
    public void shouldSetVolumeUp100() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        Assertions.assertEquals(100, volume.volumeUp());
    }


    @Test
    public void shouldSetVolumeDown100() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        Assertions.assertEquals(99, volume.volumeDown());
    }

    @Test
    public void shouldSetVolumeDown() {
        Radio volume = new Radio();

        volume.setCurrentVolume(80);

        Assertions.assertEquals(79, volume.volumeDown());
    }

    @Test
    public void shouldSetVolumeDown0() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        Assertions.assertEquals(0, volume.volumeDown());
    }

}
