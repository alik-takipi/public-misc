package alik.agent;

public class AlikExceptionRegular502 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular502.class;
	
	public AlikExceptionRegular502()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
