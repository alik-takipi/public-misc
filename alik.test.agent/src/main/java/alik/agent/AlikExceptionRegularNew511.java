package alik.agent;

public class AlikExceptionRegularNew511 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegularNew511.class;
	
	public AlikExceptionRegularNew511()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
