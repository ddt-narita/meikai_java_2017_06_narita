/* 演習03-06
 * 正の値を読み込んで10の倍数であるかどうかを判定する。正でない値の時はそのことを表示する
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_06;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		
		//判定したい値の入力を促す
		System.out.print("整数値：");
		//キーボードから判定したい値を入力する
		int nInput = stdIn.nextInt();
		
		//入力された値が正ではないとき
		if(nInput <= 0) {
			//入力された値が正ではないことを表示
			System.out.print("正ではない値が入力されました。");
		
		//入力された値が正の時
		} else {
			//入力された値が正かつ10で割った剰余が0の時
			if(nInput % 10 == 0) {
				//入力された値が10の倍数であることを表示
				System.out.print("その値は10の倍数です。");
				
			//入力された値が正だが10で割り切れないとき
			} else {
				//10の倍数ではないことを表示
				System.out.print("その値は10の倍数ではありません。");
			}
			
		}
		
		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
