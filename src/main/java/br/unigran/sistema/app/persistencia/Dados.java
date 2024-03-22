package br.unigran.sistema.app.persistencia;

import br.unigran.sistema.model.Pessoa.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Dados {
    EntityManagerFactory emf=
        Persistence.createEntityManagerFactory("br.unigran_Sistema_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();
    
    public void salvar(Object o){
    etx.begin();
    em.persist(o);
    etx.commit();
    }
    
    public void atualiza(Object o){
    etx.begin();
    em.persist(o);
    etx.commit();
    }
    
    public void remove(Object o){
    etx.begin();
    em.remove(o);
    etx.commit();
    }
    
    public List listar (){
        return em.createNativeQuery("select * from pessoa p", Pessoa.class).getResultList();        
    }
    
    public List listar00 (){
        return em.createNativeQuery("select p from Pessoa p").getResultList();        
    }
}
