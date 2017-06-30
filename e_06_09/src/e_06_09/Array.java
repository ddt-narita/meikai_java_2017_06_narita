/* 演習06-09
 * 要素数がint型である配列を作って全要素を1から10の乱数で埋め尽くす
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_09;

import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成する
		Random rand = new Random();

		//配列の要素数の入力を促す
		System.out.print("配列の要素数：");
		//配列の要素数を入力
		int nArrayNumber = stdIn.nextInt();

		//入力された要素数分の配列を確保
		int[] nArray = new int[nArrayNumber];

		//配列の要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素に1から10までの値を入力する
			nArray[i] = rand.nextInt(10) + 1;
		}

		//配列の要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素の値を表示する
			System.out.println("nArray[" + i + "] = " + nArray[i]);
		}

		//標準出力ストリームをクローズ
		stdIn.close();

	}

}
