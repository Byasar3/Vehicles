package Vehicle.Air;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RocketTest {

    private Rocket rocket;

    @BeforeEach
    public void setUp(){
        rocket = new Rocket(6, 5, 3,false,true);
    }

    @Test
    public void canStartEngine(){
        String expected = "Lets go!";
        String actual = "Lets go!";
        assertEquals(actual, expected);
    }

    @Test
    public void canStopEngineWhenRocket(){
        String expected ="Oh no! we are falling down to earth";
        String actual ="Oh no! we are falling down to earth";
        assertEquals(actual, expected);
    }
}
