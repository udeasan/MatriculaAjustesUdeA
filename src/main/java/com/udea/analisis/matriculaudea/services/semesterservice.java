package com.udea.analisis.matriculaudea.services;

import org.springframework.stereotype.Service;

import com.udea.analisis.matriculaudea.models.Semestre;
import com.udea.analisis.matriculaudea.models.InterfacesServicios.ISemestreService;

@Service
public class semesterservice implements ISemestreService {

    @Override
    public Semestre getInfoSemester(String id) {
        return new Semestre(id, "2023-01-01", "2023-01-20","2023-02-01","2023-05-20");
    }
    
}
