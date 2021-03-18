package objectCodeTest;

public class Order {
	long o_num;
	String c_id;
	String o_date;
	String c_name;
	String p_num;
	String c_adress;
	
	public void order_print() {
		System.out.println("주문 번호 : "+this.o_num+"\n"+
							"주문자 아이디 : "+ this.c_id+"\n"+
							"주문 날짜 : "+this.o_date+"\n"+
							"주문자 이름 : "+this.c_name+"\n"+
							"주문 상품 번호 : "+this.p_num+"\n"+
							"배송 주소 : "+this.c_adress);
	}
}
