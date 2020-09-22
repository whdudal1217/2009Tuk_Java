package abstractPrc;

public class EMailSender extends MessageSender{
	
	String senderAddr;
	String emailBody;
	
	public EMailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	@Override
	void sendMessage(String recipient) {
		System.out.println("---------이메일 전송 -----------");
		System.out.println("제    목 : " + title);
		System.out.println("발 신 자 : " + senderName);
		System.out.println("수 신 자 : " + recipient);
		System.out.println("발신자 주소 : " + senderAddr);
		System.out.println("이메일 내용 : " + emailBody);
		System.out.println();
		
	}

}
