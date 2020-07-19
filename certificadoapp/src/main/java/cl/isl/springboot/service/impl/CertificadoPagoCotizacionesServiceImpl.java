package cl.isl.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.isl.springboot.dto.ConsultaCertificadoDTO;
import cl.isl.springboot.model.CertificadoPagoCotizacion;
import cl.isl.springboot.repo.ICertificadoPagoCotizacionRepo;
import cl.isl.springboot.service.ICertificadoPagoCotizacionService;

@Service
public class CertificadoPagoCotizacionesServiceImpl implements ICertificadoPagoCotizacionService{

	@Autowired
	private ICertificadoPagoCotizacionRepo repo;

	@Override
	public CertificadoPagoCotizacion registrar(CertificadoPagoCotizacion obj) {
		
		return repo.save(obj);
	}

	@Override
	public CertificadoPagoCotizacion modificar(CertificadoPagoCotizacion obj) {
		
		return repo.save(obj);
	}

	@Override
	public List<CertificadoPagoCotizacion> listar() {
		
		return repo.findAll();
	}

	@Override
	public CertificadoPagoCotizacion leerPorId(Integer id) {
		Optional<CertificadoPagoCotizacion> op = repo.findById(id);
		return op.isPresent() ? op.get(): new CertificadoPagoCotizacion();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	
	
	@Override
	public CertificadoPagoCotizacion registrarCertificado(ConsultaCertificadoDTO consulta) {
		
		return null;
	}

	
}
