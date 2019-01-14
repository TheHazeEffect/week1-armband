package armband;

import ap.lib.iArmbandMachine;

public class Driver {
	public static void main(String args[]){
		iArmbandMachine machine = 
				new ArmbandMachine();
		System.out.println("Cost : " + machine.getCost(3,5)); 
	}
}
