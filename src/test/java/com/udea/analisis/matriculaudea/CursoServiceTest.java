import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class CursoServiceTest {
    
    private CursoService cursoService;
    
    @Before
    public void setUp() throws Exception {
        cursoService = new CursoService();
    }
    
    @Test
    public void testFindAllCourses() {
        // Arrange
        ArrayList<Curso> expectedCourses = new ArrayList<Curso>();
        expectedCourses.add(new Curso("1020001", "Análisis II", "MJ 20-22", "4", "20", "", "", 1));
        expectedCourses.add(new Curso("1020002", "Análisis II", "WV 20-22", "4", "20", "1020001", "", 1));
        expectedCourses.add(new Curso("10200003", "Bases de Datos", "LWV 12-14", "4", "20", "", "", 1));

        // Act
        ArrayList<Curso> actualCourses = cursoService.findAllCourses();

        // Assert
        assertEquals(expectedCourses, actualCourses);
    }
    
    @Test
    public void testGetCoursesForStudent() {
        // Arrange
        String studentId = "1234";
        ArrayList<Curso> expectedCourses = new ArrayList<Curso>();
        expectedCourses.add(new Curso("1020001", "Análisis II", "MJ 20-22", "4", "20", "", "", 1));
        expectedCourses.add(new Curso("10200003", "Bases de Datos", "LWV 12-14", "4", "20", "", "", 1));

        // Act
        ArrayList<Curso> actualCourses = cursoService.getCoursesForStudent(studentId);

        // Assert
        assertEquals(expectedCourses, actualCourses);
    }
    
    @Test
    public void testInsertCourse() {
        // Arrange
        Curso newCourse = new Curso("1020004", "Programación I", "LWV 10-12", "4", "20", "", "", 1);

        // Act
        cursoService.insertCourse(newCourse);
        ArrayList<Curso> actualCourses = cursoService.findAllCourses();

        // Assert
        assertTrue(actualCourses.contains(newCourse));
    }
}
