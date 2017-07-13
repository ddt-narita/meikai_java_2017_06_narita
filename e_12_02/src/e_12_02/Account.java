package e_12_02;

public class Account {
	//何番目まで識別番号を与えたかを表すクラス変数
	private static int counter = 0;

	private String name;		//口座名義を表すフィールド
	private String no;			//口座番号を表すフィールド
	private long balance;		//預金残高を表すフィールド
	private int id;			//識別番号を表すフィールド

	{
		//インスタンス初期化子でインスタンスを作成するたびに表示するようにする
		System.out.println("「明解銀行での口座開設ありがとうございます。」");
	}

	//コンストラクタ
	public Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
		id = ++counter;
	}

	//口座名義のゲッター
	public String getName() {
		return name;
	}
	//口座番号のゲッター
	public String getNo() {
		return no;
	}
	//預金残高のゲッター
	public long getBalance() {
		return balance;
	}
	//識別番号のゲッター
	public int getId() {
		return id;
	}
	//引数分預け入れるメソッド
	public void deposit(long k) {
		//預金残高に引数分足す
		balance += k;
	}

	//引数分引き下ろすメソッド
	public void withdraw(long k) {
		//預金残高に引数分引く
		balance -= k;
	}
}
