package com.redudant.pilpres_19;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.redudant.pilpres_19.lembagasurvey.ChartaPolitikFragment;
import com.redudant.pilpres_19.lembagasurvey.SLIFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.lembaga_survey, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.sli) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameLayout, new SLIFragment())
                    .addToBackStack(null)
                    .commit();
        }
        else if (item.getItemId() == R.id.chartapolitika) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameLayout, new ChartaPolitikFragment())
                    .addToBackStack(null)
                    .commit();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}