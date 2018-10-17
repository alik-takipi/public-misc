package alik.agent;

public class AlikExceptionMommy504 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy504.class;
	
	public AlikExceptionMommy504()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
