package csi.fhict.org.csi_week_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle.getString("NAME_CRIMINAL") != null){
            TextView tv = (TextView) findViewById(R.id.tvName);
            tv.setText(bundle.getString("NAME_CRIMINAL"));
        }
        else{
            TextView tv = (TextView) findViewById(R.id.tvName);
            tv.setText("Error");
        }
    }

    public void goToReport(View view){
        Intent intent = new Intent(this, ReportActivity.class);
        startActivity(intent);
    }
}
