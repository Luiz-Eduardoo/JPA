package Main; 

import dao.ProdutoDAO; 
import model.Produto; 

import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) {
    	// novo objeto
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Scanner scanner = new Scanner(System.in);
        // Variável para o loop
        String continuar = "sim"; 
        // Loop infinito enquanto o usuário digitar "sim"
        while (continuar.equalsIgnoreCase("sim")) { 
        	// novo objeto produto
            Produto produto = new Produto(); 
            System.out.print("Digite o nome do produto: ");
            // salva o nome do produto
            produto.setNome(scanner.nextLine()); 

            System.out.print("Digite o preço do produto: "); 
            produto.setPreco(scanner.nextDouble());
            scanner.nextLine();

            // Salva o produto no banco de dados
            produtoDAO.criar(produto); 

            System.out.print("Deseja adicionar outro produto? (sim/não): ");
        }

        // Lista todos os produtos no banco de dados
        System.out.println("Lista de produtos no banco de dados:");
        produtoDAO.listaTodos().forEach(p -> System.out.println(p.getNome() + " - " + p.getPreco())); 

        scanner.close();
    }
}