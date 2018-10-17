package alik.agent;

public class AlikExceptionPack501 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack501.class;
	
	public AlikExceptionPack501()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
