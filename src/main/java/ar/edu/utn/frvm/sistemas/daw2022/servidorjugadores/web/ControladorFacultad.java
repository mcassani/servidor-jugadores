package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.web;

import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.logica.ServicioFacultad;
import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo.Facultad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/facultades")
@RestController
public class ControladorFacultad {

    private ServicioFacultad servicio;

    public ControladorFacultad(ServicioFacultad servicio) {
        this.servicio = servicio;
    }

    //GET todas
    //GET 1
    @RequestMapping(value = "/{id}")
    public Facultad getFactultad() {
//        return new Facultad("Tucuman", "FRT");
        return this.servicio.getFacultad();
    }
    //POST
    //PUT
}
