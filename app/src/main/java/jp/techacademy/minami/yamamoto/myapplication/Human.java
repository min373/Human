package jp.techacademy.minami.yamamoto.myapplication;

import android.util.Log;

public class Human extends Animal implements Thinkable {

    //hobby変数の宣言
    String hobby;

    //コンストラクタの実装
    public Human(String name, String hobby, int age) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
    }

    //sayメソッドの実装
    @Override
    public void say(){
        Log.d("javatest", "「私の名前は" + this.name + "です。」");
        Log.d("javatest", "「年は" + this.age + "歳です。」");
    }

    //thinkメソッドの実装
    @Override
    public void think() {
        Log.d("javatest", "「私は" + this.hobby + "について考える。」");
    }

}
