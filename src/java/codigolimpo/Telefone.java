package codigolimpo;

import com.google.common.base.Objects;
import static com.google.common.base.Preconditions.*;
import java.io.Serializable;

public class Telefone implements Serializable {
    
    private final String numero;
    
    private Telefone(String numero) {
        this.numero = numero;
    }
    
    public static Telefone newTelefone(String numero) {
        checkNotNull(numero);
        checkArgument(numero.matches("\\d{8}"));
        return new Telefone(numero);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Telefone) {
            Telefone other = (Telefone) obj;
            return Objects.equal(this.numero, other.numero);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.numero);
    }

    @Override
    public String toString() {
        return numero;
    }
    
}