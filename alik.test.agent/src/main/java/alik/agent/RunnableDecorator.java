package alik.agent;

public abstract class RunnableDecorator implements Runnable
{
	protected final Runnable decorated;
	
	public RunnableDecorator(Runnable decorated) {
		this.decorated = decorated;
	}
}
