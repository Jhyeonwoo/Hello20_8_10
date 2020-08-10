package SHAPE;

public class triangle extends Shape {
	private int w;
	private int h;
	
	public double area() {
		res=w*h/2;
		return res;
	}
	public void show() {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ="+res);
	}
	public void setW(int w) {
		this.w = w;
	}
	public void setH(int h) {
		this.h = h;
	}
	
}
