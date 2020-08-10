package SHAPE;

public class rectangle extends Shape {
	private int w;
	private int h;
	
	public double area() {
		res=w*h;
		return res;
	}
	public void show() {
		System.out.println("사각형의 넓이="+res);
	}
	public void setW(int w) {
		this.w = w;
	}
	public void setH(int h) {
		this.h = h;
	}
	
}
