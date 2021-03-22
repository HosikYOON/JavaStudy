package hidingMakeMyself;

public class MydateTest {
	
	public static void main(String[] args) { 
		Mydate mydate1 = new Mydate(11,11,2011);
		System.out.println(mydate1.isValid());
		Mydate mydate2 = new Mydate(33,21,2011);
		System.out.println(mydate2.isValid());
	}
}
