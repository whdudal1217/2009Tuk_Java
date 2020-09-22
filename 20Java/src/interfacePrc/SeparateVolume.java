package interfacePrc;

public class SeparateVolume implements Lendable{
	 String requestNo;
	 String bookTitle;
	 String writer;
	 String borrower;
	 String date;
	 int state;
	
	 SeparateVolume(String requestNo, String bookTitle, String borrower ){
		 this.borrower = borrower;
		 this.requestNo = requestNo;
		 this.bookTitle = bookTitle;
	 }
	 
	@Override
	public void checkIn() {
		this.borrower = null;
		this.date = null;
		this.state = STATE_NORMAL;
	}

	@Override
	public void checkOut(String borrower, String date) {
		if (this.state == STATE_NORMAL) {
			this.borrower = borrower;
			this.date = date;
			this.state = STATE_BORROWED;

			System.out.println(" -------- 단행본 대출 ---------");
			System.out.println("대출인 : " + this.borrower);
			System.out.println("대출날짜 : " + this.date);
			System.out.println("#" + bookTitle + " 단행본이 대출되었습니다.");
		} else {
			System.out.println("#" + bookTitle + " 단행본은 대출 불가합니다.");
		}
		System.out.println();
	}

}
