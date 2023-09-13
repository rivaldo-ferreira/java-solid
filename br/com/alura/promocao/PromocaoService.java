package br.com.alura.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean bateuMeta) {
		Cargo cargoAtual = funcionario.getCargo();
		if(Cargo.GERENTE == cargoAtual) {
			throw new ValidacaoException("Gerentes n�o podem ser promovidos!");
		}
		
		if(bateuMeta) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcion�rio n�o bateu a meta.");
		}
		
	}

}
