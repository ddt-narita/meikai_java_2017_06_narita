/* 演習07-10
 * 暗算トレーニングをランダムな計算方法で出題するように書き換え
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_10;

import java.util.Random;
import java.util.Scanner;

public class MentalArithmetic {

	//標準出力ストリームのインスタンスを作成する
	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		//ランダムな値を生成するインスタンスを作成
		Random rand = new Random();

		//暗算ゲームの開始を明示
		System.out.println("暗算力トレーニング！！");

		do {
			int nCalcX = rand.nextInt(900) + 100;		//計算に使う3桁のランダムな値Zを生成
			int nCalcY = rand.nextInt(900) + 100;		//計算に使う3桁のランダムな値Yを生成
			int nCalcZ = rand.nextInt(900) + 100;		//計算に使う3桁のランダムな値Zを生成

			//計算方法を決めるランダムな値を生成
			int nCalcMethod = rand.nextInt(4);

			//switch文でbreakする際にこのループを抜けられるように設定
			Outer:
			//正解して抜け出すまで繰り返す
			while(true) {
				//暗算結果を入力するための変数
				int nInput;
				//計算方法を決めるランダムな値によって分岐
				switch(nCalcMethod) {
				//ランダムな値が0だった時全部足し算の計算を行う
				case 0: System.out.print(nCalcX + " + " + nCalcY + " + " + nCalcZ + " = ");
						//計算結果を入力
						nInput = stdIn.nextInt();
						//あっていれば
						if(nInput == nCalcX + nCalcY + nCalcZ) {
							//ループの外へ抜け出す
							break Outer;
						}
				//計算方法を決めるランダムな値が1の時、2つ目の計算は引き算
				case 1: System.out.print(nCalcX + " + " + nCalcY + " - " + nCalcZ + " = ");
						//計算結果を入力
						nInput = stdIn.nextInt();
						//あっていれば
						if(nInput == nCalcX + nCalcY - nCalcZ) {
							//ループの外へ抜けだす
							break Outer;
						}
				//計算方法を決めるランダムな値が2の時、1つ目の計算は引き算
				case 2: System.out.print(nCalcX + " - " + nCalcY + " + " + nCalcZ + " = ");
						//計算結果を入力
						nInput = stdIn.nextInt();
						//あっていれば
						if(nInput == nCalcX - nCalcY + nCalcZ) {
							//ループの外へ抜け出す
							break Outer;
						}
				//計算方法を決めるランダムな値が3の時、全部引き算の計算
				case 3: System.out.print(nCalcX + " - " + nCalcY + " - " + nCalcZ + " = ");
				 		//計算結果を入力
						nInput = stdIn.nextInt();
				 		//あっていれば
						if(nInput == nCalcX - nCalcY - nCalcZ) {
				 			//ループの外へ抜け出す
							break Outer;
				 		}
				}

				//計算を間違えてループを抜け出せなかったときは計算結果が違っていたことを表示
				System.out.println("違います。");
			}
		//正解したらメソッドconfirmRetryでもう一度続けるが入力さる限り繰り返す
		} while(confirmRetry());


	}

	//もう一度繰り返すかどうか入力して判定するメソッド
	static boolean confirmRetry() {
		//もう一度繰り返すかどうか入力するための変数
		int cont;
		do {
			//もう一度繰り返すかYesNoに当たる数値の表示と入力を促す
			System.out.print("もう一度？<Yes…1 /NO…0>：");
			//繰り返すかどうか入力する
			cont = stdIn.nextInt();
		//0か1のどちらかが入力されるまで繰り返す
		} while(cont != 0 && cont != 1);
		//繰り返す1が入力されていればtrue、0ならfalseを返却
		return cont == 1;
	}
}
