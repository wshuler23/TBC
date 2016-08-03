package edu.desu.dsuappacademy.tbc;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

public class EmailFragment extends Fragment {

    VideoView myView;



    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState){

            View myView = inflater.inflate(R.layout.third_layout, container, false);

            return myView;
        }
    public void email(View view){
        Intent intent = null, chooser = null;

        Intent eIntent = new Intent(Intent.ACTION_SEND);
        eIntent.setData(Uri.parse("mailto:"));
        String[] to={"secretary@tabernacle-burlington.org"};
        eIntent.putExtra(Intent.EXTRA_EMAIL, to);
        eIntent.setType("message/rfc822");
        chooser = Intent.createChooser(eIntent, "Send Email");
        startActivity(chooser);
    }
    }