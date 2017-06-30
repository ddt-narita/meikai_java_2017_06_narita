/* 演習06-14
 * 月を数値として表示してその英語表現を入力させるプログラムの作成
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_14;

import java.util.Random;
import java.util.Scanner;

public class Month {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成する
		Random rand = new Random();
		//各月の綴りの配列
		String[] monthString = {
				"January","February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"
		};

		//もう一度行うか入力するための変数
		int retry = 1;



		//利用者が望む限り何度でも繰り返せる
		for(;retry == 1;) {
			String strInputMonth;		//
			int month = 1;				//ランダムな月を入力するための変数for文の条件のために前の月の変数と同じ値で初期化
			int preMonth = 1;			//前の月を保管しておくための変数

			//前の月と同じ限り繰り返す
			for(;month == preMonth;){
				//いずれかの月に該当するランダムな値を入力
				month = rand.nextInt(12);
			}

			//次回のために前の月として保管する
			preMonth = month;

			//正解して抜け出すまで繰り返す
			for(;true;) {
				//問題の月を表示
				System.out.print((month + 1) + "月：");
				//その月の綴りを入力する
				strInputMonth = stdIn.next();

				//綴りがあっているとき
				if(strInputMonth.equals(monthString[month])){
					//ループを抜け出して次へ行く
					break;
				//綴りが間違っているとき
				} else {
					//間違ってることを表示してもう一度綴りを入力しなおす
					System.out.println("違います。");
				}
			}

			//正解であることを明示しこのゲームをもう一度行うかどうか入力をうながす
			System.out.print("正解です。もう一度？ 1…Yes/0…No");
			//もう一度行うかどうか入力
			retry = stdIn.nextInt();
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
