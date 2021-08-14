package com.example.mlab5;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class music1 extends Service {
    MediaPlayer mpl;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public int onStartCommand(Intent pas2,int flags,int startId)
    {
        mpl= MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
        mpl.setLooping(true);
        mpl.start();
        return super.START_STICKY;

    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        mpl.stop();
    }
}