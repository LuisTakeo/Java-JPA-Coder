package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
	public static void main(String[] args) {
		
		Assento assento = new Assento("23F");
		Cliente cliente = new Cliente("Takeo", assento);
		
		DAO<Object> dao = new DAO<>();
		//primeiro sempre incluir o que não tem chave estrangeira
		dao.abrirT()
			.incluir(assento)
			.incluir(cliente)
			.fecharT()
			.fechar();
	}
}
