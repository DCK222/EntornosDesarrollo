import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class CalculadoraTest4 {

	int s1 = 0;
	int s2 = 0;
	int resul = 0;

	public CalculadoraTest4(int s1, int s2, int s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.resul = s3;
		
	}
	@Test
	public void testdivide() {
		Calculadora calcu= new Calculadora(s1,s2);
		int resultado = calcu.divide();
		assertEquals(resul,resultado);
	}
	
	@Parameters
	public static Collection<Object []>numeros(){
		
		return Arrays.asList(new Object [][] { {20,10,2}, {30,-2,-15}, {6,2,3}});
		
		
	}
	
}


