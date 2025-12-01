package androidx.core.widget;

import android.widget.ListView;

public final class ListViewCompat {
    public static boolean canScrollList(ListView listView0, int v) {
        return listView0.canScrollList(v);
    }

    public static void scrollListBy(ListView listView0, int v) {
        listView0.scrollListBy(v);
    }
}

