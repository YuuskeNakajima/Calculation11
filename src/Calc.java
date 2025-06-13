import static java.lang.System.*;

public class Calc {

	public static void main(String[] args) {
		int x = 15;
		int y = 10;
		printAdd(x, y);
		printSub(x, y);

	}
	
	public static void printAdd(int arg1, int arg2) {
//		引数で与えられた数値の合計を出力する
		out.println(arg1 + arg2);
	}
	
	public static void printSub(int arg1, int arg2) {
		out.println(arg1 - arg2);
	}

}
