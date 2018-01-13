package com.example.a75293.lyj_fitnessrunningserviceplatform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import utils.create_userbasetable;

public class MainActivity extends AppCompatActivity {
    private create_userbasetable dbHelper_base;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        dbHelper_base=new create_userbasetable(this,"userbase.db",null,1);//创建数据库预先准备

        Button button_logon=(Button)findViewById(R.id.button_logon);//登陆按钮
        TextView textView_register=(TextView)findViewById(R.id.text_register);//注册

       button_logon.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,user_main_interface.class);
               startActivity(intent);
           }
       });

        textView_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//点击注册跳转到secondActivity界面
                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                dbHelper_base.getWritableDatabase();
            }
        });
    }
}
