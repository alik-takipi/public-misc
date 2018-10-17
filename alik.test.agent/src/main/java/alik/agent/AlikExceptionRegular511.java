package alik.agent;

public class AlikExceptionRegular511 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular511.class;
	
	public AlikExceptionRegular511()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
