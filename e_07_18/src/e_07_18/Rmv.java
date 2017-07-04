/* 演習07-18
 * 配列から要素を削除するメソッドの作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_18;

import java.util.Random;
import java.util.Scanner;

public class Rmv {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();

		//配列の要素数の入力を促す
		System.out.print("配列の要素数：");
		//要素数を入力する
		int nArrayNumber = stdIn.nextInt();

		//入力された要素数の配列をとる
		int[] nArray = new int[nArrayNumber];

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素に0から9のランダムな値を代入する
			nArray[i] = rand.nextInt(10);
		}

		//要素数分だけ繰り返して全要素を表示
		for(int i = 0; i < nArrayNumber; i++) {
			//配列の全要素を表示
			System.out.println("nArray[" + i + "] = " + nArray[i]);
		}

		System.out.print("削除したい要素の添え字を入力してください：");
		int nArrayRmv = stdIn.nextInt();

		//メソッドarrRmvを呼び出して入力された要素を削除する
		arrRmv(nArray, nArrayRmv);

		//削除後の配列を表示する
		System.out.println("削除後の配列は");

		//要素数分だけ繰り返して全要素を表示
		for(int i = 0; i < nArrayNumber; i++) {
			//配列の全要素を表示
			System.out.println("nArray[" + i + "] = " + nArray[i]);
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//第一引数の配列から第二引数の添え字の要素を削除する
	static void arrRmv(int[] a, int idx) {
		//削除する要素から最後から一つ手前の要素まで繰り返す
		for(int i = idx; i < a.length - 1; i++) {
			//一つ後ろの要素の値を代入する
			a[i] = a[i + 1];
		}
	}
}
