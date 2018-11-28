package ar.com.toyota.databaseapi.daos;

import ar.com.toyota.databaseapi.entities.SolicitudRemis;
import org.springframework.data.repository.CrudRepository;

public interface SolicitudRepository extends CrudRepository<SolicitudRemis, Integer> {
}
