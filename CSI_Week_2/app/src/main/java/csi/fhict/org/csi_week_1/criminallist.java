package csi.fhict.org.csi_week_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class criminallist extends AppCompatActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminallist);

        //Get a reference to the listview
        ListView listview = (ListView) findViewById(R.id.lvCriminal);
        //Get a reference to the list with names
        final String[] criminals = getResources().getStringArray(R.array.names);
        //Create an adapter that feeds the data to the listview
        listview.setAdapter(
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_list_item_1,
                        criminals
                )
        );

        final criminallist temp = this;

        //blbabal
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Get the name from the array that is in the same position as the chosen listitem.
                String name = criminals[position];

                Intent intent = new Intent(temp, MainActivity.class);
                String nameCriminal = parent.getItemAtPosition(position).toString();
                intent.putExtra("NAME_CRIMINAL", nameCriminal);
                startActivity(intent);
            }
        });

    }

}
