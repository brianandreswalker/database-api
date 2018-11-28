package ar.com.toyota.databaseapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SolicitudRemis {

    @Id
    private Integer id;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
