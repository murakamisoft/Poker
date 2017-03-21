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

		Board board = null;
		CardManager cardManager = new CardManager();
		CardPointJudger judger = null;

		while (true) {
			Select title = getSelectTitleNum();
			// 終了
			if (title.isEnd()) {
				System.out.println("Good Bye!");
				return;
			}

			board = new Board();
			cardManager.createCardList();

			// シャッフル
			cardManager.shuffle();

			// カード表示
			board.setCard5List(cardManager.get5CardList());

			selectCardNum(board);

			judger = new CardPointJudger(cardManager.get5CardList());
			judger.judge();

		}

	}

	/**
	 * カードを選択する
	 *
	 * @param board
	 * @return
	 */
	private void selectCardNum(Board board) {
		// 選択オブジェクト
		Select select = null;

		while (true) {
			drawYakuList();

			// カード出力
			board.printCard5List();

			// カードステータス出力
			board.printCardStatusList();

			board.printSelectCardStatus();

			while (true) {

				select = new Select(ScanUtil.inputNum());

				// エラー
				if (select.isNotSelectCard()) {
					ErrorMessageUtil.printInputError();
				} else {
					break;
				}
			}

			// カード判定か
			if (select.isCardDeside()) {
				break;
			}

			// カードの残す配るを設定
			board.changeStatus(select.getNum());

		}
	}

	/**
	 * 役を描画する
	 */
	private void drawYakuList() {
		// TODO 自動生成されたメソッド・スタブ

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
