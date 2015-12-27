package me.rowe.demos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Rowe on 2015/12/27.
 */
public class HelloActivity extends Activity implements View.OnClickListener {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        findViewById(R.id.button).setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.text_hello);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                mTextView.setText("Hello");
                break;
        }
    }
}
