package nirun.krirk.ac.th.niruncalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import nirun.krirk.ac.th.niruncalculate.fragment.MainFagement;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add Fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment,new MainFagement())
                    .commit();

        }


    } //main method

    @Override
    public void onClick(View view) {

    }
}// Main Class
