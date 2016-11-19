package id.sch.smktelkom_mlg.project.xirpl403122130.basicweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ht);

        findViewById(R.id.imageView1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HT.this, isih1.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.imageView2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HT.this, isih2.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.imageView4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HT.this, isih3.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.imageView5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HT.this, isih4.class);
                startActivity(intent);
            }
        });
    }
}
