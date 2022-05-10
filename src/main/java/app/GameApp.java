package app;

public class GameApp {
    
    public String item;  //フィールド
        
    public GameApp() {  //ディフォルトコンストラクター
            
    }
        
    public GameApp(String item) {  //コンストラクター
        this.item = item;
    }
        
    public String start(String n) {  //startメソッド
         //String m;
         //m = n +"さんと" + this.item + "でゲームを開始します。";
         return n +"さんと" + this.item + "でゲームを開始します。";
    }
    
}