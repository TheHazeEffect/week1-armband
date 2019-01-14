package armband;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ap.lib.iArmbandMachine;

public class ArmbandMachineTest {
	
	@Test
	public void shouldCalculateCost(){
		iArmbandMachine machine = 
				new ArmbandMachine();
		assertEquals(15,machine.getCost(3,5),0); 
	}
}
