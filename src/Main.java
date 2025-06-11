//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args){
                // 引数なし
                Hero h = new Hero();//同じ名前
                System.out.println(h.name + "のHPは" + h.hp + "です");
                // 引数あり String
                Hero h1 = new Hero("ミナト");//同じ名前
                System.out.println(h1.name + "のHPは" + h1.hp + "です");
                // 引数あり int
                Hero h2 = new Hero(999);//同じ名前
                System.out.println(h2.name + "のHPは" + h2.hp + "です");
                // 引数2つ
                Hero h3 = new Hero(999, "ミナト");//同じ名前
                System.out.println(h3.name + "のHPは" + h3.hp + "です");
            }
        }
   //     h2.name ="アサカ";
        //h2.hp = 100;
  /*      Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
        System.out.println(h1.hp);


          Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix ='A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix ='B';
        h.slip();
        m1.run();
        m2.run();
        h.run();
*/


