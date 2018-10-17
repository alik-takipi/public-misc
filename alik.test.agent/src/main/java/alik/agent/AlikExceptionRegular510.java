package alik.agent;

public class AlikExceptionRegular510 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular510.class;
	
	public AlikExceptionRegular510()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
