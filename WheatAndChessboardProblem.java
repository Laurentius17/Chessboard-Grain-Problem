package InternetTests;

public class WheatAndChessboardProblem {

	public static void main(String[] args) {
	long x=1;
	long y=1;
	long z;
	System.out.print(" Square 1: Grains 1");
	for(long i=2;i<=64;i++) {
		z=x+y;
		x=z;
		y=z;
		System.out.print("\n Square " + i +": "+"Grains " + z + " ");
	}

	}

}
