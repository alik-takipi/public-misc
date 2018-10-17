package alik.agent;

public class AlikExceptionRegular506 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular506.class;
	
	public AlikExceptionRegular506()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
