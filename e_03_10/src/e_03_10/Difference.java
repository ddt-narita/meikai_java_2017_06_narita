/* 演習03-10
 *  2つの整数値を読み込んでそれ他の値の差を表示するプログラム
 *  作成日：6月28日
 *  作成者：成田修之
 */

package e_03_10;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//整数Aに入力を促す
		System.out.print("整数A：");
		//判定したい値をキーボードから入力
		int nInputA = stdIn.nextInt();

		//整数Bに入力を促す
		System.out.print("整数B：");
		//判定したい値をキーボードから入力
		int nInputB = stdIn.nextInt();

		//Aのほうが大きいときはAからBをひいたもの、Bのほうが大きいときはBからAを引いたものを差の変数nDiffに格納
		int nDif = nInputA > nInputB ? nInputA - nInputB : nInputB - nInputA;

		//nDiffに格納された入力された2つの値の差を表示
		System.out.println("入力された2つの整数の差は" + nDif + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
