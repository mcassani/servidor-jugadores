package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Facultad {

    @Id
    private Integer id;
    @NonNull
    private String nombre;
    @NonNull
    private String codigo;
    private int codigoNumerico;

}
