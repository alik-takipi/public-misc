package alik.agent;

public class AlikExceptionRegular509 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular509.class;
	
	public AlikExceptionRegular509()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
