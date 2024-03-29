package pe.edu.cibertec.cl3.repositories;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

import pe.edu.cibertec.cl3.entities.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {
    List<Empleado> findAll();
    
}
