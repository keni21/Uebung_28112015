package MayBe;

public class MaybeDemo {

	public static void main(String[] args) {
		MayBe<String> Name=new MayBe<String>("David",MayBe.ZugriffErlaubt);
		Name.Maybeprint();
		
		MayBe<Integer> Wert=new MayBe<Integer>(new Integer(1234123), MayBe.ZugriffErlaubt);
		Wert.Maybeprint();

	}

}
