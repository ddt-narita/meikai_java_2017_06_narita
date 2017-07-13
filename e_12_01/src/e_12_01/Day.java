package e_12_01;

public class Day {

	private int year = 1;		//年を表すメンバ変数
	private int month = 1;		//月をあらわすメンバ変数
	private int date = 1;		//日にちを表すメンバ変数

	//引数を与えない場合のコンストラクタ
	public Day() {

	}

	//引数を年だけ与える時のコンストラクタ
	public Day(int year) {
		this.year = year;
	}
	//引数を年と月だけ与える時のコンストラクタ
	public Day(int year, int month) {
		//年の初期化を上の年だけを受け取るコンストラクタで実行
		this(year);
		this.month = month;
	}

	//引数を年と月と日にちまで与えるコンストラクタ
	public Day(int year, int month, int date) {
		//年と月の初期化を上の年と月だけ受け取るコンストラクタで実行
		this(year,month);
		this.date = date;
	}
	//引数に同じクラスの異なるオブジェクトを受け取るコピーコンストラクタ
	public Day(Day d) {
		//引数のオブジェクトの各フィールドの値で上のすべての引数を受け取るコンストラクタを実行して初期化
		this(d.year, d.month, d.date);
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
		return date;
	}

	//引数で受け取った値で年をセットするメソッド
	public void setYear(int year) {
		this.year = year;
	}

	//引数で受け取った値で月をセットするメソッド
	public void setMonth(int month) {
		this.month = month;
	}

	//引数に受け取った値で日にちをセットするメソッド
	public void setDate(int date) {
		this.date = date;
	}

	//引数で受け取ったそれぞれの価でフィールドをセットするメソッド
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	//その日の曜日に相当する値を返却するメソッド
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if(m == 1 || m == 2) {
			y--;
			m += 12;
		}
		//曜日に相当する値を返却する
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;

	}
	//引数のDay型オブジェクトのフィールドの値がこのオブジェクトと等しいかを返却するメソッド
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && d.date == date;
	}

	//オブジェクトの文字列表現を返却するメソッド
	public String toString() {
		//曜日を表す配列
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		//オブジェクトの日付曜日を文字列表現で返却する
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
}
