class that1{
		int a=200,b=300;
	public that1()
	{
		a=200;
		b=300;
	}
	public void value()
	{
		int a=20;
		int b=30;
		System.out.println("value of a is"+a);
		System.out.println("value of b is"+b);
		System.out.println("value of a"+this.a);
		System.out.println("value of b"+this.b);
	}
	public static void main(String []args)
	{
		that1 t1=new that1();
		t1.value();
	}
}

		
		