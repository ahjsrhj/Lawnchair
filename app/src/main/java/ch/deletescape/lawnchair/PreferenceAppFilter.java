package ch.deletescape.lawnchair;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;

import ch.deletescape.lawnchair.preferences.IPreferenceProvider;
import ch.deletescape.lawnchair.preferences.PreferenceFlags;

public class PreferenceAppFilter implements AppFilter {

    @Override
    public boolean shouldShowApp(ComponentName app, Context context) {
        if (app.getPackageName().equals(context.getPackageName()))
            return false;
        IPreferenceProvider prefs = Utilities.getPrefs(context);
        return prefs.showHidden() || !Utilities.isAppHidden(context, app.flattenToString());
    }
}
