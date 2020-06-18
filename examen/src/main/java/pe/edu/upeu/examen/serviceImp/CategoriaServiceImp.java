package pe.edu.upeu.examen.serviceImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upeu.examen.dao.CategoriaDao;
import pe.edu.upeu.examen.entity.Categoria;
import pe.edu.upeu.examen.services.CategoriaService;
@Service
public class CategoriaServiceImp implements CategoriaService{
 @Autowired
 private CategoriaDao categoriaDao;
	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) categoriaDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Categoria findById(Long idcategoria) {
		// TODO Auto-generated method stub
		return categoriaDao.findById(idcategoria).orElse(null);
	}
	@Override
	@Transactional
	public Categoria save(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaDao.save(categoria);
	}
	@Override
	@Transactional
	public void deleteById(Long idcategoria) {
		// TODO Auto-generated method stub
		categoriaDao.deleteById(idcategoria);
		
	}
	@Override
	@Transactional
	public Categoria update(@RequestBody Categoria categoria) {
		return categoriaDao.save(categoria);
	}

}
