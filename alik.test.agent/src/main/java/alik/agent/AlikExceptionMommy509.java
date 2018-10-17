package alik.agent;

public class AlikExceptionMommy509 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy509.class;
	
	public AlikExceptionMommy509()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
