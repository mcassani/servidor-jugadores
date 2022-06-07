package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.logica;

import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo.Facultad;
import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.persistencia.RepositorioFacultad;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicioFacultad {

    private RepositorioFacultad repositorio;

    public ServicioFacultad(RepositorioFacultad repositorio) {
        this.repositorio = repositorio;
    }

    public Facultad getFacultad() {
        Optional<Facultad> rta = this.repositorio.findById(10);
        if (rta.isPresent()) {
            return rta.get();
        }
        return null;
    }

}
