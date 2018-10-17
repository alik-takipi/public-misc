package alik.agent;

public class Delegator2 extends RunnableDecorator
{
	public Delegator2(Runnable decorated) {
		super(decorated);
	}
	
	@Override
	public void run()
	{
		decorated.run();
	}
}
