/*
 * This program is designed to test my knowledge of interface by making several classes implement the 
 * carbonfootprint interface. 
 * 
 * Author: Han Joseph
 */

package proj8;

import java.util.ArrayList;


public class testinterface {

	public static void main(String[] args) {
		Bicycle a = new Bicycle();
		Building b = new Building();
		Car c = new Car();
		
		a.getCarbonFootprint(506);
		b.getCarbonFootprint(56);
		c.getCarbonFootprint(4.6);
		
		ArrayList<CarbonFootprint> carbon = new ArrayList<>();
		
		
		carbon.add(a);
		carbon.add(b);
		carbon.add(c);
		
		
		for(int j=0;j<3;j++){
			System.out.println(carbon.get(j));
			
		}
		

	}

}
