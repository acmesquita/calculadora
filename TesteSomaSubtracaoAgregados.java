package test.suite;

import java.math.BigDecimal;

import modelos.Calculadora;

import org.junit.Assert;
import org.junit.Test;

public class TesteSomaSubtracaoAgregados {

	Calculadora cal = new Calculadora();
	
	@Test
	public void testeSomaESubtracao(){
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(10);
		BigDecimal op3 = new BigDecimal(10);
		
		BigDecimal res = cal.somar(op1, op2);
		res = cal.subtrair(res, op3);
		
		Assert.assertEquals(new BigDecimal(10), res);
	}
	
	@Test
	public void testeSomaESubtracao2(){
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(20);
		BigDecimal op3 = new BigDecimal(5);
		
		BigDecimal res = cal.somar(op1, op2);
		res = cal.subtrair(res, op3);
		
		Assert.assertEquals(new BigDecimal(25), res);
	}
	
	@Test
	public void testeSomaESubtracao3(){
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(10);
		BigDecimal op3 = new BigDecimal(-10);
		
		BigDecimal res = cal.somar(op1, op2);
		res = cal.subtrair(res, op3);
		
		Assert.assertEquals(new BigDecimal(30), res);
	}
	
	@Test
	public void testeSomaESubtracao4(){
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(10);
		BigDecimal op3 = new BigDecimal(10);
		
		BigDecimal res = cal.somar(op1, op2);
		res = cal.subtrair(res, op3);
		
		Assert.assertEquals(new BigDecimal(10), res);
	}
	@Test
	public void testeSomaESubtracao5(){
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(1);
		BigDecimal op3 = new BigDecimal(10);
		
		BigDecimal res = cal.somar(op1, op2);
		res = cal.subtrair(res, op3);
		
		Assert.assertEquals(new BigDecimal(1), res);
	}
}
