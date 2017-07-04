/* 演習07-20
 * 配列aの要素a[idx]にxを挿入するメソッドを作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_20;

import java.util.Random;
import java.util.Scanner;

public class Ins {

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

		//挿入したい要素の添え字の入力を促す
		System.out.print("挿入したい要素の添え字を入力してください：");
		//挿入したい要素の添え字を入力
		int nArrayIns = stdIn.nextInt();

		//挿入したい値の入力を促す
		System.out.print("挿入したい数値を入力してください：");
		//挿入する値を入力
		int nInsNumber = stdIn.nextInt();

		//メソッドarrInsを呼び出して入力された要素を
		aryIns(nArray, nArrayIns,nInsNumber);

		//挿入後の配列を表示する
		System.out.println("挿入後の配列は");

		//要素数分だけ繰り返して全要素を表示
		for(int i = 0; i < nArrayNumber; i++) {
			//配列の全要素を表示
			System.out.println("nArray[" + i + "] = " + nArray[i]);
		}

		//標準出力ストリームをクローズ
		stdIn.close();

	}

	//第一引数の配列から、第二引数の要素に第三引数の値を挿入するメソッド
	static void aryIns(int[] a, int idx, int x) {
		//挿入したい要素の一つ後ろから順に後ろへずらす
		for(int i = a.length - 1; i >= idx + 1; i--) {
			//後ろへずらす
			a[i] = a[i - 1];
		}
		//挿入したい要素に挿入したい値を代入
		a[idx] = x;
	}
}
