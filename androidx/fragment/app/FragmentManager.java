package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class FragmentManager {
    public interface BackStackEntry {
        CharSequence getBreadCrumbShortTitle();

        int getBreadCrumbShortTitleRes();

        CharSequence getBreadCrumbTitle();

        int getBreadCrumbTitleRes();

        int getId();

        String getName();
    }

    public static abstract class FragmentLifecycleCallbacks {
        public void onFragmentActivityCreated(FragmentManager fragmentManager0, Fragment fragment0, Bundle bundle0) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager0, Fragment fragment0, Context context0) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager0, Fragment fragment0, Bundle bundle0) {
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager0, Fragment fragment0, Context context0) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager0, Fragment fragment0, Bundle bundle0) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager0, Fragment fragment0, Bundle bundle0) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager0, Fragment fragment0, View view0, Bundle bundle0) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager0, Fragment fragment0) {
        }
    }

    public interface OnBackStackChangedListener {
        void onBackStackChanged();
    }

    static final FragmentFactory DEFAULT_FACTORY = null;
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    private FragmentFactory mFragmentFactory;

    static {
        FragmentManager.DEFAULT_FACTORY = new FragmentFactory();
    }

    public FragmentManager() {
        this.mFragmentFactory = null;
    }

    public abstract void addOnBackStackChangedListener(OnBackStackChangedListener arg1);

    public abstract FragmentTransaction beginTransaction();

    public abstract void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    public static void enableDebugLogging(boolean z) {
        FragmentManagerImpl.DEBUG = z;
    }

    public abstract boolean executePendingTransactions();

    public abstract Fragment findFragmentById(int arg1);

    public abstract Fragment findFragmentByTag(String arg1);

    public abstract BackStackEntry getBackStackEntryAt(int arg1);

    public abstract int getBackStackEntryCount();

    public abstract Fragment getFragment(Bundle arg1, String arg2);

    public FragmentFactory getFragmentFactory() {
        if(this.mFragmentFactory == null) {
            this.mFragmentFactory = FragmentManager.DEFAULT_FACTORY;
        }
        return this.mFragmentFactory;
    }

    public abstract List getFragments();

    public abstract Fragment getPrimaryNavigationFragment();

    public abstract boolean isDestroyed();

    public abstract boolean isStateSaved();

    @Deprecated
    public FragmentTransaction openTransaction() {
        return this.beginTransaction();
    }

    public abstract void popBackStack();

    public abstract void popBackStack(int arg1, int arg2);

    public abstract void popBackStack(String arg1, int arg2);

    public abstract boolean popBackStackImmediate();

    public abstract boolean popBackStackImmediate(int arg1, int arg2);

    public abstract boolean popBackStackImmediate(String arg1, int arg2);

    public abstract void putFragment(Bundle arg1, String arg2, Fragment arg3);

    public abstract void registerFragmentLifecycleCallbacks(FragmentLifecycleCallbacks arg1, boolean arg2);

    public abstract void removeOnBackStackChangedListener(OnBackStackChangedListener arg1);

    public abstract SavedState saveFragmentInstanceState(Fragment arg1);

    public void setFragmentFactory(FragmentFactory fragmentFactory0) {
        this.mFragmentFactory = fragmentFactory0;
    }

    public abstract void unregisterFragmentLifecycleCallbacks(FragmentLifecycleCallbacks arg1);
}

