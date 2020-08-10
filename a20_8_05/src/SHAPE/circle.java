package SHAPE;

public class circle extends Shape {
	private int r;

	public double area() {
		res=r*r*Math.PI;
		return res;
	}
	public void show() {
		System.out.println("¿ø³ÐÀÌ="+res);
	}
	public void setR(int r) {
		this.r = r;
	}
	
}
