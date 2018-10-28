class rectangle{
	int length;
	int breadth;
	public void CalculateArea(int length, int breadth){
		System.out.println("Area = " + (length*breadth));
	}
	public static void main(String[] args){
		rectangle rc=new rectangle();
		rc.CalculateArea(6,4);
	}
}