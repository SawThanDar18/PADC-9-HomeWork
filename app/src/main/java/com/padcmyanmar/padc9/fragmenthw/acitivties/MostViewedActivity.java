package com.padcmyanmar.padc9.fragmenthw.acitivties;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.padcmyanmar.padc9.fragmenthw.R;
import com.padcmyanmar.padc9.fragmenthw.fragments.MostViewedFragment;

public class MostViewedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView background_iv = findViewById(R.id.background_iv);
        background_iv.setImageResource(R.drawable.sir);

        TextView name_txtview = findViewById(R.id.name_txtview);
        name_txtview.setText(getString(R.string.most_name_tv));

        TextView title_txtview = findViewById(R.id.title_txtview);
        title_txtview.setText(getString(R.string.most_title_tv));

        TextView time_txtview = findViewById(R.id.time_txtview);
        time_txtview.setText(getString(R.string.most_time_tv));

        ImageView back_iv = findViewById(R.id.back_iv);
        back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

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
