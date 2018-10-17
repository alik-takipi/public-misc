package alik.agent;

public class ThrowerMommy507 implements Runnable
{
	@Override
	public void run()
	{
		// In Mommy
		System.out.println("In Mommy");
		throw new AlikExceptionMommy507();
	}
}
