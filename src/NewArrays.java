import java.util.Arrays;
import java.util.Scanner;
public class NewArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			int size;
			System.out.println("Enter the amount of names you want:");
			size=in.nextInt();
			String[] names= new String[size];
			in.nextLine();
			for (int x=0; x<names.length;x++){
				System.out.println("Enter name "+(x+1)+":");
				names[x]=in.nextLine();
			}
			Arrays.sort(names);
			for (int x=0; x<names.length;x++){
				System.out.println("Here is name "+(x+1)+":");
				names[x]=names[x].toUpperCase();
				System.out.println(names[x]);
			}for (int x=0; x<names.length;x++){
				names[x]=names[x].toUpperCase();
			}
			Arrays.sort(names);
			System.out.println("The first name in the list is "+names[0]);
			System.out.println("The last name on the list is "+names[names.length-1]);
			System.out.println("The name that appears in the middle of the list is "+names[names.length/2]);
			
	}

}
