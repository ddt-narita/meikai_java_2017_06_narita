/* 演習09-03
 * 銀行口座クラスに口座開設日のフィールドとtoStringメソッドの追加を行う
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_09_03;

public class Account {
	private String name;		//口座名義を表すフィールド
	private String no;			//口座番号を表すフィールド
	private long balance;		//預金残高を表すフィールド
	private Day openDay;	//開設日を表すフィールド

	Account(String name, String no, long balance, Day purchaseDay) {
		this.name = name;			//口座名義を引数で初期化
		this.no = no;				//口座番号を引数で初期化
		this.balance = balance;		//預金残高を引数で初期化
		//口座開設日を引数で初期化
		this.openDay = new Day(purchaseDay);
	}

	//口座名義を返却するメソッド
	public String getName() {
		return name;
	}

	//口座番号を返却するメソッド
	public String getNo() {
		return no;
	}

	//預金残高を返却するメソッド
	public long getBalance() {
		return balance;
	}

	//預金残高から引数分預入するメソッド
	public void deposit(long k) {
		balance += k;
	}

	//預金残高から引数分引き落としするメソッド
	public void withdraw(long k) {
		balance -= k;
	}

	//口座開設日の日付を返却するメソッド
	public Day getOpenDay() {
		//コピーを作りその参照を返却する
		return new Day(openDay);
	}

	//文字列表現を返却するメソッド
	public String toString() {
		return String.format("    名前：%9s\n口座番号：%8s\n預金残高：%015d\n口座開設日："+ openDay + "\n", name, no, balance);
	}
}
