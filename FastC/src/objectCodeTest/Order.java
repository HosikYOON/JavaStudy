package objectCodeTest;

public class Order {
	long o_num;
	String c_id;
	String o_date;
	String c_name;
	String p_num;
	String c_adress;
	
	public void order_print() {
		System.out.println("�ֹ� ��ȣ : "+this.o_num+"\n"+
							"�ֹ��� ���̵� : "+ this.c_id+"\n"+
							"�ֹ� ��¥ : "+this.o_date+"\n"+
							"�ֹ��� �̸� : "+this.c_name+"\n"+
							"�ֹ� ��ǰ ��ȣ : "+this.p_num+"\n"+
							"��� �ּ� : "+this.c_adress);
	}
}
