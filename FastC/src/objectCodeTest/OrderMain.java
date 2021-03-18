package objectCodeTest;

public class OrderMain {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.o_num = 201907210001l;
		order.c_id = "abc123";
		order.o_date="2021년 3월 18일";
		order.c_name = "윤호식";
		order.p_num = "PD0345-12";
		order.c_adress = "서울기 영등포구 여의도동 20번지";
		
		order.order_print();
		
	}

}
