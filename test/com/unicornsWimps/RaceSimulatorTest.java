//package com.unicornsWimps;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class RaceSimulatorTest {
//    private RaceCourse raceCourse;
//    private Hare nnamdi;
//    private Tortoise ijapa;
//
//    @BeforeEach
//    public void setUp(){
//        raceCourse = new RaceCourse();
//        nnamdi = new Hare();
//        ijapa= new Tortoise();
//    }
//    @Test
//   public void getRaceTrack(){
//        assertNotNull(raceCourse.getRaceTrack());
//    }
//    @Test
////    public void createRaceTrackWithSmallTrack(){
////        int [] track = new int[20];
////        raceCourse = new RaceCourse(smallTrack);
////        assertNotNull(raceCourse.getRaceTrack());
////        assertTrue(raceCourse.getRaceTrack().length > 70);
////    }
////    @Test
////    public void checkAnimalAytStartPosition(){
////        assertEquals(1, nnamdi.getPosition());
////        assertEquals(1, ijapa.getPosition());
////    }
//    @Test
//    public void generateNumber(){
//        int moveNumber = RaceSimulator.generateMoveNumber();
//        assertTrue(moveNumber > BigDecimal.ZERO.intValue());
//        assertTrue(moveNumber > BigDecimal.ONE.intValue());
//    }
//
//}
//
