package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.logica;

import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo.Facultad;
import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.persistencia.RepositorioFacultad;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioFacultad {

    private RepositorioFacultad repositorio;

    public ServicioFacultad(RepositorioFacultad repositorio) {
        this.repositorio = repositorio;
    }

    public Iterable<Facultad> getFacultades() {
        return this.repositorio.findAll();
    }

    public Iterable<Facultad> getFacultades(String filtro) {
        return this.repositorio.findByNombreContainingIgnoreCase(filtro);
    }

    public Facultad getFacultad(Integer id) {
        Optional<Facultad> rta = this.repositorio.findById(id);
        if (rta.isPresent()) {
            return rta.get();
        }
        return null;
    }

    public Facultad guardar(Facultad f) {
        return this.repositorio.save(f);
    }

    public Facultad actualizar(Facultad f) {
        return this.guardar(f);
    }

    public void eliminar(Integer id) {
        this.repositorio.deleteById(id);
    }
}
