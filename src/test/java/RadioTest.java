import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(3);

        int expected = 3;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLess0() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected =0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStation10() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected =0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio station = new Radio();

        station.setCurrentStation(8);
        //station.prevStation();

        int expected = 7;
        int actual = station.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation0() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        //station.prevStation();

        int expected = 9;
        int actual = station.prevStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStation9() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        //station.prevStation();

        int expected = 8;
        int actual = station.prevStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStation() {
        Radio station = new Radio();

        station.setCurrentStation(8);
        //station.nextStation();

        int expected = 9;
        int actual = station.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation9() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        //station.nextStation();

        int expected = 0;
        int actual = station.nextStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(3);

        int expected = 3;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLess0() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume101() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentStation(110);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUp() {
        Radio volume = new Radio();

        volume.setCurrentVolume(80);
        //volume.volumeUp();

        int expected = 81;
        int actual = volume.volumeUp();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUp100() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);
        //volume.volumeUp();

        int expected = 100;
        int actual = volume.volumeUp();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeDown100() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);
        //volume.volumeDown();

        int expected = 99;
        int actual = volume.volumeDown();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeDown() {
        Radio volume = new Radio();

        volume.setCurrentVolume(80);
        //volume.volumeDown();

        int expected = 79;
        int actual = volume.volumeDown();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeDown0() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        //volume.volumeDown();

        int expected = 0;
        int actual = volume.volumeDown();

        Assertions.assertEquals(expected, actual);
    }

}
