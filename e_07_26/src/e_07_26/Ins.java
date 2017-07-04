/* 演習07-26
 * 配列aの要素a[idx]にxを挿入した配列を返却するメソッドを作成する
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_26;

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
			System.out.printf("nArray[%2d] = " + nArray[i] + "\n",i);
		}

		//挿入したい要素の入力を促す
		System.out.print("挿入したい要素の添え字を入力してください：");
		//挿入したい要素の添え字を入力
		int nInsIdx = stdIn.nextInt();

		//入力された添字に挿入する値の入力を促す
		System.out.print("挿入する値を入力してください：");
		//挿入する値を入力
		int nIns = stdIn.nextInt();

		//メソッドarrayRmvOfNを使って要素を挿入し、挿入後の配列を作成
		int[] nArrayRmv = arrayInsOf(nArray, nInsIdx, nIns);

		//挿入後の配列を表示
		System.out.println("削除後の配列");
		//挿入後の配列の要素数分だけ繰り返す
		for(int i = 0; i < nArrayRmv.length; i++) {
			//各要素を表示
			System.out.printf("nArray[%2d] = " + nArrayRmv[i] + "\n",i);
		}

		//標準出力ストリームをクローズ
		stdIn.close();

	}

	//引数の配列の第二引数の添え字の要素に第三引数の値を挿入するメソッド
	static int[] arrayInsOf(int[] a, int idx, int x) {
		//返却する挿入後の配列。長さは引数の配列に挿入分を足した数
		int[] nArrayIns = new int[a.length + 1];
		//挿入後の配列の添え字に使う変数
		int j = 0;

		//引数の配列の要素数分繰り返す
		for(int i = 0; i < a.length; i++, j++) {
			//挿入したい要素になった時
			if(i == idx) {
				//挿入後の配列に第三引数の値を入力して次の要素へ
				nArrayIns[j++] = x;
			}
			//各要素をコピー
			nArrayIns[j] = a[i];
		}

		//挿入後の配列を返却する
		return nArrayIns;
	}
}
