package JavOops;
class cylinder {
	private int radius;
	private int height;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double surfaceArea() {
		return 2*3.14*radius*radius + 2 * 3.14*radius*height;
	}
	
	public double volume() {
		return 3.142*radius*radius*height;	
	}
}
public class Oop_5_class {
	
	public static void main(String[] args) {
		//
     cylinder mycylinder = new cylinder();
     mycylinder.setHeight(15);
     int h = mycylinder.getHeight();
     System.out.println("height is :" + h);
     
     mycylinder.setRadius(22);
     int z = mycylinder.getRadius();
     System.out.println("radius is : "  + z);
      
     System.out.println("surface area is : " + mycylinder.surfaceArea());
     
     System.out.println("volume is : " + mycylinder.volume());
	}

}
