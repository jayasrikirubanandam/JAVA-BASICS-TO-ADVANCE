package LooslyCoupled;

public class ToBeSend  {

	private Notification stream;

	
	//constructor Injection
	public ToBeSend() {
		
	}
	public ToBeSend(Notification stream) {
		this.stream = stream;
	}
	//setterInjection
	public void setStream(Notification stream) {
		this.stream = stream;
	}

	public void processing(String whichWay) {
		stream.sendNotification(whichWay);
	}
	
	
}
