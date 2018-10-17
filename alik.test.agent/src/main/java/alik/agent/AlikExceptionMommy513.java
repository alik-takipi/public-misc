package alik.agent;

public class AlikExceptionMommy513 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy513.class;
	
	public AlikExceptionMommy513()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
