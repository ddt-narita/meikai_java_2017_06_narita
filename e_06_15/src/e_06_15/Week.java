/* 演習06-15
 * 曜日を表示してその英語表現を入力させる英単語学習プログラムの作成
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_15;

import java.util.Random;
import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成する
		Random rand = new Random();

		//各曜日の綴りの配列
		String[] weekString = {
				"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"
		};
		//各曜日の漢字の配列
		String[] weekday = {
				"月", "火", "水", "木", "金", "土", "日"
		};

		int retry = 1;		//もう一度行うか入力するための変数
		int preWeek = 1;	//前の月を保管しておくための変数


		//利用者が望む限り何度でも繰り返せる
		for(;retry == 1;) {
			String strInputWeek;		//
			int week = 1;				//ランダムな月を入力するための変数for文の条件のために前の月の変数と同じ値で初期化


			//前の月と同じ限り繰り返す
			for(;week == preWeek;){
				//いずれかの月に該当するランダムな値を入力
				week = rand.nextInt(7);
			}

			//次回のために前の月として保管する
			preWeek = week;

			//正解して抜け出すまで繰り返す
			for(;true;) {
				//問題の月を表示
				System.out.print(weekday[week] + "曜日：");
				//その月の綴りを入力する
				strInputWeek = stdIn.next();

				//綴りがあっているとき
				if(strInputWeek.equals(weekString[week])){
					//ループを抜け出して次へ行く
					break;
				//綴りが間違っているとき
				} else {
					//間違ってることを表示してもう一度綴りを入力しなおす
					System.out.println("違います。");
				}
			}

			//正解であることを明示しこのゲームをもう一度行うかどうか入力をうながす
			System.out.print("正解です。もう一度？ 1…Yes/0…No：");
			//もう一度行うかどうか入力
			retry = stdIn.nextInt();
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
