package alik.agent;

public class AlikExceptionMommy508 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy508.class;
	
	public AlikExceptionMommy508()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
