package test.suite;

import java.math.BigDecimal;

import modelos.Calculadora;

import org.junit.Assert;
import org.junit.Test;

public class TesteSomaMultiplicacao {

	Calculadora cal = new Calculadora();
	
	@Test
	public void testeSomaMultiplicacao1(){
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(10);
		BigDecimal op3 = new BigDecimal(10);
		
		BigDecimal res = cal.somar(op1, op2);
		res = cal.multiplicar(res, op3);
		
		Assert.assertEquals(new BigDecimal(200), res);
	}
	
	@Test
	public void testeSomaMultiplicacao2(){
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(10);
		BigDecimal op3 = new BigDecimal(-10);
		
		BigDecimal res = cal.somar(op1, op2);
		res = cal.multiplicar(res, op3);
		
		Assert.assertEquals(new BigDecimal(-200), res);
	}
	
	@Test
	public void testeSomaMultiplicacao3(){
		BigDecimal op1 = new BigDecimal(1);
		BigDecimal op2 = new BigDecimal(1);
		BigDecimal op3 = new BigDecimal(0.5);
		
		BigDecimal res = cal.somar(op1, op2);
		res = cal.multiplicar(res, op3);
		
		Assert.assertEquals(new BigDecimal(1).setScale(1), res);
	}
	@Test
	public void testeSomaMultiplicacao4(){
		BigDecimal op1 = new BigDecimal(1);
		BigDecimal op2 = new BigDecimal(0.5);
		BigDecimal op3 = new BigDecimal(0.5);
		
		BigDecimal res = cal.somar(op1, op2);
		res = cal.multiplicar(res, op3);
		
		Assert.assertEquals(new BigDecimal(0.75), res);
	}
	
	@Test
	public void testeSomaMultiplicacao5(){
		BigDecimal op1 = new BigDecimal(1);
		BigDecimal op2 = new BigDecimal(0.5);
		BigDecimal op3 = new BigDecimal(10);
		
		BigDecimal res = cal.somar(op1, op2);
		res = cal.multiplicar(res, op3);
		
		Assert.assertEquals(new BigDecimal(15).setScale(1), res);
	}
}
