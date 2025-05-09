package LooslyCoupled;

public class Launch01 {

	public static void main(String[] args) {
		
		Notification email =  s ->System.out.println("Notification send via " +s);
		
		Notification sms = s -> System.out.println("Notification send via "+s);
		Notification pushNotification = s -> System.out.println("Notification send via +"+s);

		
		ToBeSend sent0 = new ToBeSend(email);
		sent0.processing(" emailLess");
		
		ToBeSend sent = new ToBeSend();
		sent.setStream(email);
		sent.processing("email");
		
		ToBeSend sent1 = new ToBeSend();
		sent1.setStream(sms);
		sent1.processing("SMS");

		ToBeSend sent2 = new ToBeSend();
		sent2.setStream(pushNotification);
		sent2.processing("PUSH NOTIFICATION");

	}

}
