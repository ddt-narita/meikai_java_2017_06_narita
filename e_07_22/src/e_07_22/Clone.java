/* 演習07-22
 * 配列aと同じ配列を生成して返却するメソッドを作成する
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_22;

import java.util.Scanner;

public class Clone {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);


		//配列の要素数の入力を促す
		System.out.print("配列Aの要素数：");
		//要素数を入力する
		int nArrayNumber = stdIn.nextInt();

		//入力された要素数の配列をとる
		int[] nArray = new int[nArrayNumber];

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//何番目の要素なのかを表示
			System.out.print("nArray[" + i + "] = ");
			//各要素に入力
			nArray[i] = stdIn.nextInt();
		}

		//メソッドarrayCloneを使ってコピーされた配列を作って表示することを明示
		System.out.println("入力された配列をコピーした配列を表示します");
		//メソッドarrayCloneを使って配列Aのクローンを作る
		int[] nCopyArray = arrayClone(nArray);


		//要素数分だけ繰り返して全要素を表示
		for(int i = 0; i < nCopyArray.length; i++) {
			//配列の全要素を表示
			System.out.println("nCopyArray[" + i + "] = " + nCopyArray[i]);
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//引数の配列のクローンを作成するメソッド
	static int[] arrayClone(int[] a) {
		//引数の配列のコピーとなる配列を引数の配列の長さで作成
		int[] nCopyArray = new int[a.length];
		//配列の要素数分繰り返す
		for(int i = 0; i < nCopyArray.length; i++) {
			//各要素をコピーする
			nCopyArray[i] = a[i];
		}

		//つくった引数の配列のクローンの参照を返却する
		return nCopyArray;
	}
}
