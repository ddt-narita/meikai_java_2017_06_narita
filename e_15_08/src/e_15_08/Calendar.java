/* 演習15-08
 * コマンドライン引数で指定された月のカレンダーを表示させるプログラムの作成
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_15_08;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class Calendar {

	//年月日を与えてその日の曜日を返却するメソッド
	static int dayOfWeek(int y, int m, int d) {
		if(m == 1 || m == 2) {
			y--;
			m += 12;
		}

		//引数の年月日の曜日を返却する
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + d) % 7;
	}

	public static void main(String[] args) {

		//今日の日付のインスタンスを生成
		GregorianCalendar today = new GregorianCalendar();
		//各月の最大の日の配列
		int[] maxdayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int nYear;			//年を表す変数
		int nMonth;		//月を表す変数
		int nStartDay;	//各月の始まりの日の曜日を格納する変数

		//コマンドラインで与えられた引数の数を格納する
		int len = args.length;

		//引数の個数で分岐
		switch(len) {
		//与えられていないときは現在の月のカレンダー表示
		case 0:

			//始まりの日の曜日を現在の日付の年月と1日目を与えて求める
			nStartDay = dayOfWeek(today.get(YEAR), today.get(MONTH) + 1, 1);

			//これからカレンダーを表示する月を表示
			System.out.println(today.get(MONTH) + 1 + "月");

			//スタートの日にちの文空白を開ける
			for(int i = 0; i < nStartDay; i++) {
				System.out.print("   ");
			}

			//1からその月の最大の日まで繰り返す
			for(int i = 1; i <= maxdayOfMonth[today.get(MONTH)]; i++ ) {
				//日にちを最低3桁で表示
				System.out.printf("%3d", i);
				//その日が土曜日の時改行する
				if(dayOfWeek(today.get(YEAR), today.get(MONTH) + 1, i) == 6) {
					System.out.println();
				}
			}
			System.out.println();
			break;

		//コマンドライン引数でカレンダーを表示したい年だけ入力されたとき
		case 1:
			//引数の文字列の年を数値に変換して入力
			nYear = Integer.parseInt(args[0]);

			//引数で受け取った年を表示
			System.out.println(nYear + "年");

			//12か月分繰り返す
			for(int i = 0; i < 12; i++) {
				//これからカレンダーを表示する月を表示
				System.out.println( i + 1 + "月");

				//各月の初めの日の曜日を求めて格納
				nStartDay = dayOfWeek(nYear, i + 1, 1);

				//スタートの日にちの文空白を開ける
				for(int j = 0; j < nStartDay; j++) {
					System.out.print("   ");
				}

				//1から各月の最大の日まで繰り返す
				for(int j = 1; j <= maxdayOfMonth[i]; j++ ) {
					//各日付を表示
					System.out.printf("%3d", j);
					//その日付が土曜日の時改行する
					if(dayOfWeek(nYear, i + 1, j) == 6) {
						System.out.println();
					}
				}
				System.out.println();
				System.out.println();
			}
			break;

		//コマンドライン引数でカレンダーを表示させたい年月が入力されたとき
		case 2:
			//コマンドラインの第一引数を数値に直して格納
			nYear = Integer.parseInt(args[0]);
			//第二引数を数値に直して格納
			nMonth = Integer.parseInt(args[1]);

			//受け取った年月を表示する
			System.out.println(nYear + "年" + nMonth + "月");

			//入力された年月の始まりの日の曜日を求める
			nStartDay = dayOfWeek(nYear, nMonth, 1);
			//

			//始まりの日の曜日分空白を表示する
			for(int j = 0; j < nStartDay; j++) {
				System.out.print("   ");
			}

			//1から各月の最大の日まで繰り返す
			for(int j = 1; j <= maxdayOfMonth[nMonth - 1]; j++ ) {
				//日にちを表示
				System.out.printf("%3d", j);
				//その日にちが土曜日なら改行する
				if(dayOfWeek(nYear, nMonth, j) == 6) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();

			break;
		}

	}

}
