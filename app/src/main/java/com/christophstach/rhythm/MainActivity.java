package com.christophstach.rhythm;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout) findViewById(R.id.main);

        for(int i = 0; i < 8; i++) {
            TextView el = (TextView) getLayoutInflater().inflate(R.layout.textview_notebutton, null);
            el.setText(Character.toString((char)((int)'A' + i)));

            layout.addView(el);
        }
    }
}
