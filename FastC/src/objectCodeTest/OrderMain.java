package objectCodeTest;

public class OrderMain {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.o_num = 201907210001l;
		order.c_id = "abc123";
		order.o_date="2021�� 3�� 18��";
		order.c_name = "��ȣ��";
		order.p_num = "PD0345-12";
		order.c_adress = "����� �������� ���ǵ��� 20����";
		
		order.order_print();
		
	}

}
