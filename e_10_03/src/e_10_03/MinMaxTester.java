/* 演習10-03
 * 2値3値配列の最小値や最大値を求めるメソッドを集めたユーティリティクラスを作成する
 * 作成日：7月5日
 * 作成者：成田修之
 */


package e_10_03;

import java.util.Random;
import java.util.Scanner;

public class MinMaxTester {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するインスタンスを作成
		Random rand = new Random();

		//整数Aの入力
		System.out.print("整数A：");
		int nInputA = stdIn.nextInt();
		//整数Bの入力
		System.out.print("整数B：");
		int nInputB = stdIn.nextInt();
		//整数Cの入力
		System.out.print("整数C：");
		int nInputC = stdIn.nextInt();
		//配列の要素数の入力
		System.out.print("配列の要素数：");
		int nArrayNumber = stdIn.nextInt();

		//入力された要素数分の配列を取る
		int[] nArray = new int[nArrayNumber];
		//配列の要素数分繰り返す
		for(int i = 0; i < nArray.length; i++) {
			//各要素に0から9のランダムな値を生成する
			nArray[i] = rand.nextInt(10);
		}

		//配列の要素数分繰り返す
		for(int i = 0; i < nArray.length; i++) {
			//各要素を表示
			System.out.println("nArray[" + i + "] = " + nArray[i]);
		}

		//入力された整数AとBの最大値をMinMaxのメソッドを使って求めて表示
		System.out.println("整数AとBの    最大値：" + MinMax.max(nInputA, nInputB));
		//最小値を求めて表示
		System.out.println("              最小値：" + MinMax.min(nInputA, nInputB));
		//入力された整数AとBとCの最大値をMinMaxのメソッドを使って求めて表示
		System.out.println("整数A, B, Cの 最大値：" + MinMax.max(nInputA, nInputB, nInputC));
		//最小値を求めて表示
		System.out.println("              最小値：" + MinMax.min(nInputA, nInputB, nInputC));
		//配列の全要素の最大値MinMaxのメソッドを使って求めて表示
		System.out.println("配列の全要素の最大値：" + MinMax.max(nArray));
		//配列の最小値を求めて表示
		System.out.println("              最小値：" + MinMax.min(nArray));

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
