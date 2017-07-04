/* 演習07-21
 * 2つの配列の全要素を交換するメソッドの作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_21;

import java.util.Random;
import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();

		//配列の要素数の入力を促す
		System.out.print("配列Aの要素数：");
		//要素数を入力する
		int nArrayNumberA = stdIn.nextInt();

		//入力された要素数の配列をとる
		int[] nArrayA = new int[nArrayNumberA];

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumberA; i++) {
			//各要素に0から9のランダムな値を代入する
			nArrayA[i] = rand.nextInt(10);
		}

		//要素数分だけ繰り返して全要素を表示
		for(int i = 0; i < nArrayNumberA; i++) {
			//配列の全要素を表示
			System.out.println("nArrayA[" + i + "] = " + nArrayA[i]);
		}

		//配列の要素数の入力を促す
		System.out.print("配列Bの要素数：");
		//要素数を入力する
		int nArrayNumberB = stdIn.nextInt();

		//入力された要素数の配列をとる
		int[] nArrayB = new int[nArrayNumberB];

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumberB; i++) {
			//各要素に0から9のランダムな値を代入する
			nArrayB[i] = rand.nextInt(10);
		}

		//要素数分だけ繰り返して全要素を表示
		for(int i = 0; i < nArrayNumberB; i++) {
			//配列の全要素を表示
			System.out.println("nArrayB[" + i + "] = " + nArrayB[i]);
		}

		//メソッドをつかって入力された要素数の2つの配列を入れ替える
		System.out.println("2つの配列を入れ替えます。");
		//メソッドaryExchngを使って2つの配列を入れ替える
		aryExchng(nArrayA,nArrayB);
		//入れ替え後の配列を表示することを明示
		System.out.println("入れ替えた後の配列");

		//
		System.out.println("配列A");
		//要素数分だけ繰り返して全要素を表示
		for(int i = 0; i < nArrayA.length; i++) {
			//配列の全要素を表示
			System.out.println("nArrayA[" + i + "] = " + nArrayA[i]);
		}

		System.out.println("配列B");
		//要素数分だけ繰り返して全要素を表示
		for(int i = 0; i < nArrayB.length; i++) {
			//配列の全要素を表示
			System.out.println("nArrayB[" + i + "] = " + nArrayB[i]);
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}


	//2つの配列の全要素の値を交換するメソッド
	//二つの配列の長さが異なる時は小さいほうの要素数分の要素を交換する
	static void aryExchng(int[] a, int[] b) {

		//2つの配列の小さいほうの長さを格納
		int nLength = a.length < b.length ? a.length : b.length;
		//小さいほうの長さ分の要素数の交換のために使う配列
		int[] nCopyArray = new int[nLength];

		//小さいほうの要素数分繰り返す
		for(int i = 0; i < nLength; i++) {
			//交換のための配列に配列aをコピーする
			nCopyArray[i] = a[i];
		}

		//小さいほうの要素数分繰り返す
		for(int i = 0; i < nLength; i++) {
			//配列aに配列bの全要素をコピー
			a[i] = b[i];
		}

		//小さいほうの要素数分繰り返す
		for(int i = 0; i < nLength; i++) {
			//配列bにとっておいた配列aの要素を代入して交換
			b[i] = nCopyArray[i];
		}
	}
}
