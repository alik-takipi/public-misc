package alik.agent;

public class ThrowerMommy506 implements Runnable
{
	@Override
	public void run()
	{
		// In Mommy
		System.out.println("In Mommy");
		throw new AlikExceptionMommy506();
	}
}
