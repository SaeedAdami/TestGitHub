package com.example.saeed.testgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestMethod();
    }

    private void TestMethod() {
        int i = 0;

        i = i + 1;
    }

    private void PullDownMethod(){
        int j = 0;
    }

}
