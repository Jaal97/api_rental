package co.edu.unab.apirestg03.modelos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("clientes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClienteModelo {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private long ndocumento;
    // private LocalDate fnacimiento;
    // private List<String> telefonos;
    private String direccion;    //{ciudad:"Bucaramanga",departamento:"Santander"}
}
