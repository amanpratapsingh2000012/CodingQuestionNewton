import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner input=new Scanner(System.in);
					  int c;
					  ArrayList<Integer> arr=new ArrayList<Integer>();
					  do{
						  c=input.nextInt();
						  //Integer i=new Integer(c);
						  arr.add(c);
					  }while(c!=0);
	for(int i=0;i<arr.size();i++){System.out.print(arr.get(i)+" ");}
	}
}