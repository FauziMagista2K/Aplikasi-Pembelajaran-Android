package com.example.aplikasimobile;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class VideoActivity extends AppCompatActivity {
    public ImageView btnBack;
    public VideoView videoView;
    public VideoView videoView2;
    public VideoView videoView3;
    public VideoView videoView4;
    public VideoView videoView5;
    public VideoView videoView6;
    public Button play;
    public Button play2;
    public Button play3;
    public Button play4;
    public Button play5;
    public Button play6;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoView = (VideoView) findViewById(R.id.videoView);
        videoView2 = (VideoView) findViewById(R.id.videoView2);
        videoView3 = (VideoView) findViewById(R.id.videoView3);
        videoView4 = (VideoView) findViewById(R.id.videoView4);
        videoView5 = (VideoView) findViewById(R.id.videoView5);
        videoView6 = (VideoView) findViewById(R.id.videoView6);
        play = (Button) findViewById(R.id.play);
        play2 = (Button) findViewById(R.id.play2);
        play3 = (Button) findViewById(R.id.play3);
        play4 = (Button) findViewById(R.id.play4);
        play5 = (Button) findViewById(R.id.play5);
        play6 = (Button) findViewById(R.id.play6);


        mediaController = new MediaController(this);
    }
        public void VideoPlay (View view){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
            videoView.setVideoURI(uri);
            videoView.start();
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
        }
    public void VideoPlay2 (View view){
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView2.setVideoURI(uri);
        videoView2.start();
        videoView2.setMediaController(mediaController);
        mediaController.setAnchorView(videoView2);
    }
    public void VideoPlay3 (View view){
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView3.setVideoURI(uri);
        videoView3.start();
        videoView3.setMediaController(mediaController);
        mediaController.setAnchorView(videoView3);
    }
    public void VideoPlay4 (View view){
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView4.setVideoURI(uri);
        videoView4.start();
        videoView4.setMediaController(mediaController);
        mediaController.setAnchorView(videoView4);
    }
    public void VideoPlay5 (View view){
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView5.setVideoURI(uri);
        videoView5.start();
        videoView5.setMediaController(mediaController);
        mediaController.setAnchorView(videoView5);
    }
    public void VideoPlay6 (View view){
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView6.setVideoURI(uri);
        videoView6.start();
        videoView6.setMediaController(mediaController);
        mediaController.setAnchorView(videoView6);
    }

    }