package android.fabio.loginmvc.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.fabio.loginmvc.datamodel.UsuarioDataModel;

import androidx.annotation.Nullable;

public class AppDataBase extends SQLiteOpenHelper {
    public static final String DB_NAME ="mvc.sqlite";
    public static int version = 1;
    SQLiteDatabase db;

    public AppDataBase( Context context ) {
        super(context, DB_NAME, null, version);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        db.execSQL(UsuarioDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
