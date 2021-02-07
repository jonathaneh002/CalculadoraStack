package calculadorastack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadorastack.CalculadoraStack;
import calculadorastack.ProtCalculadora;

class TestCalculadora {
	    
		@Test
		void test1() {
			ProtCalculadora p = new ProtCalculadora();
			int r1 = p.division(1, 2);
			assertEquals(2,r1);
		}
		
		@Test
		void test2() {
			ProtCalculadora p = new ProtCalculadora();
			int r2 = p.multiplicacion(3, 2);
			assertEquals(6,r2);
		}
		
		@Test
		void test5() {
			ProtCalculadora p = new ProtCalculadora();
			int r1 = p.division(2, 1);
			assertEquals(0,r1);
		}
		
		@Test
		void test3() {
			ProtCalculadora p = new ProtCalculadora();
			int r1 = p.suma(1, 2);
			assertEquals(3,r1);
		}
		
		@Test
		void test4() {
			ProtCalculadora p = new ProtCalculadora();
			int r1 = p.resta(1, 2);
			assertEquals(1,r1);
		}
		
		@Test
		void test6() {
			ProtCalculadora p = new ProtCalculadora();
			int r1 = p.resta(2, 1);
			assertEquals(-1,r1);
		}
		
	}

