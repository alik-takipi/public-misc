package alik.agent;

public class AlikExceptionRegular507 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular507.class;
	
	public AlikExceptionRegular507()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
