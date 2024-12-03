package dao; 

import model.Produto; 

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence; 
import java.util.List; 

public class ProdutoDAO { //Classe principal
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("produtoPU"); 
    
    // metodo para criar um novo produto no banco de dados
    public void criar(Produto produto) { 
        EntityManager em = emf.createEntityManager(); 
        em.getTransaction().begin(); 
        em.persist(produto); 
        em.getTransaction().commit(); 
        em.close(); 
    }
    // metodo para ler os produtos
    public Produto ler(Long id) { 
        EntityManager em = emf.createEntityManager(); 
        Produto produto = em.find(Produto.class, id); // busca o produto pelo ID
        em.close(); 
        return produto; 
        // Mostra o produto selecionado
    }
    // metodo para listar todos os produtos inseridos pelo usuário
    public List<Produto> listaTodos() { 
        EntityManager em = emf.createEntityManager(); 
        List<Produto> produtos = em.createQuery("FROM Produto", Produto.class).getResultList(); // faz uma consulta e mostra todos os produtos da lista
        em.close(); 
        return produtos; 
        // Mostra a lista de produtos
    }
}