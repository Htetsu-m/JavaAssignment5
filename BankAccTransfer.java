package Assignment2;

public class BankAccTransfer {
	String id;
	String name;
	int amt=0;
	public BankAccTransfer(String id, String name, int amt) {
		super();
		this.id = id;
		this.name = name;
		this.amt = amt;
	}
	public void credit(int amt) {
		this.amt+=amt;
		System.out.println(show());
	}
	public void debit(int deb) {
		if(this.amt>deb) {
			amt-=deb;
			System.out.println(show());
		}
		else {
			System.out.println("Not enough balance");
		}
	}
	public void Transfer(BankAccTransfer another,int deb) {
		System.out.println("Transfer to "+another.name+","+"Amount "+deb);
		if(this.amt>deb) {
			this.debit(deb);
			another.credit(deb);
		}
		else {
			System.out.println("Transfer amount is exceed than your balance");
		}
	}
	
	public String show() {
		String str="Id :"+this.id+","+"Name :"+this.name+","+"Balance :"+this.amt;
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccTransfer b1=new BankAccTransfer("1","Aung Aung",20000);
		BankAccTransfer b2=new BankAccTransfer("2","Ko Ko",30000);
		System.out.println(b1.show());
		System.out.println(b2.show());
		b2.Transfer(b1, 2000);
		
	}
}
