package pe.edu.cibertec.cl3.controllers;

import javax.sql.DataSource;

import pe.edu.cibertec.cl3.repositories.EmpleadoRepository;

public class EmpleadoController {
        EmpleadoRepository empleadoRepository;
        DataSource dataSource;

        public EmpleadoController(EmpleadoRepository empleadoRepository, DataSource dataSource){
            this.empleadoRepository = empleadoRepository;
            this.dataSource = dataSource;
        }
        
    
}
