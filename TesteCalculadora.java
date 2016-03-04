package test.suite;

import java.math.BigDecimal;

import modelos.Calculadora;

import org.junit.Assert;
import org.junit.Test;

public class TesteCalculadora {

	Calculadora cal = new Calculadora(); 
	@Test
	public void testFuncaoSomar() {
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(13);
		
		BigDecimal res = cal.somar(op1, op2);
		
		Assert.assertEquals(new BigDecimal(23), res);
		
	}
	
	@Test
	public void testFuncaoSomarNumeroNegativo() {
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(-13);
		
		BigDecimal res = cal.somar(op1, op2);
		
		Assert.assertEquals(new BigDecimal(-3), res);
		
	}
	
	@Test
	public void testFuncaoSubtracaoResultadoNegativo() {
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(13);
		
		BigDecimal res = cal.subtrair(op1, op2);
		
		Assert.assertEquals(new BigDecimal(-3), res);
		
	}
	
	@Test
	public void testFuncaoSubtracaoResultadoPositivo() {
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(5);
		
		BigDecimal res = cal.subtrair(op1, op2);
		
		Assert.assertEquals(new BigDecimal(5), res);
		
	}
	
	@Test
	public void testFuncaoMultiplicacao() {
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(5);
		
		BigDecimal res = cal.multiplicar(op1, op2);
		
		Assert.assertEquals(new BigDecimal(50), res);
		
	}
	
	@Test
	public void testFuncaoMultiplicacaoComNegativos() {
		BigDecimal op1 = new BigDecimal(-10);
		BigDecimal op2 = new BigDecimal(-5);
		
		BigDecimal res = cal.multiplicar(op1, op2);
		
		Assert.assertEquals(new BigDecimal(50), res);
		
	}
	
	@Test
	public void testFuncaoMultiplicacaoComUmNegativo() {
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(-5);
		
		BigDecimal res = cal.multiplicar(op1, op2);
		
		Assert.assertEquals(new BigDecimal(-50), res);
		
	}
	
	@Test
	public void testFuncaoDivisao() {
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(5);
		
		BigDecimal res = cal.dividir(op1, op2);
		
		Assert.assertEquals(new BigDecimal(2), res);
		
	}
	
	@Test
	public void testFuncaoDivisaoComDivisorMaior() {
		BigDecimal op1 = new BigDecimal(5);
		BigDecimal op2 = new BigDecimal(10);
		
		BigDecimal res = cal.dividir(op1, op2);
		
		Assert.assertEquals(new BigDecimal(0.50), res);
		
	}
	
	@Test
	public void testFuncaoDivisaoComDivisorNegativo() {
		BigDecimal op1 = new BigDecimal(5);
		BigDecimal op2 = new BigDecimal(-10);
		
		BigDecimal res = cal.dividir(op1, op2);
		
		Assert.assertEquals(new BigDecimal(-0.50), res);
		
	}

}
