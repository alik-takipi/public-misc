package alik.agent;

public class AlikExceptionPack510 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack510.class;
	
	public AlikExceptionPack510()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
