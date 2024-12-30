package day7Exercixe;
interface Shape{
	void getArea();
}
class Rectangle implements Shape{
	final int length ;
	final int height;
	public Rectangle(int l, int h) {
		length = l;
		height = h;
	}

	@Override
	public void getArea(){
		System.out.println("the area of rectangle is "+ length * height );
	}
}
class Circle implements Shape{
	final int radius;
	public Circle(int r) {
		radius = r;
	}

	@Override
	public void getArea() {
		System.out.println("the area of circle is "+ 3.14*radius);
		
	}
}
class Triangle implements Shape{
	final int height;
	final int base;
	public Triangle(int h, int b) {
		height = h;
		base = b;
	}

	@Override
	public void getArea() {
		System.out.println("the area of triangle is "+ (height*base)/2);
	}
}
public class ShapesInterface {
	public static void main(String a[]) {
		  Rectangle robj = new Rectangle(7,9);
		  robj.getArea();
		  Triangle tobj = new Triangle(7,4);
		  tobj.getArea();
		  Circle cobj = new Circle(9);
		  cobj.getArea();
	}
 
  
 
}
