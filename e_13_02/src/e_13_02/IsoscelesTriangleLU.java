package e_13_02;

public class IsoscelesTriangleLU extends IsoscelesTriangle{

	//コンストラクタ
	public IsoscelesTriangleLU(int length) {
		//親クラスのコンストラクタで初期化
		super(length);
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//図形情報を文字列で返却
		return "IsoscelesTriangleLU(length:" + getLength() + ")";
	}

	//描画するメソッド
	public void draw() {
		//一辺の長さ分だけ繰り返す
		for(int i = 0; i < getLength(); i++) {
			//一辺の長さからその段目を引いた分だけ繰り返す
			for(int j = getLength() - i; j > 0; j--) {
				//アスタリスクで2等辺三角形を表示
				System.out.print('*');
			}
			//一段ごとに改行
			System.out.println();
		}
	}
}
