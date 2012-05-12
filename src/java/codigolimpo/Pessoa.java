package codigolimpo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import org.hibernate.annotations.Type;

@Entity
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;

    @Version
    Integer version;
    
    @Type(type="telefone")
    private Telefone telefone;

    public Long getId() {
        return id;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
}
