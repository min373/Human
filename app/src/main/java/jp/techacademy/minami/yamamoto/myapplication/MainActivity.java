package jp.techacademy.minami.yamamoto.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Humanクラスのインスタンス生成
        Human human = new Human("任意の名前", "任意の趣味", 0);

        human.say();
        human.think();
    }
}
