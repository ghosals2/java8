
public class MethodReferanceDemo {
	
	public static void helloNew() {
		System.out.println("hello ->" + null);
	}
	
	public void helloInstance() {
		System.out.println("Non Static Method" + null);
	}
	
	
	public static void main(String args[]) {
		
		//referencing static method
		sayable s=MethodReferanceDemo::helloNew;
		//invoking call
		s.hello();
		
		MethodReferanceDemo ir=new MethodReferanceDemo();
		//referrencing Non Static methods
		sayable snon=ir::helloInstance;
		//invoking call
		snon.hello();
		//referencing constructor
		Messagable con=Message::new;
		con.getmessage("Referencing for Constructor");
		
		
	}

}
