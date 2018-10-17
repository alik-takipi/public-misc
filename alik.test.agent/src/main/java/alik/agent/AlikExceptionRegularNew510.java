package alik.agent;

public class AlikExceptionRegularNew510 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegularNew510.class;
	
	public AlikExceptionRegularNew510()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
