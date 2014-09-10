package myapp.beth.com.uinformed;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Sample extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }
    public void buttonOnClickSchedule(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Schedule.class));
    }
    public void buttonOnClickHighlights(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Highlights.class));
    }
    public void buttonOnClickLineup(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Lineup.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sample, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
