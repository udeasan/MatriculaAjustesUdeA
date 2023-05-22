package com.udea.analisis.matriculaudea.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.udea.analisis.matriculaudea.models.Registro;
import com.udea.analisis.matriculaudea.models.ConsumerModels.RegistroInput;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.IRegisterService;

@DisplayName("Pruebas unitarias para RegisterService")
public class RegisterServiceTest {

    private IRegisterService registerService;

    @BeforeEach
    void setUp() {
        registerService = new RegisterService();
    }

    @Test
    @DisplayName("Agregar registro exitoso")
    void testAddRegister() {
        // Arrange
        RegistroInput registroInput = new RegistroInput("000001", "1020001", "1040123");

        // Act
        Registro registro = registerService.addRegister(registroInput);

        // Assert
        assertNotNull(registro);
        assertEquals("000001", registro.getCodigoMatricula());
        assertEquals("1020001", registro.getCodigoMateria());
        assertEquals("1040123", registro.getNumeroIdentificacionEstudiante());
        assertEquals("Registrado", registro.getEstadoMateria());
    }

    @Test
    @DisplayName("Obtener todos los registros exitoso")
    void testGetAllRegisters() {
        // Arrange
        RegistroInput registroInput1 = new RegistroInput("000001", "1020001", "1040123");
        RegistroInput registroInput2 = new RegistroInput("000002", "1020002", "1040124");
        registerService.addRegister(registroInput1);
        registerService.addRegister(registroInput2);

        // Act
        ArrayList<Registro> registros = registerService.getAllRegisters();

        // Assert
        assertNotNull(registros);
        assertEquals(2, registros.size());
        assertEquals("000001", registros.get(0).getCodigoMatricula());
        assertEquals("1020001", registros.get(0).getCodigoMateria());
        assertEquals("1040123", registros.get(0).getNumeroIdentificacionEstudiante());
        assertEquals("Registrado", registros.get(0).getEstadoMateria());
        assertEquals("000002", registros.get(1).getCodigoMatricula());
        assertEquals("1020002", registros.get(1).getCodigoMateria());
        assertEquals("1040124", registros.get(1).getNumeroIdentificacionEstudiante());
        assertEquals("Registrado", registros.get(1).getEstadoMateria());
    }
}
