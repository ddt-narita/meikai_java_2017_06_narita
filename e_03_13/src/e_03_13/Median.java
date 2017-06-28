/* 演習03-13
 * キーボードから読み込んだ3つの値の中央値を求める
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_13;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//整数Aに入力を促す
		System.out.print("整数A：");
		//判定したい値をキーボードから入力
		int nInputA = stdIn.nextInt();

		//整数Bに入力を促す
		System.out.print("整数B：");
		//判定したい値をキーボードから入力
		int nInputB = stdIn.nextInt();

		//整数Cに入力を促す
		System.out.print("整数C：");
		//判定したい値をキーボードから入力
		int nInputC = stdIn.nextInt();


		//中央値を格納する変数。最初は整数Aを格納
		int nMedian = nInputA;
		
		//入力された変数AとBでAのほうが大きい時
		if(nInputA > nInputB) {
			//整数Cが整数Bより小さいとき
			if(nInputC < nInputB) {
				//中央値を整数Bに更新
				nMedian = nInputB;
			//整数Cが整数B以上で整数Aより小さいとき
			} else if(nInputC < nInputA){
				//中央値を整数Cに更新
				nMedian = nInputC;
			}
			
		//整数Bが整数A以上の時
		} else {
			//整数Cが整数Bより大きいとき
			if(nInputC > nInputB) {
				//中央値を整数Bに更新
				nMedian = nInputB;
			//整数Cが整数Aより大きいとき
			} else if(nInputC > nInputA) {
				//中央値を整数Cに更新
				nMedian = nInputC;
			}
		}
		
		//求めた中央値の値を表示する
		System.out.println("中央値は" + nMedian + "です。");
		
		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
