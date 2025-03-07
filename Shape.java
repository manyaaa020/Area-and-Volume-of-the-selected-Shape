abstract class Shape{
	protected double dim_one,dim_two,dim_three;
	int num_sides;
	
	// Zero parameter constructor
	public Shape(){
		dim_one=dim_two=dim_three=0;
		num_sides=0;
	}
	// Parameterized Constructor
	public Shape(double dim_one, double dim_two, double dim_three, int num_sides){
		this.dim_one=dim_one;
		this.dim_two=dim_two;
		this.dim_three=dim_three;
		this.num_sides=num_sides;
	}
		
	abstract double calculateArea();
	abstract double calculatePerimeter();
	public int getNumSides(){
		return num_sides;
	}
}
		