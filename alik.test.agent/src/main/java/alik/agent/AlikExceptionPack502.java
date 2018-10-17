package alik.agent;

public class AlikExceptionPack502 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack502.class;
	
	public AlikExceptionPack502()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
