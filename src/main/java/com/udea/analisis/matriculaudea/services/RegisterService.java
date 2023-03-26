package com.udea.analisis.matriculaudea.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.udea.analisis.matriculaudea.models.Registro;
import com.udea.analisis.matriculaudea.models.ConsumerModels.RegistroInput;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.IRegisterService;

@Service
public class RegisterService implements IRegisterService{
    public ArrayList<Registro> registros;
    public RegisterService() {
        registros = new ArrayList<Registro>();
    }

    @Override
    public Registro addRegister(RegistroInput registro) {
        Registro newRegister = new Registro(registro.codigoMatricula, registro.codigoMateria, registro.numeroIdentificacionEstudiante, "Registrado");
        registros.add(newRegister);
        return newRegister;
    }

    @Override
    public ArrayList<Registro> getAllRegisters() {
        return registros;
    }


}
