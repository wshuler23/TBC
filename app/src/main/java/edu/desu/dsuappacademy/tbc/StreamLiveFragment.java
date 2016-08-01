package edu.desu.dsuappacademy.tbc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StreamLiveFragment extends Fragment {
        View myView;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState){
            myView = inflater.inflate(R.layout.third_layout,container,false);
            return myView;
        }
    }