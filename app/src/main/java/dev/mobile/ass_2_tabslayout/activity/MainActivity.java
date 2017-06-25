package dev.mobile.ass_2_tabslayout.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import dev.mobile.ass_2_tabslayout.R;

/**
 * @author CuongNV
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar mToolbar;
    private Button mBtnSimpleTabs;
    private Button mBtnIconTextTabs;
    private Button mBtnIconTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mBtnSimpleTabs = (Button) findViewById(R.id.btnSimpleTabs);
        mBtnIconTextTabs = (Button) findViewById(R.id.btnIconTextTabs);
        mBtnIconTabs = (Button) findViewById(R.id.btnIconTabs);

        mBtnSimpleTabs.setOnClickListener(this);
        mBtnIconTextTabs.setOnClickListener(this);
        mBtnIconTabs.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSimpleTabs:
                startActivity(new Intent(MainActivity.this, SimpleTabsActivity.class));
                break;
            case R.id.btnIconTextTabs:
                startActivity(new Intent(MainActivity.this, IconTextTabsActivity.class));
                break;
            case R.id.btnIconTabs:
                startActivity(new Intent(MainActivity.this, IconTabsActivity.class));
                break;
        }
    }
}
