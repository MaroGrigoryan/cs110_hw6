import shapes.Rectangle;
import shapes.Square;
import utils.Math;
public class Driver {	
	public static void main(String[] args) {
		Square box = new Square(100);
		Rectangle rectangle = new Rectangle(50,80);
		
		System.out.println(box.getArea());
		System.out.println(rectangle.getArea());
		System.out.println(Math.factorial((int)15.6));
		System.out.println(Math.factorialLoop((int)15.6));
		
	}
	
}
