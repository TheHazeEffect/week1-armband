package armband;

import ap.lib.iArmbandMachine;

public class ArmbandMachine 
	implements iArmbandMachine
{

	public float getCost(float price, int quantity) {
		return price * quantity;
	}

}
