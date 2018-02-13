package commanddesignpattern;


public class CommandNovo 
	extends Command
{
	
	public CommandNovo(Receiver r) {
		super(r);
	}
	
	public void execute()
	{
		receiver.novo();
	}
}