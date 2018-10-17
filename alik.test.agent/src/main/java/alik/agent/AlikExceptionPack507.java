package alik.agent;

public class AlikExceptionPack507 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack507.class;
	
	public AlikExceptionPack507()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
