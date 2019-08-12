package myPack;

public class VariableStack implements Stack {
	int iSize;
	int currSize;
	int [] st;
	VariableStack(int iSize) {
		this.iSize=iSize;
		currSize=0;
		st=new int[iSize];
	}
	@Override
	public void push(int I) {
		if(currSize+1>iSize) {
			int [] temp=new int[iSize+10];
			for(int i=0;i<iSize;i++) {
				temp[i]=st[i];
			}
			iSize+=10;//this is kind of arbitrary but increasing every time above initial limit seems wasteful
			temp[currSize++]=I;
			st=new int[iSize];
			for(int i=0;i<temp.length;i++) {
				st[i]=temp[i];
			}
		}
		else {
			st[currSize++]=I;
		}
	}

	@Override
	public int pop() {
		return st[--currSize];
	}

}
