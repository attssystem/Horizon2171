import java.util.Scanner; 

public class CSS {
	
	public static void main (String args[]) {
		// Main variables
		int status[] = {0, 0, 0, 0};
		//Add script strings
		
		// Story block (just copy for each step)
	}
	
	// Story block (just copy for each step)
	public static int[] storyBlock(String script, String choice1, String choice2, int humanity1, int relationship1, int networkStatus1, int humanity2, int relationship2, int networkStatus2 , int[] status) {
		Scanner sc = new Scanner(System.in);
		boolean errorBoolean = false;
		String input = "";
		String error = "";
		
		// Story loop (loop in case of wrong input)
		while(!errorBoolean) {
			System.out.println(script);
			System.out.println("\n"+error);
			input = sc.next();
			if(input.equals(choice1)) {
				sc.close();
				status[0] = 1;
				status[1] += humanity1;
				status[2] += relationship1;
				status[3] += networkStatus1;
			}else if(input.equals(choice2)) {
				sc.close();
				status[0] = 2;
				status[1] += humanity2;
				status[2] += relationship2;
				status[3] += networkStatus2;
			}else {
				error = "Votre réponse n'est pas recevable, réessayez";
			}
		}
		
		// Shows status bars ("Humanité", "Relation", "État du réseau");
		System.out.print("Humanité [");
		for(int i = 0; i < 20; i++) {
			if(i < status[1]) {
				System.out.print("=");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println("]");
		System.out.print("Relation [");
		for(int i = 0; i < 20; i++) {
			if(i < status[2]) {
				System.out.print("=");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println("]");
		System.out.print("État du réseau [");
		for(int i = 0; i < 20; i++) {
			if(i < status[3]) {
				System.out.print("=");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println("]");
		
		return status;
	}
}

