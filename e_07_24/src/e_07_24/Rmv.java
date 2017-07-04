/* 演習07-24
 * 配列a空要素a[idx]を削除した配列を返却するメソッドを作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_24;

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
			System.out.printf("nArray[%2d] = " + nArray[i] + "\n",i);
		}

		//削除したい要素の入力を促す
		System.out.print("削除したい要素の添え字を入力してください：");
		//削除したい要素の添え字を入力
		int nRmv = stdIn.nextInt();

		//メソッドarrayRmvOfを使って要素を削除し、削除後の配列を作成
		int[] nArrayRmv = arrayRmvOf(nArray, nRmv);

		//削除後の配列を表示
		System.out.println("削除後の配列");
		//削除後の配列の要素数分だけ繰り返す
		for(int i = 0; i < nArrayRmv.length; i++) {
			//各要素を表示
			System.out.printf("nArray[%2d] = " + nArrayRmv[i] + "\n",i);
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//引数の配列から引数の添え字の要素を削除するメソッド
	static int[] arrayRmvOf(int[] a, int idx) {
		//削除後の配列。一個削除なので長さは引数の配列の長さから1つ引いたもの
		int[] nArrayRmv = new int[a.length - 1];

		//削除後の配列の添え字に使う
		int j = 0;
		//引数の配列の要素数分だけ繰り返す
		for(int i = 0; i < a.length; i++) {
			//引数の添え字の時は飛ばして、引数の添え字ではなければ
			if(i != idx) {
				//その要素を代入
				nArrayRmv[j++] = a[i];
			}
		}

		//削除後の配列の参照を返却する
		return nArrayRmv;
	}
}
