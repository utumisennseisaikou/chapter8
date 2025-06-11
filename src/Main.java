//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args){
        Hero h = new Hero("minato");
    //    h1.name ="ミナト";
   //     h1.hp = 100;
        System.out.println(h.hp);
        System.out.println(h.name);
        Hero h2 = new Hero();
        System.out.println(h2.hp);
        System.out.println(h2.name);
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

    }
}