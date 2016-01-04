package me.rowe.demos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Rowe on 2015/12/27.
 */
public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                startActivity(new Intent(this, ClickActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this,HellosActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this,ViewsActivity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(this,DialerActivity.class));
                break;
            case R.id.button5:
                startActivity(new Intent(this,SmsSenderActivity.class));
                break;
        }
    }
}
