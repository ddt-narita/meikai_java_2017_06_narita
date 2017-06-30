/* 演習04-24
 * 正の整数値を読み込んで素数かどうか判定するプログラムの作成
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_24;

import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		
		//素数かどうか判定したい整数値の入力を促す
		System.out.print("素数かどうか判定します。整数を入力してください：");
		//判定したい整数を入力
		int nInput = stdIn.nextInt();
		
		//カウントに使う変数
		int i;
		//素数の条件2からその値未満の数では割り切れないことを確認する
		for(i = 2; i < nInput; i++) {
			//割り切れる時
			if(nInput % i == 0) {
				//ループを抜ける
				break;
			}
		}
		
		//割り切れる値がなくループが最後の値まで繰り返されたとき
		if(i == nInput) {
			//素数であることを表示
			System.out.print("その値は素数です。");
		//割り切れる数値があってループが最後まで行ってないとき
		} else {
			//素数ではないことを表示
			System.out.print("その値は素数ではありません。");
		}
		
		//標準出力ストリームをクローズ
		stdIn.close();
		
	}

}
