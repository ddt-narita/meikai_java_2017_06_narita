/* 演習03-08
 * キーボードから読み込んだ値に応じて優/良/可/不可を判定して表示
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_08;

import java.util.Scanner;

public class Score {
	public static void main(String[] arg) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//判定したい点数の入力を促す
		System.out.print("点数：");
		//判定したい値をキーボードから入力
		int nInput = stdIn.nextInt();

		//入力された値が0以上59以下の時
		if(nInput >= 0 && nInput <= 59) {
			//不可であることを表示
			System.out.print("不可");
		//入力された値が60以上69以下であるとき
		} else if(nInput >= 60 && nInput <= 69) {
			//判定が可であることを表示
			System.out.print("可");
		//入力された値が70以上79以下であるとき
		} else if(nInput >= 70 && nInput <= 79) {
			//判定が良であることを表示
			System.out.print("良");
		//入力された値が80以上100以下であるとき
		} else if(nInput >= 80 && nInput <= 100) {
			//判定が優であることを表示
			System.out.print("優");
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}
}
