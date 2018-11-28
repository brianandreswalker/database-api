package ar.com.toyota.databaseapi.services.interfaces;

import ar.com.toyota.databaseapi.entities.SolicitudRemis;

import java.util.List;

public interface IDatabaseApiService {

    List<SolicitudRemis> findAll();

    String addOne(SolicitudRemis solicitudRemis);
}
