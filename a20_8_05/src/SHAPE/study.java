package SHAPE;

public class study {
	public static void poly(Shape n)
	{
		if(n instanceof circle)
		{
			circle cx=(circle) n;
			cx.setR(5);
			cx.area();
			cx.show();
		}
		else if(n instanceof rectangle)
		{
			rectangle rx=(rectangle) n;
			rx.setH(10);
			rx.setW(5);
			rx.area();
			rx.show();
		}
		else if(n instanceof triangle)
		{
			triangle tx=(triangle) n;
			tx.setH(5);
			tx.setW(10);
			tx.area();
			tx.show();
		}
}
}