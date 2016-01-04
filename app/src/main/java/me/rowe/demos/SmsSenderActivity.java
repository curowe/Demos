package me.rowe.demos;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Rowe on 2015/12/30.
 */
public class SmsSenderActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smssender);
    }

    public void send(View v){
        //获取用户号码和短信内容
        EditText et_number= (EditText) findViewById(R.id.et_number);
        EditText et_content= (EditText) findViewById(R.id.et_content);
        String number=et_number.getText().toString();
        String content=et_content.getText().toString();

        //直接使用发送短信的api，无需启动系统的短信应用
        SmsManager sm= SmsManager.getDefault();

        //把长短信截成若干条短短信
        ArrayList<String> sms = sm.divideMessage(content);
        for (String string :sms)
        sm.sendTextMessage(number,null,string,null,null);


    }
}
