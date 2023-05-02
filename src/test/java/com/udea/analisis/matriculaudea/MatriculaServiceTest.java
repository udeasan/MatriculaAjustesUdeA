import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import com.udea.analisis.matriculaudea.models.Matricula;

public class MatriculaServiceTest {

    private MatriculaService matriculaService;

    @BeforeEach
    void setUp() {
        matriculaService = new MatriculaService();
    }

    @Test
    void findAllRegisters_ShouldReturnListOfMatriculas() {
        // Arrange
        Matricula matricula1 = new Matricula("000001", "123", "0124");
        Matricula matricula2 = new Matricula("000002", "123132", "0124");
        Matricula matricula3 = new Matricula("000003", "4324", "0124");
        ArrayList<Matricula> expectedMatriculas = new ArrayList<>();
        expectedMatriculas.add(matricula1);
        expectedMatriculas.add(matricula2);
        expectedMatriculas.add(matricula3);
        
        // Act
        ArrayList<Matricula> actualMatriculas = matriculaService.findAllRegisters();
        
        // Assert
        assertEquals(expectedMatriculas, actualMatriculas);
    }
    
    @Test
    void getRegisterByID_ShouldReturnCorrectMatricula() {
        // Arrange
        String id = "000001";
        Matricula expectedMatricula = new Matricula("000001", "123", "0124");
        
        // Act
        Matricula actualMatricula = matriculaService.getRegisterByID(id);
        
        // Assert
        assertEquals(expectedMatricula, actualMatricula);
    }
    
    @Test
    void insertRegister_ShouldAddNewMatricula() {
        // Arrange
        Matricula matriculaToAdd = new Matricula("000004", "5678", "0124");
        int expectedSize = matriculaService.findAllRegisters().size() + 1;
        
        // Act
        matriculaService.insertRegister(matriculaToAdd);
        int actualSize = matriculaService.findAllRegisters().size();
        
        // Assert
        assertEquals(expectedSize, actualSize);
        assertTrue(matriculaService.findAllRegisters().contains(matriculaToAdd));
    }
    
    @Test
    void finishRegister_ShouldChangeMatriculaStatus() {
        // Arrange
        Matricula matriculaToFinish = matriculaService.getRegisterByID("000001");
        String expectedStatus = "Finalizado";
        
        // Act
        matriculaService.finishRegister("000001");
        String actualStatus = matriculaToFinish.getStatus();
        
        // Assert
        assertEquals(expectedStatus, actualStatus);
    }
}
