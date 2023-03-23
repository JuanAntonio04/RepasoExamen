package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.*;

public class DepositoTest {
	
	Deposito deposito1;
	
	@BeforeEach
	public void CrearDeposito() {
		
		deposito1 = new Deposito(2,2,"dep1");
		
	}
	
	@Test
	public void Test1() {
		
		assertEquals(2, deposito1.getAltura());
		assertEquals(2, deposito1.getDiametro());
		assertEquals("dep1", deposito1.getIdDeposito());

	}
	
	@Test
	public void TestSets() {
		
		deposito1.setValoresDeposito("dep1.2", 2, 2);
		deposito1.setValoresDeposito("", 3213, 4567);
		
	}
	
	@Test
	public void TestValorCapacidad() {
		
		assertEquals(6.2832, deposito1.valorCapacidad());
		
	}
	
}
