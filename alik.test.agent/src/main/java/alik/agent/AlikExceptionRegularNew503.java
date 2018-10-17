package alik.agent;

public class AlikExceptionRegularNew503 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegularNew503.class;
	
	public AlikExceptionRegularNew503()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
