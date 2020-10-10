
public class CircleAndCylinderTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setRadius(2.0);
		circle1.setColor("Yellow");
		System.out.println("The radius of circle 1 is " + circle1.getRadius() + " color is " + circle1.getColor()
				+ " and the area is " + circle1.getArea());

		Cylinder cylinder1 = new Cylinder();
		cylinder1.setHeight(1.0);
		cylinder1.setRadius(1.0);
		cylinder1.setColor("Red");
		System.out.println("The radius of cylinder 1 is " + cylinder1.getRadius() + " Height is "
				+ cylinder1.getHeight() + " color is " + cylinder1.getColor() + " and the area is "
				+ cylinder1.getArea() + " and volumn is " + cylinder1.getVolumn());
		
		Cylinder cylinder2 = new Cylinder(5.0,2.0);
		cylinder2.setColor("Red");
		
		System.out.println("The radius of cylinder 2 is " + cylinder2.getRadius() + " Height is "
				+ cylinder2.getHeight() + " color is " + cylinder2.getColor() + " and the area is "
				+ cylinder2.getArea() + " and volumn is " + cylinder2.getVolumn());
		

	}

}
