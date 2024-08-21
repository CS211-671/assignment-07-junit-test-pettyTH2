package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1;

    @BeforeEach
    void init() {
        s1 = new Student("6611111111", "petch");
    }

    @Test
    void testChangeName() {
        s1.changeName("point");
        assertEquals("point", s1.getName());
    }

    @Test
    void testAddScore() {
        assertEquals(0, s1.getScore());
        s1.addScore(10);
        assertEquals(10, s1.getScore());
        s1.addScore(20);
        assertEquals(30, s1.getScore());
    }

    @Test
    @DisplayName("ทดสอบการคิดเกรด")
    void testCalculateGrade() {
        s1.addScore(60.3);
        assertEquals("C", s1.grade());
    }

    @Test
    void testIsId() {
        String id = s1.getId();
        assertTrue(s1.isId(id));
    }

    @Test
    void testToString() {
        assertEquals("{id: '" + s1.getId() + '\'' + ", name: '" + s1.getName() + '\'' + ", score: " + s1.getScore() + '}', s1.toString());
    }
}