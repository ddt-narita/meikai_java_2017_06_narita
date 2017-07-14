/* 演習14-03
 * クラスDVDPlayerを利用するプログラムの作成
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_14_03;

import java.util.Scanner;

public class DVDPlayerTester {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//DVDPlayerのインスタンスを生成
		DVDPlayer dvd = new DVDPlayer();

		//直前に何をしていたか保管するための変数
		int preHandle = 0;

		//0が入力されてbreak文で抜け出すまで繰り返す
		while(true) {
			//何をするか入力を促す表示
			System.out.print("1…再生/2…停止/3…スロー再生/0…終了：");
			//何をするのかを入力
			int nHandle = stdIn.nextInt();
			//終了が入力されたときにはbreak文でループを抜けて終了
			if(nHandle == 0) {
				break;
			}

			//入力された値で分岐
			switch(nHandle) {
			//再生の時
			case 1:
				//前回の操作が再生の時
				if(preHandle == 1){
					//すでに再生は行っていることを表示
					System.out.println("！すでに再生しています。");
				//それ以外の時は
				} else {
					//再生メソッドを呼び出して再生する
					dvd.play();
					//現在の操作を保管する
					preHandle = nHandle;
				}
				break;

			//停止の時
			case 2:
				//前回の操作が再生、スロー再生どちらでもないとき
				if(preHandle != 1 && preHandle != 3) {
					//まだ再生していないことを表示
					System.out.println("！まだ再生していません。");
				//それ以外の時
				} else {
					//停止のメソッドで停止
					dvd.stop();
					//今回の操作を保管する
					preHandle = nHandle;
				}
				break;

			//スロー再生の時
			case 3:
				//前回の操作がスロー再生の時
				if(preHandle == 3) {
					//すでに実行済みであることを表示
					System.out.println("！すでにスロー再生中です");
				//それ以外の時
				} else {
					//スロー再生のメソッドでスロー再生を行う
					dvd.slow();
					//今回の操作を保管
					preHandle = nHandle;
				}
				break;
			}

			//一回の操作ごとに改行
			System.out.println();
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
