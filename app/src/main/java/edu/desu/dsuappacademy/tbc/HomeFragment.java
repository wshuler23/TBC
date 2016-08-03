package edu.desu.dsuappacademy.tbc;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * Created by dsuappacademy on 7/29/16.
 */
public class HomeFragment extends Fragment implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener{
    View myView;
    //private VideoView vidView;
    private MediaPlayer mediaPlayer;
    private SurfaceHolder vidHolder;
    private SurfaceView vidSurface;
    String vidAddress = "http://livestream.com/accounts/5077358/events/5946090/videos/130776273";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){


        myView = inflater.inflate(R.layout.activity_main,container,false);

        vidSurface = (SurfaceView) myView.findViewById(R.id.videoView);
        vidHolder = vidSurface.getHolder();
        vidHolder.addCallback(this);
//        vidView = (VideoView) myView.findViewById(R.id.videoView);
//        String vidAddress = "http://ia802302.us.archive.org/27/items/Pbtestfilemp4videotestmp4/video_test.mp4";
//        Uri vidUri = Uri.parse(vidAddress);
//        vidView.setVideoURI(vidUri);
//        vidView.start();
//        MediaController vidControl = new MediaController(getActivity());
//        vidControl.setAnchorView(vidView);
//        vidView.setMediaController(vidControl);


        return myView;

    }
    @Override
    public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
        try {
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setDisplay(vidHolder);
            mediaPlayer.setDataSource(vidAddress);
            mediaPlayer.prepare();
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder arg0) {
//setup
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
mediaPlayer.start();
    }
}
