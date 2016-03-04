package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.suite.TesteCalculadora;
import test.suite.TestesFuncoesAgregadas;

@RunWith(Suite.class)
@SuiteClasses({ 
	TesteCalculadora.class,
	TestesFuncoesAgregadas.class 

})
public class TesteSuiteGeral {

}
