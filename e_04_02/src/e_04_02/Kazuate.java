/* 演習04-02
 * 2桁の整数値を当てさせる数当てゲームの作成
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_04_02;

import java.util.Random;
import java.util.Scanner;

public class Kazuate {

	public static void main(String[] args) {
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//10から99のランダムな正解の値
		int nCorrectNumber = rand.nextInt(90) + 10;

		//ゲームの開始を明示
		System.out.println("数当てゲーム開始！！");
		//当てるべき和の範囲を表示
		System.out.println("10から99の2桁の整数を当ててください。");

		//当てるのに入力するための変数
		int nInput;
		do {
			//当てる数がいくつなのか入力を促す
			System.out.println("いくつですか：");
			//当てる和をキーボードから入力
			nInput = stdIn.nextInt();

			//入力された値が正解より大きいとき
			if(nInput > nCorrectNumber) {
				//正解の値がもっと小さいことを表示
				System.out.println("もっと小さい数だよ。");
			//入力された値が正解より小さいとき
			} else if(nInput < nCorrectNumber) {
				//正解の値がもっと大きいことを表示
				System.out.println("もっと大きい数だよ。");
			}
		//入力された値が正解の数と一致するまで繰り返す
		} while(nInput != nCorrectNumber);

		//do文を抜けて正解できた時は正解であることを表示
		System.out.println("正解です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
