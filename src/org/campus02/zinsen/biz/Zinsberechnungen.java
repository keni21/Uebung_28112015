package org.campus02.zinsen.biz;

public class Zinsberechnungen {

	
	
	public double Zinsberechnung(double Kapital, double Tage, double Zinsssatz)
	{
		double Zinsen=0;
		
		Zinsen = Kapital*Tage*Zinsssatz/36000.0;
		return Zinsen;
	}
}
