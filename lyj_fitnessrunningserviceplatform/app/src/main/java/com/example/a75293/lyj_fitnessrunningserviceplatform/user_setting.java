package com.example.a75293.lyj_fitnessrunningserviceplatform;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class user_setting extends AppCompatActivity {
   private String[] data ={"隐私设置","账号管理","安全中心","求助反馈","关于"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_setting);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(
          user_setting.this,android.R.layout.simple_list_item_1,data);
        ListView listView =(ListView)findViewById(R.id.user_setting);
        listView.setAdapter(adapter);

        Button logoff = (Button)findViewById(R.id.logoff);
        logoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnBackPressed();
            }
        });
    }

    public void OnBackPressed(){
        new AlertDialog.Builder(this).setTitle("确认退出吗")
        .setIcon(android.R.drawable.ic_dialog_info)
        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                user_setting.this.finish();
            }
        })
                .setNegativeButton("返回", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).show();
    }
}
