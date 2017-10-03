package br.com.projetolocadora.entity.Entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@Table(name = "livro")
public class LivroEntity {
    private int id;
    private String titulo;
    @Lob
    private String descricao;
    private BigDecimal preco;
    private Integer numeroPaginas;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "titulo")
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Basic
    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Basic
    @Column(name = "preco")
    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Basic
    @Column(name = "numero_paginas")
    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LivroEntity that = (LivroEntity) o;

        if (id != that.id) return false;
        if (titulo != null ? !titulo.equals(that.titulo) : that.titulo != null) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;
        if (preco != null ? !preco.equals(that.preco) : that.preco != null) return false;
        if (numeroPaginas != null ? !numeroPaginas.equals(that.numeroPaginas) : that.numeroPaginas != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (preco != null ? preco.hashCode() : 0);
        result = 31 * result + (numeroPaginas != null ? numeroPaginas.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LivroEntity{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
