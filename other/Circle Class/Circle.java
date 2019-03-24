 class Circle {
	//instance variable
	//double radius=1.0; // default accessibility
	private double radius = 1.0; // private accessibility
	//public double radius = 1.0; // public accessibility
		
	//static variable or class variable
	private static int numberOfObjects=0;

	/** Construct a circle object */
	Circle() {
	  radius = 5.0;
	  numberOfObjects++;
	}
	
	/** Construct a circle object */
	/*Circle(double newRadius) {
	  radius = newRadius; 	  
	}*/
	
	Circle(double radius) {
	  this.radius = radius; 
	  numberOfObjects++;	  
	}
	//static method or class method	
	public static int getNumberOfObjects(){
    	return numberOfObjects;
    }

	//get method
	public double getRadius(){
		return radius;
	}
		
	//set method1- using local variable newRadius
	public void setRadius(double newRadius){
		radius=newRadius;
	}
	
	//set method2 - using instance variable radius
	/*public void setRadius(double radius){
		this.radius=radius;
	}*/
	//set method3 - validate radius value
	/*public void setRadius(double newRadius){
		radius=(newRadius>=0)?newRadius:0;
	}*/
	
	/** Return the area of this circle */
	double findArea() {
	  return radius * radius * 3.14159;
	}
	
	public String printCircle( )
	{
		String info;
		info = "Circle's radius= " + getRadius( ) + ",Area = " + findArea( );
		return info;
	}

 
 }