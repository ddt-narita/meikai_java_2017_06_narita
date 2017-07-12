/* 演習10-04
 * 日付クラスの改良
 * 作成日：7月6日
 * 作成者：成田修之
 */

package e_10_04;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class Date {

	//グレゴリオ暦クラスのフィールド
	static GregorianCalendar today;

	//各月の最大の日を求めるための配列
	static int[] maxDay = {31,28,31,30,31,30,31,31,30,31,30,31};

	//プログラム実行時の日付の年をデフォルト値とする
	private int year = today.get(YEAR);
	//プログラム実行時の日付の月をデフォルト値とする
	private int month = today.get(MONTH) + 1;
	//プログラム実行時の日付の日にちをデフォルト値とする
	private int day = today.get(DATE);

	//クラス初期化子としてプログラムの実行時に一回だけ実行する
	static {
		//フィールドのtodayにGregorianCalendarインスタンスを生成
		today = new GregorianCalendar();
	}


	//うるう年かどうかを判定するメソッド
	public static boolean isLeap(int y) {
		return  y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}

	//デフォルトコンストラクタ
	public Date() {

	}
	//引数に年だけ与えるデフォルトコンストラクタ
	public Date(int year) {
		this.year = year;
	}

	//引数に年と月だけ与えるデフォルトコンストラクタ
	public Date(int year, int month) {
		this(year);
		//月については不正な値が入力されないようにメソッドsetMonthを用いて初期化
		setMonth(month);
	}

	//コンストラクタ
	public Date(int year, int month, int day) {
		//年と月についてはその引数でのコンストラクタで初期化する
		this(year, month);
		//日にちに関しては不正な値が入力され内容にメソッドsetMonthを用いて初期化
		setDate(day);
	}

	//コピーコンストラクタ
	public Date(Date d) {
		//3つの引数を受け取るコンストラクタ
		this(d.year, d.month, d.day);
	}

	//年を返却するメソッド
	public int getYear() {
		return year;
	}

	//月を返却するメソッド
	public int getMonth() {
		return month;
	}

	//日にちを返却するメソッド
	public int getDate() {
		return day;
	}

	//年のセッター
	public void setYear(int year) {
		this.year = year;
	}

	//月のセッター
	public void setMonth(int month) {
		//引数が1より小さい値の時は１で
		if(month < 1) {
			this.month = 1;
		//12より大きいときは12でセットする
		} else if(month > 12) {
			this.month = 12;
		//正当な値の時はそのまま入力
		} else {
			this.month = month;
		}

	}

	//日にちのセッター
	public void setDate(int day) {
		//引数が1以下の時1でセット
		if(day < 1) {
			this.day= 1;
		//各月の最大の日織大きいときはその最大の日付を代入
		} else if(day > maxDay[month - 1]) {
			this.day = maxDay[month - 1];
		} else {
			this.day = day;
		}
	}

	//日付のセッター
	public void set(int year, int month, int day) {
		 this.year = year;
		 setMonth(month);
		 setDate(day);
	 }

	//そのインスタンスの年がうるう年かどうか判定するメソッド
	public boolean isLeap() {
		return isLeap(year);
	}

	//曜日に相当する値をを返却する変数
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if(m == 1 || m == 2) {
			y--;
			m += 12;
		}

		//うるう年かどうかを返却する
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + day) % 7;
	}

	//日付が等しいかどうかを判定するメソッド
	public boolean equalTo(Date d) {
		//すべてのフィールドが等しいかどうか判定する
		return year == d.year && month == d.month && day == d.day;
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//各曜日に当たる文字の配列
		String[] wd = {"日","月","火","水","木","金","土"};

		//メソッドdayOfWeekで返却された値に応じて曜日を返却する
		return String.format("%04d年%02d月%02d日(%s)",year, month, day, wd[dayOfWeek()]);
	}

	//年内の経過日数を求めるメソッド
	public int spendDate() {
		//返却する経過日数
		int spenddays = 0;

		//インスタンスの月の前月まで繰り返す
		for(int i = 0; i < month - 1; i++) {
			//うるう年の2月の時は29日なので経過日数に1足す
			if(i == 1 && isLeap() == true) {
				spenddays += 1;
			}
			//各月の最大日数で加算する
			spenddays += maxDay[i];
		}
		//最後にインスタンスの日にち分足して経過日数を求める
		spenddays += day;

		//求めた経過日数を返却する
		return spenddays;
	}

	//年内の残り日数を返却する
	public int leftDays() {
		//うるう年の時は366から、そうでないときは365から経過日数を引いた残り日数を返却する
		return (isLeap() ? 366 : 365) - spendDate();
	}

	//ほかの日付との前後関係を判定するメソッド
	public int dayJudge(Date d) {

		//返却に使う変数。日付が引数の日付より新しければ1、古ければ-1、同じなら0を返却する
		int nReturn = 0;

		//年が古いときは-1を代入
		if(year < d.getYear()) {
			nReturn = -1;
		//年が新しいときは1を代入
		} else if(year > d.getYear()) {
			nReturn = 1;
		//年が同じ時
		} else {
			//月が古いときは-1を代入
			if(month < d.getMonth()) {
				nReturn = -1;
			//月が新しいときは1を代入
			} else if(month > d.getMonth()) {
				nReturn = 1;
			//月まで同じとき
			} else {
				//日にちが古いとき-1を代入
				if(day < d.getDate()) {
					nReturn = -1;
				//日にちが新しいとき1を代入
				} else if(day > d.getDate()) {
					nReturn = 1;
				}
			}
		}
		//日付が引数の日付より新しければ1、古ければ-1、同じなら0を返却する
		return nReturn;
	}

	//2つの日付の前後関係を判定するメソッド
	public static int dayJudge(Date d1, Date d2) {
		//第一引数d1についてメソッドdayjudgeを使って前後関係を判定
		return d1.dayJudge(d2);
	}

	//日付を一つ後ろに進めるメソッド
	public void followingDay() {
		//メソッドfollowingDateで返却された日付でコピーしたインスタンスを取る
		Date n = new Date(followingDate());
		//各要素を次の日のデータを返却する
		this.year = n.year;
		this.month = n.month;
		this.day = n.day;
	}

	//次の日の日付を返却するメソッド
	Date followingDate() {
		//返却する日付をインスタンスをコピーしておく
		Date dateReturn = new Date(this);
		//日にちが各月の最大の日の時
		if(dateReturn.day == maxDay[dateReturn.month]) {
			//1日に設定して
			dateReturn.day = 1;
			//12月より大きいなら年を一年増やして、月を1月に設定する
			if(++dateReturn.month > 12) {
				dateReturn.year++;
				dateReturn.month = 1;
			}
		//日にちが最大の秀はなければそのまま加算
		} else {
			dateReturn.day++;
		}
		//最終的な日付を返却する
		return dateReturn;
	}

	//日付を一つ前に戻すメソッド
	public void previousDay() {
		//前の日を返却するメソッドで前の日のインスタンスを作る
		Date n = new Date(previousDate());
		//各要素を前の日の要素でコピー
		this.year = n.year;
		this.month = n.month;
		this.day = n.day;

	}

	public Date previousDate() {
		//インスタンスのコピーを取る
		Date dateReturn = new Date(this);

		//日付が1の時
		if(dateReturn.day == 1) {
			//その中で月が1の時12月に戻して
			if(--dateReturn.month < 1) {
				dateReturn.month = 12;
				dateReturn.year--;
			}
			//日にちをその月の最大の日に設定
			dateReturn.day = maxDay[dateReturn.month];
		//日付が1以外ならデクリメントした値を返却する
		} else {
			dateReturn.day--;
		}
		return dateReturn;
	}

	//n日進めるメソッド
	public void nAfterday(int n) {
		//メソッドafterでn日後の日付のインスタンスを作成
		Date sumple = new Date(this.nAfter(n));
		//各要素を代入
		this.day = sumple.day;
		this.month = sumple.month;
		this.year = sumple.year;

	}

	//n日進んだ日付を返却するメソッド
	public Date nAfter(int n) {
		//返却する日付
		Date nAfterday = new Date(this);

		//インスタンスの日付の日数に引数分足した値がその月の最大の日より大きいとき
		if(nAfterday.day + n > Date.maxDay[nAfterday.month]) {
			//足した日にちをコピー
			int i = nAfterday.day + n;
			//インスタンスの月を-1した値をコピー
			int j = nAfterday.month - 1;
			//足した日付がその月の最大の日より小さくなるまで繰り返す
			for(; i >= Date.maxDay[j]; j++) {
				//最大の日で引く
				i -= Date.maxDay[j];
				//月が12月を指しているとき
				if(j == 11) {
					//1月からにして
					j = -1;
					//年を繰り上げる
					nAfterday.year++;
				}
			}
			//最終的に求めた月を入力（1引いていたのでもとに戻す）
			nAfterday.month = j + 1 ;
			//その月の最大の日より小さくなった日付を代入する
			nAfterday.day = i;

		//最大の日以下のとき
		} else {
			//そのまま日付を足し合わせる
			nAfterday.day += n;
		}
		//最終的に求めたn日後の日付を返却する
		return nAfterday;
	}

	//n日戻すメソッド
		public void nBeforeday(int n) {
			//メソッドnBeforeでn日前の日付のインスタンスを作成
			Date sumple = new Date(this.nBefore(n));
			//各要素を代入
			this.day = sumple.day;
			this.month = sumple.month;
			this.year = sumple.year;

		}

	public Date nBefore(int n) {
		//返却する日付
		Date nBeforeday = new Date(this);

		//インスタンスの日付の日数に引数分足した値がその月の最大の日より大きいとき
		if(nBeforeday.day - n < 0) {
			//引いた日にちをコピー
			int i = nBeforeday.day - n;
			//インスタンスの前の月を-1した値をコピー
			int j = nBeforeday.month - 2;
			//足した日付がその前の月の最大の日より小さくなるまで繰り返す
			for(; i < 0; j--) {

				//前の月が1月より前になろうとしているとき
				if(j == -1) {
					//12月からにして
					j = 11;
					//年を繰り下げる
					nBeforeday.year--;
				}
				//最大の日で足す
				i += Date.maxDay[j];
			}
			//最終的に求めた月を入力（1引いていたのでもとに戻す）
			nBeforeday.month = j + 2 ;
			//値が0より大きくなったものを日付に代入
			nBeforeday.day = i;

			//0以上のとき
		} else {
			//そのまま日付を引く
			nBeforeday.day -= n;
		}
		//最終的に求めたn日後の日付を返却する
		return nBeforeday;
	}

}
