package week1.day1;

public class Mobile {

	
	public void makeCall() {
		String mobileModel="iphone14promax";
		float mobileWeight=8.14f;
		System.out.println("MobileMode "+mobileModel);
		System.out.println("MobileWeight "+mobileWeight);
	}
	
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=150000;
		System.out.println("isFullCharged "+isFullCharged);
		System.out.println("MobileWeight "+mobileCost);
		
		
		
	}
	
	public static void main(String[] args) {
		
		Mobile mob=new Mobile();
		
		mob.makeCall();
		mob.sendMsg();
		
		System.out.println("This is my mobile");
		
	}

}
