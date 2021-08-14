package com.example.mlab10;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] title={"car","Bus","bike","rail","walk"};
    String[] time={"3 hours","5 hours","3 hours","10 hours","7 hours"};
    int icons[]={R.drawable.cars, R.drawable.bus, R.drawable.bike,R.drawable.rail,R.drawable.walk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        listView.setAdapter(new myListAdapter(this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                NotificationCompat.Builder builder=new
                        NotificationCompat.Builder(MainActivity.this).setSmallIcon(icons[position]);
                builder.setContentTitle(title[position]);
                builder.setContentText(time[position]);
                builder.setSmallIcon(icons[position]);
                NotificationManager
                        notificationManager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
                    NotificationChannel channel = new NotificationChannel(
                            "ch",
                            "ch",
                            NotificationManager.IMPORTANCE_HIGH);
                    notificationManager.createNotificationChannel(channel);
                    builder.setChannelId("ch");
                }
                notificationManager.notify(position, builder.build());
            }
        });
    }
    private class myListAdapter extends BaseAdapter {
        Context mycontext;
        public myListAdapter(MainActivity mainActivity){
            mycontext=mainActivity;
        }
        @Override
        public int getCount() {
            return title.length;
        }
        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=
                    LayoutInflater.from(mycontext).inflate(R.layout.list,parent,false);
            ImageView imageView=view.findViewById(R.id.imageView);
            TextView t1=view.findViewById(R.id.textView);
            imageView.setImageResource(icons[position]);
            t1.setText(title[position]);
            return view;
        }
    }
}