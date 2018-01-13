package com.example.a75293.lyj_fitnessrunningserviceplatform;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class user_main_interface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main_interface);

        final ImageView setting= (ImageView) findViewById(R.id.im_setting);//用户设置图标

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(user_main_interface.this, user_setting.class);
                startActivity(intent);
            }
        });
    }
}
