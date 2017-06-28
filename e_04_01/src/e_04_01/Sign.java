/* 演習04-01
 * 読み込んだ整数値の符号の判定を好きなだけ繰り返せるように改良
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_04_01;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//繰り返すかどうか入力するための変数
		int nRetry;

		do{
			//符号を判定したい整数値の入力を促す
			System.out.print("整数値；");
			//判定したい値をキーボードから入力
			int nInput = stdIn.nextInt();

			//入力された値が0より大きいとき
			if(nInput > 0) {
				//正であることを表示
				System.out.println("その値は正です。");
			//0より小さいとき
			} else if(nInput < 0) {
				//負であることを表示
				System.out.print("その値は負です。");
			//0であるとき
			} else if(nInput == 0) {
				//0であることを表示
				System.out.print("その値は0です。");
			}

			//もう一度符号の判定を行うかどうか入力を促す
			System.out.print("もう一度？ 1…Yes/0…No：");
			//もう一度行うかどうかに応答する数値を入力する
			nRetry = stdIn.nextInt();
		//入力された値が1である限り繰り返す
		} while(nRetry == 1);

		//標準出力ストリームのクローズ
		stdIn.close();
	}
}
