package alik.agent;

public class AlikExceptionPack500 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack500.class;
	
	public AlikExceptionPack500()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
