package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.Zinsberechnungen;

public class ZinsDemo {

	public static void main(String[] args) {
		
		Zinsberechnungen Max = new Zinsberechnungen();
		Zinsberechnungen Claudia = new Zinsberechnungen();
		//Max.Zinsberechnung(1000, 2, 360, 4);

		System.out.println(Max.Zinsberechnung(1000,0.12, 30));
		System.out.println(Claudia.Zinsberechnung(1000,0.13, 30));
		
	
	}

}
