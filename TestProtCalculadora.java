package calculadorastack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import calculadorastack.ProtCalculadora;

import org.junit.jupiter.api.Test;

class TestProtCalculadora {

	@Test
	void test() {
		ProtCalculadora p = new ProtCalculadora();
		String r2 = p.decode("D:\\Universidad\\2do Año\\Algoritmos y estructura de datos\\datos.txt");
		assertEquals("RESULTADO: 15\n" + 
				"ENTRADA	 OPERACION		 PILA\n" + 
				"  \n" + 
				"1	Push operando	1\n" + 
				"2	Push operando	1, 2\n" + 
				"+	Sumar: pop, pop y push del resultado 	3\n" + 
				"4	Push operando	3, 4\n" + 
				"*	Multiplicar: pop, pop y push del resultado 	12\n" + 
				"3	Push operando	12, 3\n" + 
				"+	Sumar: pop, pop y push del resultado 	15",r2);
	}
}
