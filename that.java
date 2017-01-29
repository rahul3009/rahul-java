class that1{
		int a,b;
	public that1()
	{
		a=20;
		b=30;
	}
	public void value()
	{
		a=2;
		b=3;
		System.out.print("value of a is",+a);
		System.out.print("value of b is",+b);
		System.out.print("value of a",+this.a);
		System.out.print("value of b",+this.b);
	}
	public static void main(String []args)
	{
		that1 t1=new that();
		t1.value();
	}
}

		
		