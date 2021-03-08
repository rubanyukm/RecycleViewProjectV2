package com.ebookfrenzy.navigationproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.ebookfrenzy.navigationproject.ui.main.MainFragment;
import android.net.Uri;

public class MainActivity extends AppCompatActivity implements
        firstFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}