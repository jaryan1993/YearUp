
public class CalculateArea {

	public static void main(String[] args) 
	{
		System.out.println("I am going to calculate the area of a circle ");
		double CircleInMainMethod= CalculateCircleArea(10);
		double secondCircleArea = CalculateCircleArea(5);
		System.out.println("Area of the circle is "+ CircleInMainMethod + " and "+ secondCircleArea );
    }

    public static double CalculateCircleArea(int radius)
    {
    	//This method calculates the area of a circle
    	//Input:  integer radius value
    	//Output:  double area
    	
    	double area = 3.14 * radius * radius;
		return area; 
		
    }
    
    public static double AreaRect(int width, int length)
    {
    	
    	double area= length * width;
    	
    	
    	System.out.println("I am going to calculate the area of a rectangle");
    	double rectangleAreainMainMethod = AreaRect(20, 3);
    	System.out.println("Area of the rectangle is" + rectangleAreainMainMethod);
    	return area;
    	}

    	
    }
