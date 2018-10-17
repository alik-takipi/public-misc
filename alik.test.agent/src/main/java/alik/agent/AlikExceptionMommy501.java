package alik.agent;

public class AlikExceptionMommy501 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy501.class;
	
	public AlikExceptionMommy501()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
