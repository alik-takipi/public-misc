package alik.agent;

public class AlikExceptionRegularNew500 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegularNew500.class;
	
	public AlikExceptionRegularNew500()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
