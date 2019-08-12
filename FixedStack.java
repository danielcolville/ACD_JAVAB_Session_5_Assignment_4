package myPack;

public class FixedStack implements Stack {
	int mSize;
	int currSz;
	int[] st;
	public FixedStack(int mSize) {
		this.mSize=mSize;
		currSz=0;
		st=new int[mSize];
	}
	@Override
	public void push(int I) {
		if(currSz+1<=mSize) {
			st[currSz++]=I;
		}
		else {
			System.out.println("Stack overflow");
		}
	}

	@Override
	public int pop() {
		if(currSz==0) {
			System.out.println("Stack is empty");
			return 0;
		}
		return st[--currSz];
	}

}
