package br.com.alura.rh.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void reajustarSalario(Funcionario funcionario, BigDecimal aumento);

}
