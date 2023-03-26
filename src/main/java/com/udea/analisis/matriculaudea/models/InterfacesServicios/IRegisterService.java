package com.udea.analisis.matriculaudea.models.InterfacesServicios;

import java.util.ArrayList;

import com.udea.analisis.matriculaudea.models.Registro;
import com.udea.analisis.matriculaudea.models.ConsumerModels.RegistroInput;

public interface IRegisterService {
    public ArrayList<Registro> getAllRegisters();
    public Registro addRegister(RegistroInput registro);
}
