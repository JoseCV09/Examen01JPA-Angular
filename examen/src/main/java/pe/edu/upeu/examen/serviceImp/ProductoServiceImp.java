package pe.edu.upeu.examen.serviceImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upeu.examen.dao.ProductoDao;
import pe.edu.upeu.examen.entity.Producto;
import pe.edu.upeu.examen.services.ProductoService;
@Service
public class ProductoServiceImp implements ProductoService{
 @Autowired
 private ProductoDao productoDao;
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long idproducto) {
		// TODO Auto-generated method stub
		return productoDao.findById(idproducto).orElse(null);
	}
	@Override
	@Transactional
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.save(producto);
	}
	@Override
	@Transactional
	public void deleteById(Long idproducto) {
		// TODO Auto-generated method stub
		productoDao.deleteById(idproducto);
		
	}
	@Override
	@Transactional
	public Producto update(@RequestBody Producto producto) {
		return productoDao.save(producto);
	}

}
