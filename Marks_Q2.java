import java.util.Scanner;

public class Marks_Q2 {
	
	public static void main(String args[]){
		int student=0;
		int distinction=0;
		int pass=0;
		int fail=0;
		int invalid=0;
		while (true){
		System.out.print("Input a mark: ");
		Scanner scan=new Scanner(System.in);
		int mark=Integer.parseInt(scan.nextLine());
		
			if(mark==-1){
				break;
			}
			else if(mark>=70&&mark<=100){
				distinction++;
				student++;
			}else if(mark>=50&&mark<=69){
				pass++;
				student++;
			}else if(mark>=0&&mark<=49){
				fail++;
				student++;
			}else {	
				invalid++;
				student++;
			}
			
		}
		System.out.println("There are "+student+" students: "+distinction+" distinctions, "+pass+" pass, "+fail+" fails (plus "+invalid+" invalid).");
	}
	
}
