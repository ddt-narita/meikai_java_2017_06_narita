/* 演習03-09
 * 2つの実数値を読み込んで大きいほうの値を表示するプログラム
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_09;

import java.util.Scanner;

public class Bigger {

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

		//条件演算子を使って入力された2つの整数の大きいほうの値をnMaxに格納
		int nMax = nInputA > nInputB ? nInputA : nInputB;

		//入力された大きいほうの値を格納したnMaxで大きいほうの値を表示
		System.out.print("大きいほうの値は" + nMax + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}
}
