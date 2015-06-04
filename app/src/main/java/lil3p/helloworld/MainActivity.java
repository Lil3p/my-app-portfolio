package lil3p.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.*;


public class MainActivity extends ActionBarActivity {


    Button btnCapstoneApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCapstoneApp = (Button)findViewById(R.id.btnCapstoneApp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void cmdSpotifyClick(View v) {



        Toast t = Toast.makeText(
                getApplicationContext(),"This will launch Spotify Streamer !!!"
                ,Toast.LENGTH_SHORT  );

        t.show();
    }

    public void cmdScoreClick(View v) {


        Toast t = Toast.makeText(
                getApplicationContext(),"This will launch Scores App !!!"
                ,Toast.LENGTH_SHORT  );

        t.show();
    }
    public void cmdLibraryClick(View v) {



        Toast t = Toast.makeText(
                getApplicationContext(),"This will launch Library App !!!"
                ,Toast.LENGTH_SHORT  );

        t.show();
    }
    public void cmdBuildClick(View v) {



        Toast t = Toast.makeText(
                getApplicationContext(),"This will launch Builder App !!!"
                ,Toast.LENGTH_SHORT  );

        t.show();
    }
    public void cmdXYZClick(View v) {



        Toast t = Toast.makeText(
                getApplicationContext(),"This will launch XYZ app !!!"
                ,Toast.LENGTH_SHORT  );

        t.show();
    }
    public void cmdGFClick(View v) {

     btnCapstoneApp.setText("3 Months to Go");

        Toast t = Toast.makeText(
                getApplicationContext(),"This will launch GuardForce Mobile App !!!"
                ,Toast.LENGTH_SHORT  );

        t.show();
    }


}
