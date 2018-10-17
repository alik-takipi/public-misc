package alik.agent;

public class AlikExceptionMommy507 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy507.class;
	
	public AlikExceptionMommy507()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
