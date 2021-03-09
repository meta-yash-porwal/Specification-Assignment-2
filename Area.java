/**
 * Area is used to calculate area of triangle, rectangle, square, circle
 * By using methods of that
 * @author yash.porwal_metacube
 *
 */
public class Area {
	
	
	/**
	 * to calculate area of triangle
	 * @param base in double value, the base of triangle 
	 * @param height in double value, the height of triangle
	 * @return the area of triangle in double
	 */
	public double triangle(double base,double height){
		return (base*height)/2;
	}
	
	/**
	 * to calculate area of rectangle
	 * @param length in double, length of rectangle
	 * @param breadth in double, breadth of rectangle
	 * @return the area of rectangle in double 
	 */
	public double rectangle(double length,double breadth)
	{
		return length*breadth;
	}
	
	/**
	 * it calculates area of square
	 * @param side in double, side of square
	 * @return the area of square in double
	 */
	public double square(double side)
	{
		return side*side;
	}
	
	/**
	 * to calculate the area of circle
	 * @param radius in double, the radius of circle
	 * @return the area of circle in double
	 */
	public double circle(double radius)
	{
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args)
	{
		Area area=new Area();  // object of Area class
		System.out.print("\nThe Area of the Triangle with base 10 and height 10 is : ");
		System.out.println(area.triangle(10, 10));
		System.out.print("\nThe Area of the Circle with radius 5.5 is : ");
		System.out.println(area.circle(5.5));
		System.out.print("\nThe Area of the Rectangle with length 7.8 and breadth 8.9 is : ");
		System.out.println(area.rectangle(7.8, 8.9));
		System.out.print("\nThe Area of the Square with side 10 is : ");
		System.out.println(area.square(10));
	}

}