/* 演習06-11
 * 配列の要素が同じ値を持たないように演習06-09のプログラムを改良
 * 作成日：6月30日
 * 作成者：成田修之
 */


package e_06_11;

import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成する
		Random rand = new Random();

		//for分の条件に1回目も入れるように11で初期化
		int nArrayNumber = 11;
		//10以上の値が入力される限り繰り返す
		for(;nArrayNumber > 10;) {
			//配列の要素数の入力を促す
			System.out.print("配列の要素数：");
			//配列の要素数を入力
			nArrayNumber = stdIn.nextInt();
		}


		//入力された要素数分の配列を確保
		int[] nArray = new int[nArrayNumber];

		//一つ目の配列は影響を受けないのでそのままランダムな値を代入
		nArray[0] = rand.nextInt(10) + 1;

		//配列の2番目から最後まで繰り返す
		for(int i = 1; i < nArrayNumber; i++) {
			//ランダムな値を入力
			nArray[i] = rand.nextInt(10);
			//0からi番目まで繰り返す
			for(int j = 0; j < i; j++) {
				//一致してしまう値がある時
				if(nArray[i] == nArray[j]) {
					//探索を0最初から行うために初期化（for分の終わりにインクリメントがあるので-1を代入）
					j = -1;
					//ランダムな値を入れなおして探索を再開する
					nArray[i] = rand.nextInt(10);
				}
			}
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
