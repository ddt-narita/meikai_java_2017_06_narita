/* 演習07-13
 * 整数の任意のビット目の値を1にするメソッド、0にするメソッド、反転させるメソッドをそれぞれ作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_13;

import java.util.Scanner;

public class Set {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//変換したい整数の入力を促す表示
		System.out.print("整数：");
		//変換したい整数を入力
		int nInput = stdIn.nextInt();
		//入力された整数のビット構成を表示
		printBits(nInput);

		//変更したいビットが何番目かを入力を促す
		System.out.print("何ビット目を変更しますか：");
		//変更したいビットが何番目かを入力
		int nBitsNumber = stdIn.nextInt();
		//メソッドsetで入力された整数の入力されたビットを1にセットする
		int nSet = set(nInput, nBitsNumber);
		//セット後のビット構成を表示する
		printBits(nSet);
		//セット後の値を表示する
		System.out.println(nSet);

		//変更したいビットが何番目かを入力を促す
		System.out.print("何ビット目を変更しますか：");
		//変更したいビットが何番目かを入力
		nBitsNumber = stdIn.nextInt();
		//メソッドresetで入力された整数の入力されたビットに0をセットする
		int nReset = reset(nInput, nBitsNumber);
		//セット後のビット構成を表示する
		printBits(nReset);
		//セット後の値を表示する
		System.out.println(nReset);

		//変更したいビットが何番目かを入力を促す
		System.out.print("何ビット目を変更しますか：");
		//変更したいビットが何番目かを入力
		nBitsNumber = stdIn.nextInt();
		//メソッドinverseを使って入力された整数の入力されたビットを反転する
		int nInverse = inverse(nInput, nBitsNumber);
		//変更したいビットが何番目かを入力を促す
		System.out.print("何ビット目を変更しますか：");
		//反転後のビット構成を表示する
		printBits(nInverse);
		//反転後の値を表示する
		System.out.println(nInverse);

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//任意のビットを1でセットするメソッド
	static int set(int x, int pos) {
		//1を任意の数シフトした値との論理和でセットする
		int nReturn = x | (1 << pos - 1);
		//セット後の値を返却する
		return nReturn;
	}

	//任意のビットを0でリセットするメソッド
	static int reset(int x, int pos) {
		//-1と1を任意の数シフトした値との排他的論理和で任意のビットのみ0の数値を作る
		int n = -1 ^ (1 << pos - 1);
		//作った値と引数の値で論理積で任意のビットをリセットさせる
		int nReturn = x & n;
		//できたリセット後の値を返却する
		return nReturn;
	}

	//任意のビットを反転させるメソッド
	static int inverse(int x, int pos) {
		//返却に使う変数
		int nReturn;
		//任意のビットが1の時
		if((x >> pos - 1 & 1) == 1 ) {
			//メソッドresetで0にする
			nReturn = reset(x,pos);
		//0の時
		} else {
			//メソッドsetで1にセット
			nReturn = set(x,pos);
		}

		//反転後の値を返却する
		return nReturn;
	}

	//ビット構成を表示するメソッド
	static void printBits(int x) {
		//ビット数分繰り返す
		for(int i = 31; i >= 0; i--) {
			//シフトしてそこに1があれば1をなければ0を表示する
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		//ビット構成を表示した後に改行する
		System.out.println();
	}
}
