/* 演習03-02
 * 二つのし正の整数を読み込んで後者が前者の約数であれば約数であることをそうでなければ約数でないことを表示するプログラムの作成
 * 作成日：6月28日
 * 作成者：成田修之
 */


package e_03_02;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//割られるほうの整数Aに入力を促す
		System.out.print("整数A：");
		//整数Aにキーボードから入力
		int nDividedA = stdIn.nextInt();

		//割るほうの整数Bに入力を促す表示
		System.out.print("整数B：");
		//整数Bにキーボードから入力
		int nDivisorB = stdIn.nextInt();

		//整数Aを整数Bで割った剰余が0の時
		if(nDividedA % nDivisorB == 0) {
			//BがAの約数であることを表示
			System.out.print("BはAの約数です。");
		//剰余が0以外の時
		} else {
			//約数ではないことを表示
			System.out.print("BはAの約数ではありません。");
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
