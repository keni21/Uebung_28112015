package MayBe;

public class MayBe <T>{

	private T Name;
	private int status;
	
	public static final int ZugriffErlaubt=1;
	public static final int ZugriffVerweigert=2;
	public static final int NichtAngegeben=3;
	
	
	public MayBe(T name, int status) {
		Name = name;
		this.status = status;
	}
	public void setName(T name) {
		Name = name;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public void Maybeprint()
	{
		switch (status) {
		case ZugriffErlaubt:
			System.out.println(Name);
			break;
		case ZugriffVerweigert:
			System.out.println("Zugriff Verweigert");
			break;
		case NichtAngegeben:
			System.out.println("Keine Daten");
			break;

		default:
			break;
		}
	}
	

}

