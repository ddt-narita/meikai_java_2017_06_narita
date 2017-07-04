/* 演習07-31
 * int型整数、long型整数、float型実数、double型実数の絶対値を求めるメソッド群を作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_31;

import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//int型整数の入力
		System.out.print("int型整数：");
		int nInput = stdIn.nextInt();
		//メソッドabsoluteを呼び出して絶対値を求める
		System.out.println("絶対値は" + absolute(nInput));

		//long型整数の入力
		System.out.print("long型整数：");
		long lngInput = stdIn.nextLong();
		//メソッドabsoluteを呼び出して絶対値を求める
		System.out.println("絶対値は" + absolute(lngInput));

		//float型実数の入力
		System.out.print("float型実数：");
		float fInput = stdIn.nextFloat();
		//メソッドabsoluteを呼び出して絶対値を求める
		System.out.println("絶対値は" + absolute(fInput));

		//double型実数の入力
		System.out.print("double型実数：");
		double dblInput = stdIn.nextDouble();
		//メソッドabsoluteを呼び出して絶対値を求める
		System.out.println("絶対値は" + absolute(dblInput));

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//int型整数の絶対値を返却するメソッド
	static int absolut(int x) {
		//正か0でああればそのまま、負であれば-して絶対値を返却
		return x >= 0 ? x : -x;

	}

	//long型整数の絶対値を返却するメソッド
	static long absolute(long x) {
		//正か0でああればそのまま、負であれば-して絶対値を返却
		return x >= 0 ? x : -x;
	}

	//float型実数の絶対値を返却するメソッド
	static float absolute(float x) {
		//正か0でああればそのまま、負であれば-して絶対値を返却
		return x >= 0 ? x : -x;
	}

	//double型実数の絶対値を返却するメソッド
	static double absolute(double x) {
		//正か0でああればそのまま、負であれば-して絶対値を返却
		return x >= 0 ? x : -x;
	}
}
