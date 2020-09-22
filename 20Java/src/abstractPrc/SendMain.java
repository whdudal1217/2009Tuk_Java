package abstractPrc;

public class SendMain {
	public static void main(String[] args) {
		EMailSender email = new EMailSender("결제 완료", "17번가", "order@17st.co.kr", "고객님께서 주문하신 상품이 결제완료 됨.");
		SMSSender sms1 = new SMSSender("결제 완료", "17번가", "order@17st.co.kr", "고객님께서 주문하신 상품이 결제완료 됨.");
		EMailSender email2 = new EMailSender("배송완료", "17번가", "order@17st.co.kr", "고객님께서 주문하신 상품이 배송완료 됨.");
		SMSSender sms2 = new SMSSender("배송완료", "17번가", "order@17st.co.kr", "고객님께서 주문하신 상품이 배송완료 됨.");
		
		send(email, "san@naver.com");
		send(sms1, "010-1234-5678");
		send(email2, "san@naver.com");
		send(sms2, "010-1234-5678");
	}

	private static void send(MessageSender ms, String string) {
		ms.sendMessage(string);
	}
}
