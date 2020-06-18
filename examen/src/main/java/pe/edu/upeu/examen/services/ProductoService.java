package pe.edu.upeu.examen.services;

import java.util.List;
import pe.edu.upeu.examen.entity.Producto;

public interface ProductoService {

	public List<Producto> findAll();
	public Producto findById(Long idproducto);
	public Producto save(Producto producto);
	public void deleteById(Long idproducto);
	public Producto update(Producto producto);

}
