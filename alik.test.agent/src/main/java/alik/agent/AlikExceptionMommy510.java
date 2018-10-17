package alik.agent;

public class AlikExceptionMommy510 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy510.class;
	
	public AlikExceptionMommy510()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
