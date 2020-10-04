package com.flipweb.cameratestingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(this.canAccessCameraHardware(getApplicationContext())) {

        }
        else {
            Toast toas = Toast.makeText(getApplicationContext(), "Could not find your camera.", Toast.LENGTH_SHORT);
        }
    }

    private boolean canAccessCameraHardware(Context context) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
    }

}