public class CircleMain {       
 
    public static void main(String[] args) {
       Circle[] c = new Circle[5];
	   c[0]= new Circle(3);
	   c[1]= new Circle(6);
	   c[2]= new Circle(4);
	   c[3]= new Circle(8);
	   c[4]= new Circle(5);
	  
	   	
	   	System.out.println("Circle Objects:");
	   	for( int counter =0;counter <=4; counter++){
	   		System.out.println(c[counter].printCircle( ));
	   	}		

       
       //Circle c1 = new Circle(); // 1st circle object
       //Circle c2 = new Circle(3); // 2nd circle object
       //Circle c3 = new Circle(); 
       	
       //c1.setRadius(3.0);
       //System.out.println("c1 circle object"); 
       //System.out.println("radius:" + c1.getRadius());        
       //System.out.println("Area:" +  c1.findArea());
      // System.out.println(c1.printCircle());
       
       //update c2 object's radius to 8.0
       //c2.setRadius(8.0);
       
       
       //System.out.println("c2 circle object");       
       //System.out.println("radius:" + c2.getRadius());        
       //System.out.println("Area:" +  c2.findArea());
       //System.out.println(c2.printCircle());
       
       
       //System.out.println("Number of circle object created:"
       //	+ Circle.getNumberOfObjects());  //static method

       //call printCircle method
       //printCircle(c1);
       //printCircle(c2);
       
    }//end of main method
        //method to print Circle 's object
    /*public static void printCircle(Circle c){
    	System.out.println("Area:" + c.findArea());
    	System.out.println("Radius:" + c.getRadius());   	
    	
    }*/

}
