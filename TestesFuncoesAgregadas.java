package test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TesteSomaMultiplicacao.class,
	TesteSomaSubtracaoAgregados.class })
public class TestesFuncoesAgregadas {

}
