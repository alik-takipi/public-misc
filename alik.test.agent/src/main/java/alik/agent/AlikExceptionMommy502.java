package alik.agent;

public class AlikExceptionMommy502 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy502.class;
	
	public AlikExceptionMommy502()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
