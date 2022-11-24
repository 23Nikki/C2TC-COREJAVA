
public class Scope {

	public static void main(String[] args) {
	 int outer=2;
	 {
		 int inner =1;
		 System.out.println(inner);
		 System.out.println(outer);
	 }
	 int inner=3;
     System.out.println(inner);
	}

}
