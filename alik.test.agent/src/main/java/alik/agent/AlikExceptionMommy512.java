package alik.agent;

public class AlikExceptionMommy512 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy512.class;
	
	public AlikExceptionMommy512()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
