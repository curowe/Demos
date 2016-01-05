package me.rowe.demos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Rowe on 2016/1/4.
 */
public class ReadFilesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readfiles);
    }

    public void Login(View v) throws IOException {
        EditText et_name = (EditText) findViewById(R.id.et_name);
        EditText et_pass = (EditText) findViewById(R.id.et_pass);
        String name = et_name.getText().toString();
        String pass = et_pass.getText().toString();

        CheckBox cb = (CheckBox) findViewById(R.id.cb);
        if (cb.isChecked()) {
            //把账号密码保存至本地
            File file = new File(getFilesDir(), "info.txt");
            FileOutputStream fos = new FileOutputStream(file);
            try {
                //把账号密码写到文件中
                fos.write((name + "&&" + pass).getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                fos.close();
            }
        }
        //创建吐司对话框
        Toast ts = Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT);
        ts.show();
    }

}
