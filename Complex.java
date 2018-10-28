class Complex{
	int real;
	int imaginary;
	void Display(int real, int imaginary){
		System.out.println(real+"+("+imaginary+"i)");
	}
	public static void main(String[] args){
		Complex c=new Complex();
		c.Display(3,-9);
	}
}