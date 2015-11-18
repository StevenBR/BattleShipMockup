package edu.byuh.cis.cs203.battleshipmockup;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import static edu.byuh.cis.cs203.battleshipmockup.R.layout.activity_main;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
    }
}
