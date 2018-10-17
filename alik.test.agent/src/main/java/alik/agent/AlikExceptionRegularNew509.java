package alik.agent;

public class AlikExceptionRegularNew509 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegularNew509.class;
	
	public AlikExceptionRegularNew509()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
