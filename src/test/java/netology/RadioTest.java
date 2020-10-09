package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCreate (){
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getMinStationNumber());
        assertEquals(10, radio.getMaxStationNumber());
        assertEquals(0, radio.getMinSound());
        assertEquals(100, radio.getMaxSound());
        assertEquals(0, radio.getCurrentSound());

    }
}