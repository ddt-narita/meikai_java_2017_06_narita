package e_12_02;

public class TimeAccount extends Account{

	//定期預金の預金残高
	private long timeBalance;

	//コンストラクタ
	TimeAccount(String name, String no, long balance, long timeBalance) {
		//親クラスのコンストラクタで初期化
		super(name, no, balance);
		//引数でフィールドの定期預金残高を初期化
		this.timeBalance = timeBalance;
	}

	//定期預金の預金残高のゲッター
	long getTimeBalance() {
		return timeBalance;
	}

	//定期預金を解約するメソッド
	void cancel() {
		//定期預金に入っている全額を普通預金に移す
		deposit(timeBalance);
		//定期預金をリセットする
		timeBalance = 0;
	}
}
