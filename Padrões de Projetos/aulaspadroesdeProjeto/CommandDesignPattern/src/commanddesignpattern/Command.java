package commanddesignpattern;


public abstract class Command 
	implements ICommand
{
	protected Receiver receiver;

	public Command(Receiver r) {
		this.receiver = r;
	}
	
	public void setReceiver( Receiver receiver )
	{
		this.receiver = receiver;
	}

	public Receiver getReceiver()
	{
		return receiver;
	}

	public abstract void execute();
}