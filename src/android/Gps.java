package com.adp.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Gps extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("capture")) {

            String name = data.getString(0);
            String message = "capture, " + name;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}
