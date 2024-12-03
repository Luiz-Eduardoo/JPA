package model; 

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 

@Entity // entidade JPA para o banco de dados
public class Produto {
    @Id // Id é a primeira chave do banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) // o banco de dados vai gerar o id automaticamente
    private Long id; // guarda o ID
    private String nome; // guarda o nome
    private Double preco; // guarda o preço

    // método get para acessar o atributo
    public Long getId() {
        return id;
    }
    // método set para modificar o valor do atributo
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}