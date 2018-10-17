package alik.agent;

public class AlikExceptionMommy500 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy500.class;
	
	public AlikExceptionMommy500()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
