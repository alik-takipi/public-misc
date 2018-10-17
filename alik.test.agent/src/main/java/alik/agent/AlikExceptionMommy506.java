package alik.agent;

public class AlikExceptionMommy506 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy506.class;
	
	public AlikExceptionMommy506()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
