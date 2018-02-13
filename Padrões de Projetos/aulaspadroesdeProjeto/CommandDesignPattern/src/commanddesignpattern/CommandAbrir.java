package commanddesignpattern;


public class CommandAbrir 
	extends Command
{
	public CommandAbrir(Receiver r) {
		super(r);
	}

	public void execute()
	{
		receiver.abrir();
	}
}