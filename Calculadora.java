package modelos;

import java.math.BigDecimal;

public class Calculadora {

	public BigDecimal somar(BigDecimal operador1, BigDecimal operador2){
		return operador1.add(operador2);
	}
	
	public BigDecimal subtrair(BigDecimal operador1, BigDecimal operador2){
		return operador1.subtract(operador2);
	}
	
	public BigDecimal multiplicar(BigDecimal operador1, BigDecimal operador2){
		return operador1.multiply(operador2);
	}
	
	public BigDecimal dividir(BigDecimal operador1, BigDecimal operador2){
		return operador1.divide(operador2);
	}
}
