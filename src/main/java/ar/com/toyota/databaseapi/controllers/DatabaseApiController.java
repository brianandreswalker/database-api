package ar.com.toyota.databaseapi.controllers;

import ar.com.toyota.databaseapi.StatusApi;
import ar.com.toyota.databaseapi.entities.SolicitudRemis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ar.com.toyota.databaseapi.services.interfaces.IDatabaseApiService;

import java.util.List;

@RestController
public class DatabaseApiController {

    @Autowired
    IDatabaseApiService dbserv;

    @RequestMapping(value = "/solicitudes", method = RequestMethod.GET)
    public List<SolicitudRemis> findAll (){
        return dbserv.findAll();
    }


    @RequestMapping(value = "/addSolicitud", method = RequestMethod.POST)
    public ResponseEntity<?> add(@RequestBody SolicitudRemis solicitudRemis){
        String code = "400";
        ResponseEntity<StatusApi> response;

        if(dbserv.addOne(solicitudRemis) == "1"){
            response = new ResponseEntity<StatusApi>(new StatusApi("200", "OK"), HttpStatus.OK)
        } else {
            response = new ResponseEntity<StatusApi>(new StatusApi("500", "Internal Server Error"), HttpStatus.INTERNAL_SERVER_ERROR)
        }

        return response;
    }
}
