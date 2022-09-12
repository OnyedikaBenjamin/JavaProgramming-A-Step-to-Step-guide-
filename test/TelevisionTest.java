import _9_ObjectsAndClasses.Television;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television samsung;

        @BeforeEach
        void setup() {
            samsung = new Television();
        }

        @Test
        @DisplayName("Test that Samsung Television exist")
        public void test1(){
            assertNotNull(samsung);
        }

        @Test
        @DisplayName("Testing that the Television can be turned On")
        public void test2(){
            assertFalse(samsung.isOn());
            samsung.turnOn();
            assertTrue(samsung.isOn());
        }

        @Test
        @DisplayName("Test that Television can be turned off")
        public void test3(){
            assertFalse(samsung.isOn());
            samsung.turnOn();
            assertTrue(samsung.isOn());
            samsung.turnOff();
            assertFalse(samsung.isOn());
        }

    @Test
    @DisplayName("Test that television channel can be changed")
    public void test4(){
        samsung.turnOn();
        samsung.channelUp();
        assertEquals(1, samsung.getChannel());
    }

    @Test
    @DisplayName("Test that channel cannot be manipulated when television is turned off")
    public void test5(){
        samsung.channelUp();
        assertEquals(0, samsung.getChannel());
    }

    @Test
    @DisplayName("Test that channel can be set")
    public void test6(){
        samsung.turnOn();
        samsung.setChannel(5);
        assertEquals(5, samsung.getChannel());
    }
    @Test
    @DisplayName("Test that channel remains same when turned off and turned on")
    public void test7(){
        samsung.turnOn();
        samsung.setChannel(4);
        samsung.turnOff();
        assertFalse(samsung.isOn());

        samsung.turnOn();
        assertTrue(samsung.isOn());
        assertEquals(4, samsung.getChannel());
    }

    @Test
    @DisplayName("Test that Samsung channel can be decreased")
    public void test8(){
        samsung.turnOn();
        samsung.setChannel(5);
        samsung.channelDown();
        assertEquals(4, samsung.getChannel());
    }

    @Test
    @DisplayName("Test that Samsung volume cannot be decreased below 0")
    public void test9(){
        samsung.turnOn();
        samsung.channelDown();
        samsung.channelDown();
        assertEquals(0, samsung.getChannel());
    }
    @Test
    @DisplayName("Test that Samsung channel cannot be increased above 120")
    public void test10(){
        samsung.turnOn();
        for (int i = 0; i < 131; i++) {
            samsung.channelUp();
        }
        assertEquals(120, samsung.getChannel());
    }

    @Test
    @DisplayName("Test that Samsung channel cannot be set more than 120")
    public void test11(){
        samsung.turnOn();
        samsung.channelUp();
        samsung.channelUp();
        samsung.channelUp();

        samsung.setChannel(121);
        assertEquals(3, samsung.getChannel());
    }

    @Test
    @DisplayName("Test that Volume can be increased but not more than 7")
    public void test12(){
        samsung.turnOn();
        samsung.volumeUp();
        assertEquals(1, samsung.getVolumeLevel());

        for (int i = 0; i < 100; i++) {
            samsung.volumeUp();
        }
        assertEquals(7, samsung.getVolumeLevel());
    }

    @Test
    @DisplayName("Test that Volume can be decreased but not more than 0")
    public void test13(){
        samsung.turnOn();
        samsung.volumeDown();
        samsung.volumeDown();
        assertEquals(0, samsung.getVolumeLevel());

        for (int i = 0; i < 100; i++) {
            samsung.volumeDown();
        }
        assertEquals(0, samsung.getVolumeLevel());
    }

    @Test
    @DisplayName("Test that Samsung can be muted and volume returns to previous value after un-muting")
    public void test14(){
        samsung.turnOn();
        assertEquals(0, samsung.getVolumeLevel());

        for (int i = 0; i < 6; i++) {
            samsung.volumeUp();
        }
        assertEquals(6, samsung.getVolumeLevel());
        samsung.mute();
        assertEquals(0, samsung.getVolumeLevel());
        samsung.unmute();
        assertEquals(6, samsung.getVolumeLevel());
    }

}
