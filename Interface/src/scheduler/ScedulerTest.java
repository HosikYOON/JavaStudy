package scheduler;

import java.io.IOException;

public class ScedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���");
		System.out.println("R : �� �� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("p : �������� ���� ���켱 ���õ� ���� ����");
		
		int ch = System.in.read();
		
		Scheduler schedeler = null;
		
		if( ch == 'R' || ch=='r') {
			schedeler = new RoundRobin();
		}else if( ch == 'L' || ch == 'l') {
			schedeler = new LeastJob();
		}else if(ch == 'P' || ch =='p') {
			schedeler = new PriorityAllocation();
		}else{
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		schedeler.getNextCall();
		schedeler.sendCallToAgent();
	}	
}
