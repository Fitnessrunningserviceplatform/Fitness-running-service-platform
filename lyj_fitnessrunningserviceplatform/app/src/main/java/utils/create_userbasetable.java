package utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by 75293 on 2018/1/1.
 */

/*
 private String account;
    private String password;
    private String QQ;
    private String email;
*/

public class create_userbasetable extends SQLiteOpenHelper {
    public static final String CREATE_USERBASETABLE="create table user("
            +"account varchar(7) primary key,"
            +"password varchar(10),"
            +"QQ varchar(10),"
            +"email varchar(19) )";

    private Context mContext;

    public create_userbasetable(Context context, String name, SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);
        mContext=context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USERBASETABLE);
        Toast.makeText(mContext,"Create succeeded",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
