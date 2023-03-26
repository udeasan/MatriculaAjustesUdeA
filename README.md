## Servicios matricula y ajustes

Estos servicios se encuentran desplegados en el endpoint:
https://matriculaajustesapi-santiagobedoyao.b4a.run/

HU01 - Consultar fechas de matricula por semestre
Endpoint: `/semestre/{id_semestre}`

Tipo: `GET`

Response:
```
{
    "CodigoSemestre": "202301",
    "InicioMatricula": "2023-01-01",
    "FinMatricula": "2023-01-20",
    "InicioClases": "2023-02-01",
    "FinClases": "2023-05-20"
}
```


HU02 - Ver el listado de cursos ofertados
Endpoint: `/cursos`

Tipo: GET

Response:
```
[
    {
        "Codigo": "1020001",
        "Nombre": "Análisis I",
        "Horario": "MJ 20-22",
        "Creditos": "4",
        "Cupos": "20",
        "Prerrequisitos": "",
        "Correquisitos": ""
    },
    {
        "Codigo": "1020002",
        "Nombre": "Análisis II",
        "Horario": "WV 20-22",
        "Creditos": "4",
        "Cupos": "20",
        "Prerrequisitos": "1020001",
        "Correquisitos": ""
    },
    {
        "Codigo": "10200003",
        "Nombre": "Bases de Datos",
        "Horario": "LWV 12-14",
        "Creditos": "4",
        "Cupos": "20",
        "Prerrequisitos": "",
        "Correquisitos": ""
    }
]
```

HU03 - Ver el listado de cursos disponibles para un estudiante
Endpoint: `/cursos/{id_estudiante}`

Tipo: `GET`

Response:
```
[
    {
        "Codigo": "1020001",
        "Nombre": "Análisis I",
        "Horario": "MJ 20-22",
        "Creditos": "4",
        "Cupos": "20",
        "Prerrequisitos": "",
        "Correquisitos": ""
    },
    {
        "Codigo": "10200003",
        "Nombre": "Bases de Datos",
        "Horario": "LWV 12-14",
        "Creditos": "4",
        "Cupos": "20",
        "Prerrequisitos": "",
        "Correquisitos": ""
    }
]
```

HU04 - Agregar un curso a mi lista de cursos a matricular
Endpoint: `/registro`

Tipo: `POST`

Body Request:
```
{
    "CodigoMatricula": "{codigo_matricula}",
    "CodigoMateria": "{codigo_materia}",
    "NumeroIdentificacionEstudiante": "{numero_identificacion}"
}
```

Response:
```
{
    "CodigoMatricula": "000001",
    "CodigoMateria": "1020001",
    "NumeroIdentificacionEstudiante": "1040123",
    "EstadoMateria": "Registrado"
}
```

HU05 - Envíar matricula para finalizar el proceso de matricula
Endpoint: `/finalizarmatricula/{documento_estudiante}`

Tipo: `GET`

Response: 200 - ok

---

Servicios adicionales para obtener datos de prueba - metodo `GET`

Obtener cursos: `/cursos`

Obtener matriculas: `/matriculas`

Obtener estudiantes: `/estudiantes`
