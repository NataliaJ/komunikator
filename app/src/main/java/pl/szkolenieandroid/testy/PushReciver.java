package pl.szkolenieandroid.testy;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.parse.ParsePushBroadcastReceiver;

/**
 * Created by Malgorzata Jablonska on 2014-11-30.
 */
public class PushReciver extends ParsePushBroadcastReceiver {
    @Override
    protected void onPushReceive(Context context, Intent intent) {
        Log.e("###","onPushReceive");
    }
}
