package cl.isl.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.isl.springboot.model.CertificadoPagoCotizacion;

public interface ICertificadoPagoCotizacionRepo extends JpaRepository<CertificadoPagoCotizacion, Integer>{

}
