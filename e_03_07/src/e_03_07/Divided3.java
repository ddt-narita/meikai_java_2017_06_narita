/* 演習03-07
 * 正の整数値を読み込んで3で割った値に応じて判定。正でない値が入力されたときはそのことを表示
 */

package e_03_07;

import java.util.Scanner;

public class Divided3 {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//判定したい整数値の入力を促す
		System.out.print("整数値：");
		//判定したい値をキーボードから入力
		int nInput = stdIn.nextInt();

		//入力された値が0以下の時
		if(nInput <= 0) {
			//入力された値がせいではないことを表示
			System.out.print("正ではない値が入力されました。");
		//正の値が入力されたとき
		} else {
			//入力された値の3で割った時の剰余が0の時
			if(nInput % 3 == 0) {
				//その値が3で割り切れることを表示
				System.out.print("その値は3で割り切れます。");
			//3で割った剰余が1の時
			} else if(nInput % 3 == 1) {
				//剰余が1であることを表示
				System.out.print("その値を3で割った余りは1です。");
			//3で割った剰余が2の時
			} else {
				//剰余が2であることを表示
				System.out.print("その値を3で割った余りは2です。");
			}
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
