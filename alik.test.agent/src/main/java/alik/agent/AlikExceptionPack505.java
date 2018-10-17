package alik.agent;

public class AlikExceptionPack505 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack505.class;
	
	public AlikExceptionPack505()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
