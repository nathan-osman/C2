package com.nathanosman.c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver
{
    /** Immediately starts the update service. */
	@Override
	public void onReceive(Context context, Intent intent)
	{
        Intent updateIntent = new Intent(context, UpdateService.class);
	    context.startService(updateIntent);
	}
}
