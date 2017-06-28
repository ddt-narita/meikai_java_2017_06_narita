/* 演習03-05
 * 正の整数値を読み込んでそれが5で割り切れるかどうかを表示。負の値が入力されたときにはそのことも表示する
 * 作成日：6月28日
 * 作成者：成田修之
 */


package e_03_05;

import java.util.Scanner;

public class Divide5 {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//整数値の入力を促す
		System.out.print("整数値：");
		//キーボードから入力
		int nInput = stdIn.nextInt();

		//入力された値が正ではないとき
		if(nInput <= 0) {
			//正でない値が入力されたことを表示
			System.out.print("正ではない値が入力されました。");
		//入力された値が正の時
		}else {
			//入力された値が正で5で割った剰余が0の時
			if(nInput % 5 == 0) {
				//5で割り切れることを表示
				System.out.print("その値は5で割り切れます。");
			//入力された値がせいだが5で割った剰余が0以外の時
			} else {
				//5では割り切れないことを表示
				System.out.print("その値は5で割り切れません。");
			}
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
