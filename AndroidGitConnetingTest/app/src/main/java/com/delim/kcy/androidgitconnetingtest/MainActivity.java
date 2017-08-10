package com.delim.kcy.androidgitconnetingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import kr.go.seoul.culturalevents.CulturalEventButtonTypeB;

public class MainActivity extends AppCompatActivity {

    private String key = "5a6c4f63676b636836384858566346";
    private CulturalEventButtonTypeB typeB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeB = (CulturalEventButtonTypeB) findViewById(R.id.type_b);
        typeB.setOpenAPIKey(key);
    }
}
