package codigolimpo;

import static org.junit.Assert.*;
import org.hibernate.classic.Session;
import org.junit.Test;

public class PessoaTest {
    
    @Test
    public void testTelefoneUserType() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Pessoa pessoa = new Pessoa();
        pessoa.setTelefone(Telefone.newTelefone("30276360"));
        session.persist(pessoa);
        Pessoa loadedPessoa = (Pessoa) session.load(Pessoa.class, pessoa.getId());
        assertNotNull(loadedPessoa);
        assertNotNull(loadedPessoa.getTelefone());
        session.getTransaction().commit();
    }
    
}