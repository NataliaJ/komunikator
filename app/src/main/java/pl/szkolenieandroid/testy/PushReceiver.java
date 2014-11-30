package pl.szkolenieandroid.testy;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.parse.ParsePushBroadcastReceiver;

import de.greenrobot.event.EventBus;

/**
 * Created by Malgorzata Jablonska on 2014-11-30.
 */
public class PushReceiver extends ParsePushBroadcastReceiver {

    private EventBus bus = EventBus.getDefault();

    @Override
    protected void onPushReceive(Context context, Intent intent) {
        Log.e("###","onPushReceive");
        bus.post(new UpdateMessagerListEvent());
    }
}
