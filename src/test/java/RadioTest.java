import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    public void NumberStation() {
        Radio radio = new Radio(9);

        radio.setCurrentStation (9);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void UnderTheBorderNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStation (-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void AboveTheBorderNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStation (10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.nextStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNextStationAboveTheBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldPrevStationInTheBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void maxStation() {
        Radio radio = new Radio(9);

        radio.setCurrentStation(9);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNumberVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume (10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void UnderTheBorderNumberVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume (-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void AboveTheBorderNumberVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume (100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNextVolumeAboveTheBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.nextVolume ();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNextVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.nextVolume ();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldPrevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldPrevVolumeUnderTheVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }



}
