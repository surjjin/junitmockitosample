package abhinav;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
//import org.junit.
import static org.mockito.Mockito.*;
//@RunWith(JUnitPlatform.class)
public class TestCalculate {

	Calculate c;
	@Mock
	AddService service;
	@BeforeEach
	public void as() {
		  c=new Calculate(service);
	}
	
	@Test
	public void kuchbhi()
	{
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10, c.complexAdd(2, 3));
	}
}
