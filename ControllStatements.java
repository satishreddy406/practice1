public class ControllStatements {

	public static void main(String args[]){
		
		boolean x = false;
		boolean y = false;
		//if else
		if(x) {
			System.out.println("Inside if"); 
		} else if(y) {
			System.out.println("Inside else if"); 
		} else {
			System.out.println("Inside else");
		}
		
		//do while
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 0);
		
		
		//while
		int a = 1;
		while(a <= 10) {
			System.out.println(a);
			a++;
		}
		
		//for loop
		for(int n=1; n<=5; n++) {
			System.out.println(n);
		}

	}
}