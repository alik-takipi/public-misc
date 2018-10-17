package alik.agent;

public class AlikExceptionRegularNew513 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegularNew513.class;
	
	public AlikExceptionRegularNew513()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
