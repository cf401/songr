package jack.kinne.songr;

import jack.kinne.songr.controllers.HomeController;
import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    HomeController home = new HomeController();
    @Test
    public void reverseTest(){
        String moon = "one two";
        String expected = home.mirror(moon);
        String actual = "two one";
        assertEquals(expected, actual);
    }

}