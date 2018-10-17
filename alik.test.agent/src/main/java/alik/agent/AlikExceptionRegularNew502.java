package alik.agent;

public class AlikExceptionRegularNew502 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegularNew502.class;
	
	public AlikExceptionRegularNew502()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
