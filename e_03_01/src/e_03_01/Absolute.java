/* 演習03-01
 * 整数値を読み込んでその絶対値を求めて表示
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_01;

import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//絶対値を求めたい整数値の入力を促す
		System.out.print("整数値：");
		//求めたい整数値をキーボードから入力
		int nAbsolute = stdIn.nextInt();

		//入力された値が0より大きいとき
		if(nAbsolute > 0) {
			//そのまま表示する
			System.out.println("その絶対値は" + nAbsolute + "です。");
		//入力された値が0以下の時
		} else {
			//-をかけて絶対値を表現して表示
			System.out.println("その絶対値は" + (-nAbsolute) + "です。");
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
