
public class MultiArray {

	public static void main(String[] args) {
		int[][] n = new int[5][4];
		
		System.out.println("size of array = " + n.length);
		
		for(int i=0; i<n.length; i++) {
			System.out.println("size of n[" + i + "] = " + n[i].length);
		}
		System.out.println();
		
		//--- print array elements in a matrix form
		for(int i=0;i<n.length;i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j] + "     ");
			}
			System.out.println();
		}//for
	}
}