package br.com.projetolocadora.entity.loja.beans;

import br.com.projetolocadora.entity.daos.LivroDao;
import br.com.projetolocadora.entity.Entity.LivroEntity;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

@Named
@RequestScoped
public class AdminLivrosBean {

    private LivroEntity livro = new LivroEntity();


    @Transactional
    public void salvar() {
        LivroDao dao = new LivroDao();
        dao.salvar(livro);
        System.out.println("Livro Cadastrado" + livro);
    }

    public LivroEntity getLivro() {
        return livro;
    }

    public void setLivro(LivroEntity livro) {
        this.livro = livro;
    }
}
