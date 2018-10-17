package alik.agent;

public class AlikExceptionPack504 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack504.class;
	
	public AlikExceptionPack504()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
