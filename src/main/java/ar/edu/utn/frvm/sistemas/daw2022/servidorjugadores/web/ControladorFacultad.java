package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.web;

import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.logica.ServicioFacultad;
import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo.Facultad;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping(value = "/facultades")
@RestController
public class ControladorFacultad {

    private ServicioFacultad servicio;

    public ControladorFacultad(ServicioFacultad servicio) {
        this.servicio = servicio;
    }

    //GET todas
    @RequestMapping
    public Iterable<Facultad> getFacultades() {
        return this.servicio.getFacultades();
    }

    @RequestMapping(params = {"filtro"})
    public Iterable<Facultad> getFacultades(@RequestParam(name = "filtro") String filtro) {
        log.info(filtro);
        return this.servicio.getFacultades(filtro);
    }

    //GET 1
    @RequestMapping(value = "/{id}")
    public Facultad getFactultad(@PathVariable("id") Integer id) {
        return this.servicio.getFacultad(id);
    }

    //POST
    @RequestMapping(method = RequestMethod.POST)
    public Facultad guardar(@RequestBody Facultad f) {
        return this.servicio.guardar(f);
    }

    //PUT
    @RequestMapping(method = RequestMethod.PUT)
    public Facultad actualizar(@RequestBody Facultad f) {
        return this.servicio.actualizar(f);
    }
}
