package pe.edu.upeu.examen.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.examen.entity.*;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Long> {

}
