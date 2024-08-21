package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList s2;

    @BeforeEach
    void init() {
        s2 = new StudentList();
        s2.addNewStudent("6122222", "pete");
        s2.addNewStudent("6133333", "jay", 65);
    }

    @Test
    void testFindStudentById() {
        assertEquals(s2.getStudents().get(0), s2.findStudentById("6122222"));
        assertEquals(s2.getStudents().get(1), s2.findStudentById("6133333"));
    }

    @Test
    void testViewGradeOfId() {
        s2.giveScoreToId("6133333", 10);
        s2.viewGradeOfId("6133333");
        assertEquals("B", s2.viewGradeOfId("6133333"));
    }
}