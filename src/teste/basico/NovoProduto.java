package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {
				
		Produto produto = new Produto("Monitor 22", 1211.45);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
//		dao.abrirT().incluir(produto).fecharT().fechar();
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("ID do produto: " + produto.getId());
	
	}
}
