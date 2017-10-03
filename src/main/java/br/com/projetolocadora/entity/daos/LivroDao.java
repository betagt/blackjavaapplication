package br.com.projetolocadora.entity.daos;

import br.com.projetolocadora.entity.Entity.LivroEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class LivroDao {

    @PersistenceContext
    private EntityManager manager;

    public void salvar(LivroEntity livroEntity){
        manager.persist(livroEntity);
    }
}
