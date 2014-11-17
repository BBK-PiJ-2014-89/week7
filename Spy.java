
public class Spy {
	private static int spyCount;
	private int ID;
	private Spy nextSpy;
	
	Spy(int newID){
		ID=newID;
		spyCount++;
		//this.nextSpy=null;
		System.out.println(getNumberOfSpies());
 	}
	
	public void die(){
		System.out.print("Spy " +ID+" has been detected and eliminated");
		spyCount--;
		System.out.println(", number of spies left alive "+getNumberOfSpies());
	}
	
	public static int getNumberOfSpies() {
		return spyCount;
		
	}
	
	
	 

		public static void main(String[] args) {
			Spy s1=new Spy(12);
			Spy s2=new Spy(22);
			Spy s3=new Spy(34);
			s2.die();
			
		}

	
}
