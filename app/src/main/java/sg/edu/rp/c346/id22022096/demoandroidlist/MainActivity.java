package sg.edu.rp.c346.id22022096.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //ListView lv;
    //ArrayList<String> al;
    //ArrayAdapter<String> aa;

    ListView lvAndroidVersions;
    ArrayList<AndroidVersion> alAndroidVersions;
    //ArrayAdapter<AndroidVersion> aaAndroidVersions;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lv = findViewById(R.id.lv);

        //al = new ArrayList<>();

        //al.add("Android 1.5: Cupcake");
        // al.add("Android 1.6: Donut");
       //al.add("Android 2.1: Eclair");
        //al.add("Android 2.2: Froyo");
        //al.add("Android 2.3: Ginger Bread");
        //al.add("Android 3.0: Honeycomb");
        //al.add("Android 4.0: Ice-cream Sandwich");
        //al.add("Android 4.1: Jellybean");
        //al.add("Android 4.4: Kitkat");
        //al.add("Android 5.0: Lollipop");
        //al.add("Android 6.0: Marshmallow");
        //al.add("Android 7.0: Nougat");
        //al.add("Android 8.0: Oreo");
        //al.add("Android 9.0: Pie");
        //al.add("Android 10.0: Android 10");

        //aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, al);
        //lv.setAdapter(aa);

        lvAndroidVersions = findViewById(R.id.lvAndroidVersions);
        alAndroidVersions = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        alAndroidVersions.add(item1);
        alAndroidVersions.add(item2);
        alAndroidVersions.add(item3);

        //aaAndroidVersions = new ArrayAdapter<>(this,
                //android.R.layout.simple_list_item_1, alAndroidVersions);

        adapter = new CustomAdapter(this, R.layout.row, alAndroidVersions);

        //lvAndroidVersions.setAdapter(aaAndroidVersions);

        lvAndroidVersions.setAdapter(adapter);
    }

}
