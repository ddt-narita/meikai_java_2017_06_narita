/* 演習15-04
 * 浮動小数点数値xを小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッドの作成
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_15_04;

import java.util.Scanner;

public class Print {

	public static void printDouble(double x, int p, int w) {

		//第一引数の小数部を第2引数桁で全体として第3引数桁で表示する
		System.out.printf(String.format("%%%d.%df", w, p), x);
	}

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを作成する
		Scanner stdIn = new Scanner(System.in);

		//表示したい実数の入力
		System.out.print("表示したい実数");
		double dblReal = stdIn.nextDouble();

		//小数部分を何桁で表示するか入力
		System.out.print("小数点以下の部分：");
		int nDecimal = stdIn.nextInt();

		//全体として何桁で表示するのかを入力
		System.out.print("全体の桁数：");
		int nOverAll = stdIn.nextInt();

		//入力された各数値で実数を表示する
		printDouble(dblReal, nDecimal, nOverAll);

		//標準出力ストリームをクローズ
		stdIn.close();

	}

}
