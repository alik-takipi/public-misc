package alik.agent;

public class AlikExceptionRegularNew505 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegularNew505.class;
	
	public AlikExceptionRegularNew505()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
