/* 演習07-19
 * 配列aから要素a[idx]を先頭とするnこの要素を削除するメソッドを作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_19;

import java.util.Random;
import java.util.Scanner;

public class RmvN {

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

		//削除したい先頭要素の入力を促す
		System.out.print("削除したい先頭の要素の添え字を入力してください：");
		//削除したい先頭要素を入力
		int nArrayRmv = stdIn.nextInt();

		//入力された削除したい要素から何個
		System.out.print("その要素を先頭として削除したい個数を入力してください：");
		//何個削除するかを入力
		int nRmvNumber = stdIn.nextInt();
		
		//メソッドarrRmvを呼び出して入力された要素を削除する
		arrRmvN(nArray, nArrayRmv,nRmvNumber);

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

	//第一引数の配列から、第二引数の要素から第三引数個の要素を削除するメソッド
	static void arrRmvN(int[] a, int idx, int n) {
		//前方にずらす要素が末尾になるまで繰り返す
		for(int i = idx; i + n < a.length; i++) {
			//削除する要素の後ろの要素を前方にずらして削除
			a[i] = a[i + n];
		}
	}
}
