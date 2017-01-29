
class Enum
{
	enum Mobile
{
	APPLE(20),
	SAMSUNG,
	HTC;
	int price;
     Mobile()
	{
		price=0;
		System.out.println("u r in constructor");
	}
	 Mobile(int p)
	{
		price=p;
	}
}
	public static void main(String []args)
	{
		
		System.out.println(Mobile.APPLE.price);
	}
}