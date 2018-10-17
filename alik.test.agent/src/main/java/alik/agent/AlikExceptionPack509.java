package alik.agent;

public class AlikExceptionPack509 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack509.class;
	
	public AlikExceptionPack509()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
