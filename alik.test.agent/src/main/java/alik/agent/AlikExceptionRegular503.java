package alik.agent;

public class AlikExceptionRegular503 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular503.class;
	
	public AlikExceptionRegular503()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
