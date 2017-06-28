/* 演習03-03
 * 読み込んだ整数値の符号を判定するプログラムで、入力された値が0の時の判定をelseからelse if(n == 0)に置き換え
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_03;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

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

		//標準出力ストリームのクローズ
		stdIn.close();
	}

}
