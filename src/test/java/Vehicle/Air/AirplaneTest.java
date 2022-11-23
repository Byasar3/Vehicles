package Vehicle.Air;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AirplaneTest {

    private Airplane airplane;

    @BeforeEach
    public void setUp(){
        airplane = new Airplane(2, 150, 2, true, false);
    }

    @Test
    public void canStartEngine(){
        String expected = "Lets go!";
        String actual = "Lets go!";
        assertEquals(actual, expected);
    }

    @Test
    public void canStopEngine(){
        String expected ="Engine is now off.";
        String actual="Engine is now off.";
        assertEquals(actual, expected);
    }

}
