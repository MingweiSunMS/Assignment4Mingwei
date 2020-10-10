
public class Cylinder extends Circle{
	
	private double height;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double height) {
		this.height=height;
	}
	
	public Cylinder(double height, double radius) {
		super(radius);
		this.height=height;
	}
	
	public Cylinder(double height, double radius, String color) {
		super(radius, color);
		this.height=height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	
	public double getVolumn() {
		return super.getArea()*this.height;
	}
	
	@Override
	public double getArea() {
		return 2*Math.PI*(super.getRadius()+this.height)*super.getRadius();
	}
}
