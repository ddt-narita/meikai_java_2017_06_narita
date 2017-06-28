/* 演習04-04
 * xをデクリメントして0になるまで繰り返した後のxの値が-1になっていることを確認する
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_04_04;

import java.util.Scanner;

public class Decrement {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//カウントダウンすることを明示
		System.out.println("カウントダウンします。");
		//カウントダウンする値を入力するための変数
		int nCount;
		do {
			//正の整数値の入力を促す
			System.out.print("正の整数値：");
			//キーボードからカウントダウンするための値を入力
			nCount = stdIn.nextInt();
		//0以上の正の値が入力されるまで繰り返す
		} while(nCount <= 0);

		//入力された値を格納した変数が0以上の限り繰り返す
		while(nCount >= 0) {
			//カウントダウンしていく様子を表示
			System.out.println(nCount);
			//表示した後にインクリメントする
			nCount--;
		}

		//カウントダウンが終わった後のnCountの値を表示
		System.out.println("カウントダウン後のnCountの値は" + nCount + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
