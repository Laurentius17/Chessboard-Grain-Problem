/*
If a chessboard were to have wheat placed upon each square such that
one grain were placed on the first square, two on the second, four on the third,
and so on (doubling the number of grains on each subsequent square),
how many grains of wheat would be on the chessboard at the finish?
*/
public class WheatAndChessboardProblem {

	public static void main(String[] args) {
	//I use long because it can hold 64 bits of memory, just enough for this problem
	long x=1;
	long y=1;
	long z;
	System.out.print(" Square 1: Grains 1");
	for(long i=2;i<=64;i++) {
		// z=x+y is 1+1=2 , then a substituite the value of x and y with the value of z so x,y=2, which means that in the next operation it will be 2+2=4 and so on and so on
		z=x+y;
		x=z;
		y=z;
		System.out.print("\n Square " + i +": "+"Grains " + z + " ");
	}

	}

}
