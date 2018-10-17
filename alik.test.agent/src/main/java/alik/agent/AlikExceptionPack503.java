package alik.agent;

public class AlikExceptionPack503 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack503.class;
	
	public AlikExceptionPack503()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
