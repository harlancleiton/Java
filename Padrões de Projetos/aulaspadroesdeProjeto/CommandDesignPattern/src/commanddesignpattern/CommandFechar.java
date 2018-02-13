package commanddesignpattern;


public class CommandFechar 
	extends Command
{

	public CommandFechar(Receiver r) {
		super(r);
	}
	
	public void execute()
	{
		receiver.fechar();
	}
}