package alik.agent;

public class ThrowerPack506 implements Runnable
{
	@Override
	public void run()
	{
		// In Pack
		System.out.println("In Pack");
		throw new AlikExceptionPack506();
	}
}
