package in.aqel.nanodegreeprojects;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bSpotify).setOnClickListener(this);
        findViewById(R.id.bScores).setOnClickListener(this);
        findViewById(R.id.bLib).setOnClickListener(this);
        findViewById(R.id.bBuild).setOnClickListener(this);
        findViewById(R.id.bReader).setOnClickListener(this);
        findViewById(R.id.bCapstone).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String name = "";
        switch (v.getId()){
            case R.id.bSpotify:
                name = "Spotify";
                break;
            case R.id.bScores:
                name = "Scores";
                break;
            case R.id.bLib:
                name = "Library app";
                break;
            case R.id.bBuild:
                name = "Build it bigger";
                break;
            case R.id.bReader:
                name = "XYZ Reader";
                break;
            case R.id.bCapstone:
                name = "Capstone project";
                break;
        }

        Toast.makeText(MainActivity.this, "This button will launch " + name, Toast.LENGTH_SHORT).show();
    }
}
