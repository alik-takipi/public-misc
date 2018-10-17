package alik.agent;

public class AlikExceptionRegular504 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular504.class;
	
	public AlikExceptionRegular504()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
