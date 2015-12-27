package me.rowe.demos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Rowe on 2015/12/27.
 */
public class HellosActivity extends Activity implements View.OnClickListener {

    private Button mbutton;
    private TextView mtextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellos);
        mbutton= (Button) findViewById(R.id.button);
        mtextview= (TextView) findViewById(R.id.textview);
        mbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                mtextview.append("Hello");
                break;
        }

    }
}
