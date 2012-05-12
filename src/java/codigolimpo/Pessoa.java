package codigolimpo;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import org.hibernate.annotations.Type;
import org.joda.time.DateMidnight;

@Entity
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;

    @Version
    Integer version;
    
    @Type(type="telefone")
    private Telefone telefone;
    
    private DateMidnight nascimento;

    public Long getId() {
        return id;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public DateMidnight getNascimento() {
        return nascimento;
    }

    public void setNascimento(DateMidnight nascimento) {
        this.nascimento = nascimento;
    }

}
