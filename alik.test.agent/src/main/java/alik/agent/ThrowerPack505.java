package alik.agent;

public class ThrowerPack505 implements Runnable
{
	@Override
	public void run()
	{
		// In Pack
		System.out.println("In Pack");
		throw new AlikExceptionPack505();
	}
}
