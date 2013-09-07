package com.nathanosman.c2;

import android.app.IntentService;
import android.content.Intent;

public class UpdateService extends IntentService
{
    public UpdateService() {
		super("UpdateService");
	}
    
    /** Processes a single intent. */
    @Override
	protected void onHandleIntent(Intent intent)
	{
	    //...
	}
}

