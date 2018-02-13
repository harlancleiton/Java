package commanddesignpattern;


public interface ICommand {
	public void setReceiver( Receiver receiver );
	public Receiver getReceiver();
	public void execute();
}