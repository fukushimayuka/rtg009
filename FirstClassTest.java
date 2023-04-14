import java.util.Date;
import java.util.Objects;

/**
 * エンジニアの属性と挙動
 * @author tarou tanaka
 * @version 1.0
 */
class Engineer {

    String fullName; //フルネーム
    int    age;      //年齢
    String belongTo; //所属先
    String skill;    //所持スキル

    //コンストラクタ（インスタンス化するときに必ず呼ばれる特別なメソッド）
    public Engineer(String _fullName, int _age, String _belongTo, String _skill){
        this.fullName = _fullName;
        this.age      = _age;
        this.belongTo = _belongTo;
        this.skill    = _skill;
    }

    /*
     * 自己紹介を行う
     */
    public void introduce(){
        System.out.println(
            String.format(
                "私の名前は%sです。%sに所属するエンジニアです。現在%d歳で、得意言語は%sです。",
                fullName,
                belongTo,
                age,
                skill
            )
        );
    }

    /**
     * 稼働開始する
     */
    public void startWork(){
        Date _d = new Date();
        System.out.println("稼働開始しました。" + _d);
    }

    /**
     * 稼働終了する
     */
    public void finishWork(){
        Date _d = new Date();
        System.out.println("稼働終了します。" + _d);
    }



    /**
    * スキルを取得
    * @return String 所持スキル文字列
    */
    public String getSkill(){
        if (Objects.isNull(skill) || skill.length() <= 0){
            return "スキルを持っていません。";
        } else {
            return skill;
        }

    
}




}

/**
 * 実行クラス
 */
public class FirstClassTest {
    public static void main(String[] args) {
        Engineer fukushima = new Engineer(
            "yuka fukushima",
            27,
            "アイフル株式会社",
            "Java, JavaScript, Scala, Python, C#");
        fukushima.introduce();
        fukushima.startWork();
        fukushima.finishWork();

        Engineer tanaka = new Engineer(
            "Tanaka Tarou",
            27,
            "XXXX株式会社",
            "C++, Rust, Haskell");
        tanaka.introduce();
        tanaka.startWork();
        tanaka.finishWork();




        System.out.println(fukushima.getSkill());


    }
}
