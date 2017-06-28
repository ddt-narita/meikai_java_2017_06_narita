/* 演習02-08
 * キーボードから読み込んだ値の±5の範囲の整数値をランダムに生成して表示するプログラムの作成
 * 作成日：6月27日
 * 作成者：成田修之
 */

package e_02_08;

import java.util.Random;
import java.util.Scanner;

public class PlusMinus10 {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するインスタンスを生成
		Random rand = new Random();

		//整数値の入力を促す
		System.out.print("整数値：");
		//キーボードから入力を促す
		int nInput = stdIn.nextInt();
		//-5から5までのランダムな値を生成
		int lucky = rand.nextInt(11) + -5;

		//入力された値に-5から5までの値を足して表示
		System.out.println("その値の±5の乱数を生成しました。それは" + (nInput  + lucky) + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}
}
