package com.padcmyanmar.padc9.fragmenthw.acitivties;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.padcmyanmar.padc9.fragmenthw.R;
import com.padcmyanmar.padc9.fragmenthw.adapters.TabPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);

        TabPagerAdapter tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_LONG).show();
        }else if(id == R.id.action_policy){
            Toast.makeText(getApplicationContext(), "Privacy policy", Toast.LENGTH_LONG).show();
        }else if(id == R.id.action_feedback){
            Toast.makeText(getApplicationContext(), "Feedback", Toast.LENGTH_LONG).show();
        }else Toast.makeText(getApplicationContext(), "Log in", Toast.LENGTH_LONG).show();

        return super.onOptionsItemSelected(item);
    }

}
