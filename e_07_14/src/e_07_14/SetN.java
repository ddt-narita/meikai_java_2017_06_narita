/* 演習07-14
 * 整数xの任意のビットから連続n個のビットを１、０、反転、にするメソッドの作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_14;

import java.util.Scanner;

public class SetN {

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
		//何個変更するか入力を促す
		System.out.print("いくつ変更しますか：");
		//何個変更するか入力する
		int nNumber = stdIn.nextInt();
		//メソッドsetで入力された整数の入力されたビットを1にセットする
		int nSet = setN(nInput, nBitsNumber,nNumber);
		//セット後のビット構成を表示する
		printBits(nSet);
		//セット後の値を表示する
		System.out.println(nSet);

		//変更したいビットが何番目かを入力を促す
		System.out.print("何ビット目を変更しますか：");
		//変更したいビットが何番目かを入力
		nBitsNumber = stdIn.nextInt();
		//何個変更するか入力を促す
		System.out.print("いくつ変更しますか：");
		//何個変更するか入力する
		nNumber = stdIn.nextInt();
		//メソッドresetで入力された整数の入力されたビットに0をセットする
		int nReset = resetN(nInput, nBitsNumber,nNumber);
		//セット後のビット構成を表示する
		printBits(nReset);
		//セット後の値を表示する
		System.out.println(nReset);

		//変更したいビットが何番目かを入力を促す
		System.out.print("何ビット目を変更しますか：");
		//変更したいビットが何番目かを入力
		nBitsNumber = stdIn.nextInt();
		//何個変更するか入力を促す
		System.out.print("いくつ変更しますか：");
		//何個変更するか入力する
		nNumber = stdIn.nextInt();
		//メソッドinverseを使って入力された整数の入力されたビットを反転する
		int nInverse = inverseN(nInput, nBitsNumber,nNumber);

		//反転後のビット構成を表示する
		printBits(nInverse);
		//反転後の値を表示する
		System.out.println(nInverse);

		//標準出力ストリームをクローズ
		stdIn.close();

	}

	//任意のビットを1でセットするメソッド
	static int setN(int x, int pos, int n) {
		int nReturn = x;
		//引数分繰り返す
		for(int i = 0; i < n; i++) {
			//1を任意の数シフトした値との論理和でセットする
			nReturn |= (1 << pos + i - 1);
		}
		//セット後の値を返却する
		return nReturn;
	}

	//任意のビットを0でリセットするメソッド
	static int resetN(int x, int pos, int n) {
		int nReturn = x;
		//引数分繰り返す
		for(int i = 0; i < n; i++) {
			//-1と1を任意の数シフトした値との排他的論理和で任意のビットのみ0の数値を作る
			int a = -1 ^ (1 << pos + i - 1);
			//作った値と引数の値で論理積で任意のビットをリセットさせる
			nReturn &= a;
		}

		//できたリセット後の値を返却する
		return nReturn;
	}

	//任意のビットを反転させるメソッド
	static int inverseN(int x, int pos, int n) {
		//返却に使う変数
		int nReturn = x;
		//引数分繰り返す
		for(int i = 0; i < n; i++) {
			//任意のビットが1の時
			if((x >> pos + i - 1 & 1) == 1 ) {
				//-1と1を任意の数シフトした値との排他的論理和で任意のビットのみ0の数値を作る
				int a = -1 ^ (1 << pos + i - 1);
				//作った値と引数の値で論理積で任意のビットをリセットさせる
				nReturn &= a;
			//0の時
			} else {
				//そのビットを1でセットする
				nReturn |= (1 << pos + i - 1);
			}
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

