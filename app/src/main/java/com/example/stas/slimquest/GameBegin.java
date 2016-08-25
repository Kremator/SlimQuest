package com.example.stas.slimquest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by Stas on 25.08.2016.
 */
public class GameBegin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_begin_activity);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
