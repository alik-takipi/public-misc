package alik.agent;

public class AlikExceptionPack511 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack511.class;
	
	public AlikExceptionPack511()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
