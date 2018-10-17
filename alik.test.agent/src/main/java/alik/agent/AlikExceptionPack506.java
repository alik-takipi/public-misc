package alik.agent;

public class AlikExceptionPack506 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack506.class;
	
	public AlikExceptionPack506()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
