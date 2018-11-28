package ar.com.toyota.databaseapi.services;

import ar.com.toyota.databaseapi.daos.SolicitudRepository;
import ar.com.toyota.databaseapi.entities.SolicitudRemis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.com.toyota.databaseapi.services.interfaces.IDatabaseApiService;

import java.util.ArrayList;
import java.util.List;

@Service
public class DatabaseApiServiceImpl implements IDatabaseApiService {

    @Autowired
    private SolicitudRepository solicitudRepository;

    public List<SolicitudRemis> findAll(){

        List<SolicitudRemis> solicitudes = new ArrayList<>();
        solicitudRepository.findAll().forEach(solicitudes::add);
        return solicitudes;
    }

    public String addOne(SolicitudRemis solicitudRemis){
        String status;

        SolicitudRemis solGuardada = solicitudRepository.save(solicitudRemis);

        if(solGuardada.equals(solicitudRemis)){
            status = "1";
        } else {
            status = "0";
        }

        return status;
    }

}
