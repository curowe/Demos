package me.rowe.demos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Rowe on 2015/12/27.
 */
public class ClickActivity extends Activity implements View.OnClickListener {

    private TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        findViewById(R.id.bt1).setOnClickListener(this);
        findViewById(R.id.bt2).setOnClickListener(this);
        findViewById(R.id.bt3).setOnClickListener(this);
        mTextView = (TextView) findViewById(R.id.tv);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt1:
                mTextView.append("鹏鹏");
                break;
            case R.id.bt2:
                mTextView.append("非常喜欢");
                break;
            case R.id.bt3:
                mTextView.append("罗罗");
                break;

        }
    }
}
