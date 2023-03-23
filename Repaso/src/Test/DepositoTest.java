package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.*;

public class DepositoTest {
	
	Deposito deposito1;
	
	@BeforeEach
	public void CrearDeposito() {
		
		deposito1 = new Deposito(3234,2423,"dep1");
		
	}
	
	@Test
	public void Test1() {
		
		assertEquals(2423, deposito1.getAltura());
		assertEquals(3234, deposito1.getDiametro());
		assertEquals("dep1", deposito1.getIdDeposito());

	}
	
}
