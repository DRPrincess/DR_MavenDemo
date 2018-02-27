package com.nexuslibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 *
 *描述   ：测试的Activity
 *
 *作者   ：Created by DuanRui on 2018/2/7.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nexuslibrary_activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "孩子不听话，说好的千万别点呢", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
