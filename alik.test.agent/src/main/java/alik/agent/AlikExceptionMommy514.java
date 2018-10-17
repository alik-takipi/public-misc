package alik.agent;

public class AlikExceptionMommy514 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy514.class;
	
	public AlikExceptionMommy514()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
