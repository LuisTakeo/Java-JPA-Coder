package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		produtos.forEach(produto -> 
		System.out.printf("ID: %d, Nome: %s \n", 
				produto.getId(), produto.getNome()));
	
		double precoTotal = produtos
				.stream()
				.map(produto -> produto.getPreco())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
		System.out.printf("O valor total é R$%.2f", precoTotal);
		
		dao.fechar();
	
	}

}
