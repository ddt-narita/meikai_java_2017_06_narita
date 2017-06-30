/* 演習04-27
 * 和宛ゲームのプレーヤーが乳りょおくできる回数に制限を設けたプログラムを作成
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_27;

import java.util.Random;
import java.util.Scanner;

public class Kazuate {

	public static void main(String[] args) {
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//正解の値をランダムに0から99の間で初期化
		int nCorrectNumber = rand.nextInt(100);

		//数当てゲームの開始と当てる数の範囲を宣言
		System.out.println("数当てゲーム開始\n0から99の数を当ててください。");

		int nInput;		//予想した数を入力するための変数
		int nCount = 0;	//数を入力した回数を数えるための変数
		int nlimit = 10;	//制限回数を決める変数

		do {
			//正解がいくつであるか入力を促す
			System.out.print("いくつかな：");
			//予想した数を入力する
			nInput = stdIn.nextInt();

			//入力された値が正解より大きいとき
			if(nInput > nCorrectNumber){
				//正解の値が小さいことを表示
				System.out.println("もっと小さな数だよ。");
			//入力された値が正解より小さいとき
			} else if(nInput < nCorrectNumber){
				//正解の値が大きいことを表示
				System.out.println("もっと大きな数だよ。");
			}
			//正解ではないときだけ
			if(nInput != nCorrectNumber) {
				//カウントする
				nCount++;
			}
		//正解するか、制限回数を超えない限り繰り返す
		} while(nInput != nCorrectNumber && nCount < nlimit);

		//答えた回数が制限回数に満たない（制限回数以内に正解したとき）
		if(nCount < nlimit) {
			//正解であることを表示
			System.out.print("正解です。");
		//回答した回数が制限回数を超えたとき
		} else {
			//制限を超えたことを表示して、正解を表示
			System.out.println("回答の制限回数を超えました。正解は" + nCorrectNumber + "です。");
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
