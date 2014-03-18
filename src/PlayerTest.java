import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.Assert.*;

/**
 * Created by david on 3/17/14.
 */
public class PlayerTest {

    private Player player = null;
    @Before
    public void setUp() throws Exception {
        player = new Player("Brown", "David", "Male", new SimpleDateFormat("MM/dd/yyyy").parse("01/29/1951"), "Maroon");
    }

    @Test
    public void testGetLastName() throws Exception {
        assertEquals("Brown", player.getLastName());
    }

    @Test
    public void testCompareTo() throws Exception {
        assertTrue(player.getLastName().compareToIgnoreCase("Smith") < 0);
    }

    @Test
    public void testPlayer() {
        player.setLastName("Smith");
        assertNotSame("Brown", player.getLastName());
        assertEquals("David", player.getFirstName());
        assertEquals("Male", player.getGender());
        assertEquals("01/29/1951", new SimpleDateFormat("MM/dd/yyyy").format(player.getDob()));
        assertEquals("Maroon", player.getFavColor());
    }
}
