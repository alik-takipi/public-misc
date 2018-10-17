package alik.agent;

public class AlikExceptionMommy505 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy505.class;
	
	public AlikExceptionMommy505()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
