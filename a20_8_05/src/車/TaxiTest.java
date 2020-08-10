package 車;
class car{
	protected String model;
	protected String color;
	
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public car()
	{
	}
	public car(String model, String color)
	{
		super();
		this.color=color;
		this.model=model;
	}
	public void show()
	{
		System.out.println("모델명="+model+", 색상="+color);
	}
}

class taxi extends car{
	private Boolean TaxiMeter;
	private int TaxiFare=3300;
	public taxi() {
		super();
	}
	public taxi(String model, String color) {
		super(model, color);
	}
	public taxi(String model, String color, Boolean TaxiMeter, int TaxiFare) {
		super(model, color);
		this.TaxiMeter = TaxiMeter;
		this.TaxiFare = TaxiFare;
	}
	public taxi(Boolean TaxiMeter, int TaxiFare) {
		super();
		this.TaxiMeter = TaxiMeter;
		this.TaxiFare = TaxiFare;
	}
	public void show()
	{
		super.show();
		System.out.println("택시메타기="+TaxiMeter+", 요금="+TaxiFare);
	}
	
	
}
public class TaxiTest {
	// int a=10;	(0)
	//double b=a;	(0) 묵시적 형변환
	//double b=(double) a;  업캐스트
	//왼쪽방(크면)=오른쪽방(작은값)
	//double a=10.5;	(0)
	//int b=a;		(x)컴파일에러
	//int b=(int) a; (0)다운캐스트
	//car kim=new taxi();
	//taxi park=(taxi) kim; 다운캐스트
	public static void main(String[] args) {
		taxi kim= new taxi();
		kim.show();
		taxi lee=new taxi(true, 3000);
		lee.show();
		car park=new car("모닝","흰색");
		park.show();
		car kimu=new taxi("소나타","회색",true,3400);
		kimu.show();
		
	}

}
