package alik.agent;

public class AlikExceptionMommy503 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy503.class;
	
	public AlikExceptionMommy503()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
