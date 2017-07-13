package e_13_02;

public class IsoscelesTriangleLD extends IsoscelesTriangle {
	//コンストラクタ
	public IsoscelesTriangleLD(int length) {
		//親クラスのコンストラクタで初期化
		super(length);
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//図形情報を文字列で返却
		return "IsoscelesTriangleLD(length:" + getLength() + ")";
	}

	//描画するメソッド
	public void draw() {
		//一辺の長さ分だけ繰り返す
		for(int i = 0; i < getLength(); i++) {
			//その段数分だけ繰り返す
			for(int j = 0; j < i + 1 ; j++) {
				//アスタリスクで2等辺三角形を表示
				System.out.print('*');
			}
			//一段ごとに改行
			System.out.println();
		}
	}
}
