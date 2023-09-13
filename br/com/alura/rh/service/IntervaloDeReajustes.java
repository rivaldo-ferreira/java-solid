package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class IntervaloDeReajustes implements ValidacaoReajuste {
	
	public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
		
				LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
				LocalDate dataAtual = LocalDate.now();
				long mesesEntreReajustes = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
				if(mesesEntreReajustes < 6) {
					throw new ValidacaoException("O último reajuste foi inferior a 6 meses.");
				}

	}

}
