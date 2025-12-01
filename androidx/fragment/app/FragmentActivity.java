package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.collection.SparseArrayCompat;
import androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback;
import androidx.core.app.ActivityCompat.PermissionCompatDelegate;
import androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends ComponentActivity implements OnRequestPermissionsResultCallback, RequestPermissionsRequestCodeValidator {
    class HostCallbacks extends FragmentHostCallback implements OnBackPressedDispatcherOwner, ViewModelStoreOwner {
        @Override  // androidx.lifecycle.LifecycleOwner
        public Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override  // androidx.activity.OnBackPressedDispatcherOwner
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override  // androidx.lifecycle.ViewModelStoreOwner
        public ViewModelStore getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public void onAttachFragment(Fragment fragment0) {
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public void onDump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
            FragmentActivity.this.dump(s, fileDescriptor0, printWriter0, arr_s);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public View onFindViewById(int v) {
            return FragmentActivity.this.findViewById(v);
        }

        public FragmentActivity onGetHost() {
            return FragmentActivity.this;
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public Object onGetHost() {
            return this.onGetHost();
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public LayoutInflater onGetLayoutInflater() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public int onGetWindowAnimations() {
            Window window0 = FragmentActivity.this.getWindow();
            return window0 == null ? 0 : window0.getAttributes().windowAnimations;
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public boolean onHasView() {
            Window window0 = FragmentActivity.this.getWindow();
            return window0 != null && window0.peekDecorView() != null;
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public boolean onHasWindowAnimations() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public void onRequestPermissionsFromFragment(Fragment fragment0, String[] arr_s, int v) {
            FragmentActivity.this.requestPermissionsFromFragment(fragment0, arr_s, v);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldSaveFragmentState(Fragment fragment0) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldShowRequestPermissionRationale(String s) {
            return ActivityCompat.shouldShowRequestPermissionRationale(FragmentActivity.this, s);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public void onStartActivityFromFragment(Fragment fragment0, Intent intent0, int v) {
            FragmentActivity.this.startActivityFromFragment(fragment0, intent0, v);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public void onStartActivityFromFragment(Fragment fragment0, Intent intent0, int v, Bundle bundle0) {
            FragmentActivity.this.startActivityFromFragment(fragment0, intent0, v, bundle0);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public void onStartIntentSenderFromFragment(Fragment fragment0, IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) throws IntentSender.SendIntentException {
            FragmentActivity.this.startIntentSenderFromFragment(fragment0, intentSender0, v, intent0, v1, v2, v3, bundle0);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public void onSupportInvalidateOptionsMenu() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }
    }

    static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
    static final String FRAGMENTS_TAG = "android:support:fragments";
    static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 0xFFFE;
    static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
    static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
    private static final String TAG = "FragmentActivity";
    boolean mCreated;
    final LifecycleRegistry mFragmentLifecycleRegistry;
    final FragmentController mFragments;
    int mNextCandidateRequestIndex;
    SparseArrayCompat mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped;

    public FragmentActivity() {
        this.mFragments = FragmentController.createController(new HostCallbacks(this));
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
    }

    public FragmentActivity(int v) {
        super(v);
        this.mFragments = FragmentController.createController(new HostCallbacks(this));
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
    }

    private int allocateRequestIndex(Fragment fragment0) {
        if(this.mPendingFragmentActivityResults.size() >= 0xFFFE) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while(this.mPendingFragmentActivityResults.indexOfKey(this.mNextCandidateRequestIndex) >= 0) {
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 0xFFFE;
        }
        int v = this.mNextCandidateRequestIndex;
        this.mPendingFragmentActivityResults.put(v, fragment0.mWho);
        this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 0xFFFE;
        return v;
    }

    static void checkForValidRequestCode(int v) {
        if((v & 0xFFFF0000) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    final View dispatchFragmentsOnCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        return this.mFragments.onCreateView(view0, s, context0, attributeSet0);
    }

    @Override  // android.app.Activity
    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        printWriter0.print(s);
        printWriter0.print("Local FragmentActivity ");
        printWriter0.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter0.println(" State:");
        printWriter0.print(s + "  ");
        printWriter0.print("mCreated=");
        printWriter0.print(this.mCreated);
        printWriter0.print(" mResumed=");
        printWriter0.print(this.mResumed);
        printWriter0.print(" mStopped=");
        printWriter0.print(this.mStopped);
        if(this.getApplication() != null) {
            LoaderManager.getInstance(this).dump(s + "  ", fileDescriptor0, printWriter0, arr_s);
        }
        this.mFragments.getSupportFragmentManager().dump(s, fileDescriptor0, printWriter0, arr_s);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.getSupportFragmentManager();
    }

    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.getInstance(this);
    }

    private void markFragmentsCreated() {
        while(FragmentActivity.markState(this.getSupportFragmentManager(), State.CREATED)) {
        }
    }

    private static boolean markState(FragmentManager fragmentManager0, State lifecycle$State0) {
        boolean z = false;
        for(Object object0: fragmentManager0.getFragments()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                if(fragment0.getLifecycle().getCurrentState().isAtLeast(State.STARTED)) {
                    fragment0.mLifecycleRegistry.setCurrentState(lifecycle$State0);
                    z = true;
                }
                if(fragment0.getHost() != null) {
                    z |= FragmentActivity.markState(fragment0.getChildFragmentManager(), lifecycle$State0);
                }
            }
        }
        return z;
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onActivityResult(int v, int v1, Intent intent0) {
        this.mFragments.noteStateNotSaved();
        if(v >> 16 != 0) {
            int v2 = (v >> 16) - 1;
            String s = (String)this.mPendingFragmentActivityResults.get(v2);
            this.mPendingFragmentActivityResults.remove(v2);
            if(s == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragment0 = this.mFragments.findFragmentByWho(s);
            if(fragment0 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + s);
                return;
            }
            fragment0.onActivityResult(v & 0xFFFF, v1, intent0);
            return;
        }
        PermissionCompatDelegate activityCompat$PermissionCompatDelegate0 = ActivityCompat.getPermissionCompatDelegate();
        if(activityCompat$PermissionCompatDelegate0 != null && activityCompat$PermissionCompatDelegate0.onActivityResult(this, v, v1, intent0)) {
            return;
        }
        super.onActivityResult(v, v1, intent0);
    }

    public void onAttachFragment(Fragment fragment0) {
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.mFragments.noteStateNotSaved();
        this.mFragments.dispatchConfigurationChanged(configuration0);
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onCreate(Bundle bundle0) {
        this.mFragments.attachHost(null);
        if(bundle0 != null) {
            Parcelable parcelable0 = bundle0.getParcelable("android:support:fragments");
            this.mFragments.restoreSaveState(parcelable0);
            if(bundle0.containsKey("android:support:next_request_index")) {
                this.mNextCandidateRequestIndex = bundle0.getInt("android:support:next_request_index");
                int[] arr_v = bundle0.getIntArray("android:support:request_indicies");
                String[] arr_s = bundle0.getStringArray("android:support:request_fragment_who");
                if(arr_v == null || arr_s == null || arr_v.length != arr_s.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                }
                else {
                    this.mPendingFragmentActivityResults = new SparseArrayCompat(arr_v.length);
                    for(int v = 0; v < arr_v.length; ++v) {
                        this.mPendingFragmentActivityResults.put(arr_v[v], arr_s[v]);
                    }
                }
            }
        }
        if(this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new SparseArrayCompat();
            this.mNextCandidateRequestIndex = 0;
        }
        super.onCreate(bundle0);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_CREATE);
        this.mFragments.dispatchCreate();
    }

    @Override  // android.app.Activity
    public boolean onCreatePanelMenu(int v, Menu menu0) {
        if(v == 0) {
            boolean z = super.onCreatePanelMenu(0, menu0);
            MenuInflater menuInflater0 = this.getMenuInflater();
            return z | this.mFragments.dispatchCreateOptionsMenu(menu0, menuInflater0);
        }
        return super.onCreatePanelMenu(v, menu0);
    }

    @Override  // android.app.Activity
    public View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        View view1 = this.dispatchFragmentsOnCreateView(view0, s, context0, attributeSet0);
        return view1 == null ? super.onCreateView(view0, s, context0, attributeSet0) : view1;
    }

    @Override  // android.app.Activity
    public View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        View view0 = this.dispatchFragmentsOnCreateView(null, s, context0, attributeSet0);
        return view0 == null ? super.onCreateView(s, context0, attributeSet0) : view0;
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.dispatchDestroy();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_DESTROY);
    }

    @Override  // android.app.Activity
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.dispatchLowMemory();
    }

    @Override  // android.app.Activity
    public boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        switch(v) {
            case 0: {
                return this.mFragments.dispatchOptionsItemSelected(menuItem0);
            }
            case 6: {
                return this.mFragments.dispatchContextItemSelected(menuItem0);
            }
            default: {
                return false;
            }
        }
    }

    @Override  // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.dispatchMultiWindowModeChanged(z);
    }

    @Override  // android.app.Activity
    protected void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        this.mFragments.noteStateNotSaved();
    }

    @Override  // android.app.Activity
    public void onPanelClosed(int v, Menu menu0) {
        if(v == 0) {
            this.mFragments.dispatchOptionsMenuClosed(menu0);
        }
        super.onPanelClosed(v, menu0);
    }

    @Override  // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.dispatchPause();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_PAUSE);
    }

    @Override  // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.dispatchPictureInPictureModeChanged(z);
    }

    @Override  // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view0, Menu menu0) {
        return super.onPreparePanel(0, view0, menu0);
    }

    @Override  // android.app.Activity
    public boolean onPreparePanel(int v, View view0, Menu menu0) {
        return v == 0 ? this.onPrepareOptionsPanel(view0, menu0) | this.mFragments.dispatchPrepareOptionsMenu(menu0) : super.onPreparePanel(v, view0, menu0);
    }

    @Override  // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        this.mFragments.noteStateNotSaved();
        int v1 = v >> 16 & 0xFFFF;
        if(v1 != 0) {
            String s = (String)this.mPendingFragmentActivityResults.get(v1 - 1);
            this.mPendingFragmentActivityResults.remove(v1 - 1);
            if(s == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragment0 = this.mFragments.findFragmentByWho(s);
            if(fragment0 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + s);
                return;
            }
            fragment0.onRequestPermissionsResult(v & 0xFFFF, arr_s, arr_v);
        }
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.noteStateNotSaved();
        this.mFragments.execPendingActions();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_RESUME);
        this.mFragments.dispatchResume();
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this.markFragmentsCreated();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_STOP);
        Parcelable parcelable0 = this.mFragments.saveAllState();
        if(parcelable0 != null) {
            bundle0.putParcelable("android:support:fragments", parcelable0);
        }
        if(this.mPendingFragmentActivityResults.size() > 0) {
            bundle0.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
            int[] arr_v = new int[this.mPendingFragmentActivityResults.size()];
            String[] arr_s = new String[this.mPendingFragmentActivityResults.size()];
            for(int v = 0; v < this.mPendingFragmentActivityResults.size(); ++v) {
                arr_v[v] = this.mPendingFragmentActivityResults.keyAt(v);
                arr_s[v] = (String)this.mPendingFragmentActivityResults.valueAt(v);
            }
            bundle0.putIntArray("android:support:request_indicies", arr_v);
            bundle0.putStringArray("android:support:request_fragment_who", arr_s);
        }
    }

    @Override  // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.mStopped = false;
        if(!this.mCreated) {
            this.mCreated = true;
            this.mFragments.dispatchActivityCreated();
        }
        this.mFragments.noteStateNotSaved();
        this.mFragments.execPendingActions();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_START);
        this.mFragments.dispatchStart();
    }

    @Override  // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.noteStateNotSaved();
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        this.markFragmentsCreated();
        this.mFragments.dispatchStop();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_STOP);
    }

    void requestPermissionsFromFragment(Fragment fragment0, String[] arr_s, int v) {
        if(v == -1) {
            ActivityCompat.requestPermissions(this, arr_s, -1);
            return;
        }
        FragmentActivity.checkForValidRequestCode(v);
        try {
            this.mRequestedPermissionsFromFragment = true;
            ActivityCompat.requestPermissions(this, arr_s, (this.allocateRequestIndex(fragment0) + 1 << 16) + (v & 0xFFFF));
            this.mRequestedPermissionsFromFragment = false;
        }
        catch(Throwable throwable0) {
            this.mRequestedPermissionsFromFragment = false;
            throw throwable0;
        }
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback0) {
        ActivityCompat.setEnterSharedElementCallback(this, sharedElementCallback0);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback0) {
        ActivityCompat.setExitSharedElementCallback(this, sharedElementCallback0);
    }

    @Override  // androidx.activity.ComponentActivity
    public void startActivityForResult(Intent intent0, int v) {
        if(!this.mStartedActivityFromFragment && v != -1) {
            FragmentActivity.checkForValidRequestCode(v);
        }
        super.startActivityForResult(intent0, v);
    }

    @Override  // androidx.activity.ComponentActivity
    public void startActivityForResult(Intent intent0, int v, Bundle bundle0) {
        if(!this.mStartedActivityFromFragment && v != -1) {
            FragmentActivity.checkForValidRequestCode(v);
        }
        super.startActivityForResult(intent0, v, bundle0);
    }

    public void startActivityFromFragment(Fragment fragment0, Intent intent0, int v) {
        this.startActivityFromFragment(fragment0, intent0, v, null);
    }

    public void startActivityFromFragment(Fragment fragment0, Intent intent0, int v, Bundle bundle0) {
        try {
            this.mStartedActivityFromFragment = true;
            if(v == -1) {
                ActivityCompat.startActivityForResult(this, intent0, -1, bundle0);
                this.mStartedActivityFromFragment = false;
                return;
            }
            FragmentActivity.checkForValidRequestCode(v);
            ActivityCompat.startActivityForResult(this, intent0, (this.allocateRequestIndex(fragment0) + 1 << 16) + (v & 0xFFFF), bundle0);
            this.mStartedActivityFromFragment = false;
        }
        catch(Throwable throwable0) {
            this.mStartedActivityFromFragment = false;
            throw throwable0;
        }
    }

    @Override  // androidx.activity.ComponentActivity
    public void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3) throws IntentSender.SendIntentException {
        if(!this.mStartedIntentSenderFromFragment && v != -1) {
            FragmentActivity.checkForValidRequestCode(v);
        }
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3);
    }

    @Override  // androidx.activity.ComponentActivity
    public void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) throws IntentSender.SendIntentException {
        if(!this.mStartedIntentSenderFromFragment && v != -1) {
            FragmentActivity.checkForValidRequestCode(v);
        }
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    public void startIntentSenderFromFragment(Fragment fragment0, IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) throws IntentSender.SendIntentException {
        try {
            this.mStartedIntentSenderFromFragment = true;
            if(v == -1) {
                ActivityCompat.startIntentSenderForResult(this, intentSender0, -1, intent0, v1, v2, v3, bundle0);
                this.mStartedIntentSenderFromFragment = false;
                return;
            }
            FragmentActivity.checkForValidRequestCode(v);
            ActivityCompat.startIntentSenderForResult(this, intentSender0, (this.allocateRequestIndex(fragment0) + 1 << 16) + (v & 0xFFFF), intent0, v1, v2, v3, bundle0);
            this.mStartedIntentSenderFromFragment = false;
        }
        catch(Throwable throwable0) {
            this.mStartedIntentSenderFromFragment = false;
            throw throwable0;
        }
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.finishAfterTransition(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        this.invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.startPostponedEnterTransition(this);
    }

    @Override  // androidx.core.app.ActivityCompat$RequestPermissionsRequestCodeValidator
    public final void validateRequestPermissionsRequestCode(int v) {
        if(!this.mRequestedPermissionsFromFragment && v != -1) {
            FragmentActivity.checkForValidRequestCode(v);
        }
    }
}

