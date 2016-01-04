package me.rowe.demos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Rowe on 2015/12/30.
 */
public class DialerActivity extends Activity implements View.OnClickListener{

    private Button bt;
    private EditText et;
    //Activity创建时自动执行
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialer);

        //获取布局文件中定义的按钮
       bt= (Button) findViewById(R.id.button);
        //设置侦听
        bt.setOnClickListener(this);
    }
    //按钮点击时调用
    @Override
    public void onClick(View v) {
        //获取输入框的对象
        et= (EditText) findViewById(R.id.edittext);
        //获取用户输入的号码
        String number=et.getText().toString();
        //告诉系统，我的的动作是打电话
        //1.创建意图
        Intent intent=new Intent();
        //2.把动作封装在意图中
        intent.setAction(Intent.ACTION_CALL);
        //打电话打给谁
        intent.setData(Uri.parse("tel:"+number));
        //告诉系统，我的动作
        startActivity(intent);
    }
}
