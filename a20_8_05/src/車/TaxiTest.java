package �;
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
		System.out.println("�𵨸�="+model+", ����="+color);
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
		System.out.println("�ýø�Ÿ��="+TaxiMeter+", ���="+TaxiFare);
	}
	
	
}
public class TaxiTest {
	// int a=10;	(0)
	//double b=a;	(0) ������ ����ȯ
	//double b=(double) a;  ��ĳ��Ʈ
	//���ʹ�(ũ��)=�����ʹ�(������)
	//double a=10.5;	(0)
	//int b=a;		(x)�����Ͽ���
	//int b=(int) a; (0)�ٿ�ĳ��Ʈ
	//car kim=new taxi();
	//taxi park=(taxi) kim; �ٿ�ĳ��Ʈ
	public static void main(String[] args) {
		taxi kim= new taxi();
		kim.show();
		taxi lee=new taxi(true, 3000);
		lee.show();
		car park=new car("���","���");
		park.show();
		car kimu=new taxi("�ҳ�Ÿ","ȸ��",true,3400);
		kimu.show();
		
	}

}
