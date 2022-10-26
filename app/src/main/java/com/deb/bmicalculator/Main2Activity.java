package com.deb.bmicalculator;

import android.Manifest;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.github.appintro.AppIntro2;
import com.github.appintro.AppIntroFragment;
import com.github.appintro.AppIntroPageTransformerType;

public class Main2Activity extends AppIntro2 {

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return super.getLayoutId();
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("The First Page","Give the required permission",R.drawable.communications, Color.parseColor("#252525")));
        addSlide(AppIntroFragment.newInstance("The Second Page","Give the required permission",R.drawable.letter, Color.parseColor("#252525")));
        addSlide(AppIntroFragment.newInstance("The Third Page","Give the required permission",R.drawable.notebook, Color.parseColor("#252525")));
        addSlide(AppIntroFragment.newInstance("The ForthPage","Give the required permission",R.drawable.technology, Color.parseColor("#252525")));
        askForPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},1,true);
        askForPermissions(new String[]{Manifest.permission.INTERNET},2,true);
        askForPermissions(new String[]{Manifest.permission.READ_CALL_LOG},3,true);
        askForPermissions(new String[]{Manifest.permission.SEND_SMS},4,true);
        setColorTransitionsEnabled(true);
    }

}
