/* 演習04-03
 * 2つの整数値を読み込んで小さいほうの値から大きいほうの値までの全整数を小さい順に表示
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_04_03;

import java.util.Scanner;

public class ListUp {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//整数Aに入力を促す
		System.out.print("整数A：");
		//判定したい値をキーボードから入力
		int nInputA = stdIn.nextInt();

		//整数Bに入力を促す
		System.out.print("整数B：");
		//判定したい値をキーボードから入力
		int nInputB = stdIn.nextInt();

		//入力された2つの値のうち小さいほうを格納
		int nMin = nInputA < nInputB ? nInputA : nInputB;
		//入力された2つの値のうち大きいほうを格納
		int nMax = nInputA > nInputB ? nInputA : nInputB;

		do {
			//小さいほうの値と空白文字を表示
			System.out.print(nMin + " ");
			//小さいほうの値を1増やす
			nMin += 1;
		//小さいほうの値が大きいほうの値以下の間繰り返す
		} while(nMin <= nMax);

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
