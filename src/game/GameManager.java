package game;

import common.ErrorMessageUtil;
import common.ScanUtil;
import constant.Constant;

/**
 * ゲームマネージャー
 */
public class GameManager {

	/**
	 * コンストラクタ
	 */
	public GameManager() {

	}

	/**
	 * 実行
	 */
	public void execute() {

		while (true) {

			Select title = getSelectTitleNum();
			// 終了
			if (title.isEnd()) {
				System.out.println("Good Bye!");
				return;
			}

		}
	}

	/**
	 * タイトルで選択した番号を取得する
	 *
	 * @return
	 */
	private Select getSelectTitleNum() {
		// 選択オブジェクト
		Select select = null;

		while (true) {
			drawTitle();
			select = new Select(ScanUtil.inputNum());

			// エラー
			if (select.isNotTitle()) {
				ErrorMessageUtil.printInputError();
			} else {
				break;
			}

		}
		return select;
	}

	/**
	 * タイトルを描画する
	 */
	private void drawTitle() {
		System.out.println("**************************************");
		System.out.println("*               Poker                *");
		System.out.println("**************************************");
		System.out.println();
		System.out.println(Constant.START + "：開始");
		System.out.println(Constant.END + "：終了");
		System.out.print(">>");
	}

}
