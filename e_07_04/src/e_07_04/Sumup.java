/* 演習07-04
 * 1からnまでの全整数の和を求めて返却するメソッドを作成する
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_04;

import java.util.Scanner;

public class Sumup {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//1からいくつまでの和を求めたいか入力を促す
		System.out.print("整数n：");
		//いくつまでの和を求めたいか入力
		int nInput = stdIn.nextInt();

		//メソッドsumUpを使って1から入力された値までの合計を表示
		System.out.print("1から" + nInput + "までの和は" + sumUp(nInput) + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//1から引数までの合計を求めて返却するメソッド
	static int sumUp(int n) {
		//合計を格納する変数
		int nSumUp = 0;
		//引数分繰り返す
		for(int i = 1; i <= n; i++) {
			//1から引数まで順に足していく
			nSumUp += i;
		}

		//計算し終えた1から引数までの合計を返却する
		return nSumUp;
	}
}
