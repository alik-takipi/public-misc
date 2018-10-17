package alik.agent;

public class AlikExceptionMommy511 extends RuntimeException
{
	private static final String message = "Threw mommy pack exception: " + AlikExceptionMommy511.class;
	
	public AlikExceptionMommy511()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
