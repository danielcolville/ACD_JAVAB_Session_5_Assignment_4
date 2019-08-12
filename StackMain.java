package myPack;

public class StackMain {

	public static void main(String[] args) {
		Stack s=new VariableStack(2);
		System.out.println("Adding 1,2, and 3 to Variable stack of size 2");
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println("Popping all elements back off the stack:");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		Stack d=new FixedStack(3);
		System.out.println("Pushing 4 onto fixed stack of size 3");
		d.push(5);
		d.push(7);
		d.push(9);
		d.push(4);
		System.out.println(d.pop());
	}

}
