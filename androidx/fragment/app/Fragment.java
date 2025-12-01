package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnCreateContextMenuListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.SharedElementCallback;
import androidx.core.util.DebugUtils;
import androidx.core.view.LayoutInflaterCompat;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {
    static class AnimationInfo {
        Boolean mAllowEnterTransitionOverlap;
        Boolean mAllowReturnTransitionOverlap;
        View mAnimatingAway;
        Animator mAnimator;
        Object mEnterTransition;
        SharedElementCallback mEnterTransitionCallback;
        boolean mEnterTransitionPostponed;
        Object mExitTransition;
        SharedElementCallback mExitTransitionCallback;
        boolean mIsHideReplaced;
        int mNextAnim;
        int mNextTransition;
        int mNextTransitionStyle;
        Object mReenterTransition;
        Object mReturnTransition;
        Object mSharedElementEnterTransition;
        Object mSharedElementReturnTransition;
        OnStartEnterTransitionListener mStartEnterTransitionListener;
        int mStateAfterAnimating;

        AnimationInfo() {
            this.mEnterTransition = null;
            this.mReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
            this.mExitTransition = null;
            this.mReenterTransition = Fragment.USE_DEFAULT_TRANSITION;
            this.mSharedElementEnterTransition = null;
            this.mSharedElementReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
            this.mEnterTransitionCallback = null;
            this.mExitTransitionCallback = null;
        }
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String s, Exception exception0) {
            super(s, exception0);
        }
    }

    interface OnStartEnterTransitionListener {
        void onStartEnterTransition();

        void startListening();
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        final Bundle mState;

        static {
            SavedState.CREATOR = new Parcelable.ClassLoaderCreator() {
                public SavedState createFromParcel(Parcel parcel0) {
                    return new SavedState(parcel0, null);
                }

                public SavedState createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                    return new SavedState(parcel0, classLoader0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.createFromParcel(parcel0);
                }

                @Override  // android.os.Parcelable$ClassLoaderCreator
                public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                    return this.createFromParcel(parcel0, classLoader0);
                }

                public SavedState[] newArray(int v) {
                    return new SavedState[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.newArray(v);
                }
            };
        }

        SavedState(Bundle bundle0) {
            this.mState = bundle0;
        }

        SavedState(Parcel parcel0, ClassLoader classLoader0) {
            Bundle bundle0 = parcel0.readBundle();
            this.mState = bundle0;
            if(classLoader0 != null && bundle0 != null) {
                bundle0.setClassLoader(classLoader0);
            }
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeBundle(this.mState);
        }
    }

    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 4;
    static final int STARTED = 3;
    static final Object USE_DEFAULT_TRANSITION;
    boolean mAdded;
    AnimationInfo mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    FragmentManagerImpl mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManagerImpl mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    FragmentHostCallback mHost;
    boolean mInLayout;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    State mMaxState;
    boolean mMenuVisible;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    SavedStateRegistryController mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    SparseArray mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    FragmentViewLifecycleOwner mViewLifecycleOwner;
    MutableLiveData mViewLifecycleOwnerLiveData;
    String mWho;

    static {
        Fragment.USE_DEFAULT_TRANSITION = new Object();
    }

    public Fragment() {
        this.mState = 0;
        this.mWho = "eaf53982-7a8d-4ba9-b4f8-0bd1b2d75a92";
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = () -> {
            if(Fragment.this.mFragmentManager != null && Fragment.this.mFragmentManager.mHost != null) {
                if(Looper.myLooper() != Fragment.this.mFragmentManager.mHost.getHandler().getLooper()) {
                    Fragment.this.mFragmentManager.mHost.getHandler().postAtFrontOfQueue(() -> {
                        AnimationInfo fragment$AnimationInfo0 = Fragment.this.mAnimationInfo;
                        OnStartEnterTransitionListener fragment$OnStartEnterTransitionListener0 = null;
                        if(fragment$AnimationInfo0 != null) {
                            fragment$AnimationInfo0.mEnterTransitionPostponed = false;
                            OnStartEnterTransitionListener fragment$OnStartEnterTransitionListener1 = Fragment.this.mAnimationInfo.mStartEnterTransitionListener;
                            Fragment.this.mAnimationInfo.mStartEnterTransitionListener = null;
                            fragment$OnStartEnterTransitionListener0 = fragment$OnStartEnterTransitionListener1;
                        }
                        if(fragment$OnStartEnterTransitionListener0 != null) {
                            fragment$OnStartEnterTransitionListener0.onStartEnterTransition();
                        }
                    });
                    return;
                }
                Fragment.this.callStartTransitionListener();
                return;
            }
            Fragment.this.ensureAnimationInfo().mEnterTransitionPostponed = false;

            class androidx.fragment.app.Fragment.3 implements Runnable {
                @Override
                public void run() {
                    Fragment.this.callStartTransitionListener();
                }
            }

        };
        this.mMaxState = State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData();
        this.initLifecycle();
    }

    public Fragment(int v) {
        this.mContentLayoutId = v;
    }

    // 检测为 Lambda 实现
    void callStartTransitionListener() [...]

    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print(s);
        printWriter0.print("mFragmentId=#");
        printWriter0.print(Integer.toHexString(this.mFragmentId));
        printWriter0.print(" mContainerId=#");
        printWriter0.print(Integer.toHexString(this.mContainerId));
        printWriter0.print(" mTag=");
        printWriter0.println(this.mTag);
        printWriter0.print(s);
        printWriter0.print("mState=");
        printWriter0.print(this.mState);
        printWriter0.print(" mWho=");
        printWriter0.print(this.mWho);
        printWriter0.print(" mBackStackNesting=");
        printWriter0.println(this.mBackStackNesting);
        printWriter0.print(s);
        printWriter0.print("mAdded=");
        printWriter0.print(this.mAdded);
        printWriter0.print(" mRemoving=");
        printWriter0.print(this.mRemoving);
        printWriter0.print(" mFromLayout=");
        printWriter0.print(this.mFromLayout);
        printWriter0.print(" mInLayout=");
        printWriter0.println(this.mInLayout);
        printWriter0.print(s);
        printWriter0.print("mHidden=");
        printWriter0.print(this.mHidden);
        printWriter0.print(" mDetached=");
        printWriter0.print(this.mDetached);
        printWriter0.print(" mMenuVisible=");
        printWriter0.print(this.mMenuVisible);
        printWriter0.print(" mHasMenu=");
        printWriter0.println(this.mHasMenu);
        printWriter0.print(s);
        printWriter0.print("mRetainInstance=");
        printWriter0.print(this.mRetainInstance);
        printWriter0.print(" mUserVisibleHint=");
        printWriter0.println(this.mUserVisibleHint);
        if(this.mFragmentManager != null) {
            printWriter0.print(s);
            printWriter0.print("mFragmentManager=");
            printWriter0.println(this.mFragmentManager);
        }
        if(this.mHost != null) {
            printWriter0.print(s);
            printWriter0.print("mHost=");
            printWriter0.println(this.mHost);
        }
        if(this.mParentFragment != null) {
            printWriter0.print(s);
            printWriter0.print("mParentFragment=");
            printWriter0.println(this.mParentFragment);
        }
        if(this.mArguments != null) {
            printWriter0.print(s);
            printWriter0.print("mArguments=");
            printWriter0.println(this.mArguments);
        }
        if(this.mSavedFragmentState != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedFragmentState=");
            printWriter0.println(this.mSavedFragmentState);
        }
        if(this.mSavedViewState != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedViewState=");
            printWriter0.println(this.mSavedViewState);
        }
        Fragment fragment0 = this.getTargetFragment();
        if(fragment0 != null) {
            printWriter0.print(s);
            printWriter0.print("mTarget=");
            printWriter0.print(fragment0);
            printWriter0.print(" mTargetRequestCode=");
            printWriter0.println(this.mTargetRequestCode);
        }
        if(this.getNextAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("mNextAnim=");
            printWriter0.println(this.getNextAnim());
        }
        if(this.mContainer != null) {
            printWriter0.print(s);
            printWriter0.print("mContainer=");
            printWriter0.println(this.mContainer);
        }
        if(this.mView != null) {
            printWriter0.print(s);
            printWriter0.print("mView=");
            printWriter0.println(this.mView);
        }
        if(this.mInnerView != null) {
            printWriter0.print(s);
            printWriter0.print("mInnerView=");
            printWriter0.println(this.mView);
        }
        if(this.getAnimatingAway() != null) {
            printWriter0.print(s);
            printWriter0.print("mAnimatingAway=");
            printWriter0.println(this.getAnimatingAway());
            printWriter0.print(s);
            printWriter0.print("mStateAfterAnimating=");
            printWriter0.println(this.getStateAfterAnimating());
        }
        if(this.getContext() != null) {
            LoaderManager.getInstance(this).dump(s, fileDescriptor0, printWriter0, arr_s);
        }
        printWriter0.print(s);
        printWriter0.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.dump(s + "  ", fileDescriptor0, printWriter0, arr_s);
    }

    private AnimationInfo ensureAnimationInfo() {
        if(this.mAnimationInfo == null) {
            this.mAnimationInfo = new AnimationInfo();
        }
        return this.mAnimationInfo;
    }

    @Override
    public final boolean equals(Object object0) {
        return super.equals(object0);
    }

    // 去混淆评级： 低(20)
    Fragment findFragmentByWho(String s) {
        return s.equals(this.mWho) ? this : this.mChildFragmentManager.findFragmentByWho(s);
    }

    public final FragmentActivity getActivity() {
        return this.mHost == null ? null : ((FragmentActivity)this.mHost.getActivity());
    }

    public boolean getAllowEnterTransitionOverlap() {
        return this.mAnimationInfo == null || this.mAnimationInfo.mAllowEnterTransitionOverlap == null ? true : this.mAnimationInfo.mAllowEnterTransitionOverlap.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        return this.mAnimationInfo == null || this.mAnimationInfo.mAllowReturnTransitionOverlap == null ? true : this.mAnimationInfo.mAllowReturnTransitionOverlap.booleanValue();
    }

    View getAnimatingAway() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.mAnimatingAway;
    }

    Animator getAnimator() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.mAnimator;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
        }
        return this.mChildFragmentManager;
    }

    public Context getContext() {
        return this.mHost == null ? null : this.mHost.getContext();
    }

    public Object getEnterTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.mEnterTransition;
    }

    SharedElementCallback getEnterTransitionCallback() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.mEnterTransitionCallback;
    }

    public Object getExitTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.mExitTransition;
    }

    SharedElementCallback getExitTransitionCallback() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.mExitTransitionCallback;
    }

    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        return this.mHost == null ? null : this.mHost.onGetHost();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.mLayoutInflater == null ? this.performGetLayoutInflater(null) : this.mLayoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle0) {
        FragmentHostCallback fragmentHostCallback0 = this.mHost;
        if(fragmentHostCallback0 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflater0 = fragmentHostCallback0.onGetLayoutInflater();
        LayoutInflaterCompat.setFactory2(layoutInflater0, this.mChildFragmentManager);
        return layoutInflater0;
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public LoaderManager getLoaderManager() {
        return LoaderManager.getInstance(this);
    }

    int getNextAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.mNextAnim;
    }

    int getNextTransition() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.mNextTransition;
    }

    int getNextTransitionStyle() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.mNextTransitionStyle;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public Object getReenterTransition() {
        AnimationInfo fragment$AnimationInfo0 = this.mAnimationInfo;
        if(fragment$AnimationInfo0 == null) {
            return null;
        }
        return fragment$AnimationInfo0.mReenterTransition == Fragment.USE_DEFAULT_TRANSITION ? this.getExitTransition() : this.mAnimationInfo.mReenterTransition;
    }

    public final Resources getResources() {
        return this.requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        AnimationInfo fragment$AnimationInfo0 = this.mAnimationInfo;
        if(fragment$AnimationInfo0 == null) {
            return null;
        }
        return fragment$AnimationInfo0.mReturnTransition == Fragment.USE_DEFAULT_TRANSITION ? this.getEnterTransition() : this.mAnimationInfo.mReturnTransition;
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    public Object getSharedElementEnterTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.mSharedElementEnterTransition;
    }

    public Object getSharedElementReturnTransition() {
        AnimationInfo fragment$AnimationInfo0 = this.mAnimationInfo;
        if(fragment$AnimationInfo0 == null) {
            return null;
        }
        return fragment$AnimationInfo0.mSharedElementReturnTransition == Fragment.USE_DEFAULT_TRANSITION ? this.getSharedElementEnterTransition() : this.mAnimationInfo.mSharedElementReturnTransition;
    }

    int getStateAfterAnimating() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.mStateAfterAnimating;
    }

    public final String getString(int v) {
        return this.getResources().getString(v);
    }

    public final String getString(int v, Object[] arr_object) {
        return this.getResources().getString(v, arr_object);
    }

    public final String getTag() {
        return this.mTag;
    }

    public final Fragment getTargetFragment() {
        Fragment fragment0 = this.mTarget;
        if(fragment0 != null) {
            return fragment0;
        }
        return this.mFragmentManager == null || this.mTargetWho == null ? null : ((Fragment)this.mFragmentManager.mActive.get(this.mTargetWho));
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int v) {
        return this.getResources().getText(v);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        LifecycleOwner lifecycleOwner0 = this.mViewLifecycleOwner;
        if(lifecycleOwner0 == null) {
            throw new IllegalStateException("Can\'t access the Fragment View\'s LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        return lifecycleOwner0;
    }

    public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override  // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        FragmentManagerImpl fragmentManagerImpl0 = this.mFragmentManager;
        if(fragmentManagerImpl0 == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        }
        return fragmentManagerImpl0.getViewModelStore(this);
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = SavedStateRegistryController.create(this);
        this.mLifecycleRegistry.addObserver(new LifecycleEventObserver() {
            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
                if(lifecycle$Event0 == Event.ON_STOP && Fragment.this.mView != null) {
                    Fragment.this.mView.cancelPendingInputEvents();
                }
            }
        });
    }

    void initState() {
        this.initLifecycle();
        this.mWho = "5255ab98-6ace-4906-8e05-8c0cea4cd184";
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    @Deprecated
    public static Fragment instantiate(Context context0, String s) {
        return Fragment.instantiate(context0, s, null);
    }

    @Deprecated
    public static Fragment instantiate(Context context0, String s, Bundle bundle0) {
        try {
            Fragment fragment0 = (Fragment)FragmentFactory.loadFragmentClass(context0.getClassLoader(), s).getConstructor().newInstance();
            if(bundle0 != null) {
                bundle0.setClassLoader(fragment0.getClass().getClassLoader());
                fragment0.setArguments(bundle0);
            }
            return fragment0;
        }
        catch(java.lang.InstantiationException instantiationException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", illegalAccessException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": could not find Fragment constructor", noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": calling Fragment constructor caused an exception", invocationTargetException0);
        }
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    boolean isHideReplaced() {
        return this.mAnimationInfo == null ? false : this.mAnimationInfo.mIsHideReplaced;
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    boolean isPostponed() {
        return this.mAnimationInfo == null ? false : this.mAnimationInfo.mEnterTransitionPostponed;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 4;
    }

    public final boolean isStateSaved() {
        return this.mFragmentManager == null ? false : this.mFragmentManager.isStateSaved();
    }

    // 去混淆评级： 低(20)
    public final boolean isVisible() {
        return this.isAdded() && !this.isHidden() && (this.mView != null && this.mView.getWindowToken() != null && this.mView.getVisibility() == 0);
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    public void onActivityCreated(Bundle bundle0) {
        this.mCalled = true;
    }

    public void onActivityResult(int v, int v1, Intent intent0) {
    }

    @Deprecated
    public void onAttach(Activity activity0) {
        this.mCalled = true;
    }

    public void onAttach(Context context0) {
        this.mCalled = true;
        Activity activity0 = this.mHost == null ? null : this.mHost.getActivity();
        if(activity0 != null) {
            this.mCalled = false;
            this.onAttach(activity0);
        }
    }

    public void onAttachFragment(Fragment fragment0) {
    }

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration0) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem0) [...] // Inlined contents

    public void onCreate(Bundle bundle0) {
        this.mCalled = true;
        this.restoreChildFragmentState(bundle0);
        if(!this.mChildFragmentManager.isStateAtLeast(1)) {
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    public Animation onCreateAnimation(int v, boolean z, int v1) [...] // Inlined contents

    public Animator onCreateAnimator(int v, boolean z, int v1) [...] // Inlined contents

    @Override  // android.view.View$OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu0, View view0, ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        this.requireActivity().onCreateContextMenu(contextMenu0, view0, contextMenu$ContextMenuInfo0);
    }

    public void onCreateOptionsMenu(Menu menu0, MenuInflater menuInflater0) {
    }

    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        return this.mContentLayoutId == 0 ? null : layoutInflater0.inflate(this.mContentLayoutId, viewGroup0, false);
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        return this.getLayoutInflater(bundle0);
    }

    public void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public void onInflate(Activity activity0, AttributeSet attributeSet0, Bundle bundle0) {
        this.mCalled = true;
    }

    public void onInflate(Context context0, AttributeSet attributeSet0, Bundle bundle0) {
        this.mCalled = true;
        Activity activity0 = this.mHost == null ? null : this.mHost.getActivity();
        if(activity0 != null) {
            this.mCalled = false;
            this.onInflate(activity0, attributeSet0, bundle0);
        }
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem0) [...] // Inlined contents

    public void onOptionsMenuClosed(Menu menu0) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu0) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle0) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view0, Bundle bundle0) {
    }

    public void onViewStateRestored(Bundle bundle0) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle0) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 2;
        this.mCalled = false;
        this.onActivityCreated(bundle0);
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    void performAttach() {
        this.mChildFragmentManager.attachController(this.mHost, new FragmentContainer() {
            @Override  // androidx.fragment.app.FragmentContainer
            public View onFindViewById(int v) {
                if(Fragment.this.mView == null) {
                    throw new IllegalStateException("Fragment " + this + " does not have a view");
                }
                return Fragment.this.mView.findViewById(v);
            }

            @Override  // androidx.fragment.app.FragmentContainer
            public boolean onHasView() {
                return Fragment.this.mView != null;
            }
        }, this);
        this.mCalled = false;
        this.onAttach(this.mHost.getContext());
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onAttach()");
    }

    void performConfigurationChanged(Configuration configuration0) {
        this.onConfigurationChanged(configuration0);
        this.mChildFragmentManager.dispatchConfigurationChanged(configuration0);
    }

    // 去混淆评级： 低(20)
    boolean performContextItemSelected(MenuItem menuItem0) {
        return !this.mHidden && this.mChildFragmentManager.dispatchContextItemSelected(menuItem0);
    }

    void performCreate(Bundle bundle0) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mSavedStateRegistryController.performRestore(bundle0);
        this.onCreate(bundle0);
        this.mIsCreated = true;
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu0, MenuInflater menuInflater0) {
        boolean z = false;
        if(!this.mHidden) {
            if(this.mHasMenu && this.mMenuVisible) {
                z = true;
            }
            return z | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu0, menuInflater0);
        }
        return false;
    }

    void performCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new FragmentViewLifecycleOwner();
        View view0 = this.onCreateView(layoutInflater0, viewGroup0, bundle0);
        this.mView = view0;
        if(view0 != null) {
            this.mViewLifecycleOwner.initialize();
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if(this.mViewLifecycleOwner.isInitialized()) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.mViewLifecycleOwner = null;
    }

    void performDestroy() {
        this.mChildFragmentManager.dispatchDestroy();
        this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        this.onDestroy();
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.dispatchDestroyView();
        if(this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        this.onDestroyView();
        if(!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        LoaderManager.getInstance(this).markForRedelivery();
        this.mPerformedCreateView = false;
    }

    void performDetach() {
        this.mCalled = false;
        this.onDetach();
        this.mLayoutInflater = null;
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = this.onGetLayoutInflater(bundle0);
        this.mLayoutInflater = layoutInflater0;
        return layoutInflater0;
    }

    void performLowMemory() {
        this.onLowMemory();
        this.mChildFragmentManager.dispatchLowMemory();
    }

    void performMultiWindowModeChanged(boolean z) {
        this.mChildFragmentManager.dispatchMultiWindowModeChanged(z);
    }

    // 去混淆评级： 低(20)
    boolean performOptionsItemSelected(MenuItem menuItem0) {
        return !this.mHidden && this.mChildFragmentManager.dispatchOptionsItemSelected(menuItem0);
    }

    void performOptionsMenuClosed(Menu menu0) {
        if(!this.mHidden) {
            this.mChildFragmentManager.dispatchOptionsMenuClosed(menu0);
        }
    }

    void performPause() {
        this.mChildFragmentManager.dispatchPause();
        if(this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_PAUSE);
        this.mState = 3;
        this.mCalled = false;
        this.onPause();
        if(!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void performPictureInPictureModeChanged(boolean z) {
        this.mChildFragmentManager.dispatchPictureInPictureModeChanged(z);
    }

    boolean performPrepareOptionsMenu(Menu menu0) {
        boolean z = false;
        if(!this.mHidden) {
            if(this.mHasMenu && this.mMenuVisible) {
                z = true;
            }
            return z | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu0);
        }
        return false;
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean z = this.mFragmentManager.isPrimaryNavigation(this);
        if(this.mIsPrimaryNavigationFragment == null || this.mIsPrimaryNavigationFragment.booleanValue() != z) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(z);
            this.mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
        }
    }

    void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions();
        this.mState = 4;
        this.mCalled = false;
        this.onResume();
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
    }

    void performSaveInstanceState(Bundle bundle0) {
        this.onSaveInstanceState(bundle0);
        this.mSavedStateRegistryController.performSave(bundle0);
        Parcelable parcelable0 = this.mChildFragmentManager.saveAllState();
        if(parcelable0 != null) {
            bundle0.putParcelable("android:support:fragments", parcelable0);
        }
    }

    void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions();
        this.mState = 3;
        this.mCalled = false;
        this.onStart();
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
    }

    void performStop() {
        this.mChildFragmentManager.dispatchStop();
        if(this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_STOP);
        this.mState = 2;
        this.mCalled = false;
        this.onStop();
        if(!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void postponeEnterTransition() {
        this.ensureAnimationInfo().mEnterTransitionPostponed = true;
    }

    public final void postponeEnterTransition(long v, TimeUnit timeUnit0) {
        this.ensureAnimationInfo().mEnterTransitionPostponed = true;
        FragmentManagerImpl fragmentManagerImpl0 = this.mFragmentManager;
        Handler handler0 = fragmentManagerImpl0 == null ? new Handler(Looper.getMainLooper()) : fragmentManagerImpl0.mHost.getHandler();
        handler0.removeCallbacks(this.mPostponedDurationRunnable);
        handler0.postDelayed(this.mPostponedDurationRunnable, timeUnit0.toMillis(v));
    }

    public void registerForContextMenu(View view0) {
        view0.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(String[] arr_s, int v) {
        FragmentHostCallback fragmentHostCallback0 = this.mHost;
        if(fragmentHostCallback0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        fragmentHostCallback0.onRequestPermissionsFromFragment(this, arr_s, v);
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
        }
        return fragmentActivity0;
    }

    public final Bundle requireArguments() {
        Bundle bundle0 = this.getArguments();
        if(bundle0 == null) {
            throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
        }
        return bundle0;
    }

    public final Context requireContext() {
        Context context0 = this.getContext();
        if(context0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to a context.");
        }
        return context0;
    }

    public final FragmentManager requireFragmentManager() {
        FragmentManager fragmentManager0 = this.getFragmentManager();
        if(fragmentManager0 == null) {
            throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
        }
        return fragmentManager0;
    }

    public final Object requireHost() {
        Object object0 = this.getHost();
        if(object0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to a host.");
        }
        return object0;
    }

    public final Fragment requireParentFragment() {
        Fragment fragment0 = this.getParentFragment();
        if(fragment0 == null) {
            throw this.getContext() == null ? new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host") : new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + this.getContext());
        }
        return fragment0;
    }

    public final View requireView() {
        View view0 = this.getView();
        if(view0 == null) {
            throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
        return view0;
    }

    void restoreChildFragmentState(Bundle bundle0) {
        if(bundle0 != null) {
            Parcelable parcelable0 = bundle0.getParcelable("android:support:fragments");
            if(parcelable0 != null) {
                this.mChildFragmentManager.restoreSaveState(parcelable0);
                this.mChildFragmentManager.dispatchCreate();
            }
        }
    }

    final void restoreViewState(Bundle bundle0) {
        SparseArray sparseArray0 = this.mSavedViewState;
        if(sparseArray0 != null) {
            this.mInnerView.restoreHierarchyState(sparseArray0);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        this.onViewStateRestored(bundle0);
        if(!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
        if(this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        this.ensureAnimationInfo().mAllowEnterTransitionOverlap = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        this.ensureAnimationInfo().mAllowReturnTransitionOverlap = Boolean.valueOf(z);
    }

    void setAnimatingAway(View view0) {
        this.ensureAnimationInfo().mAnimatingAway = view0;
    }

    void setAnimator(Animator animator0) {
        this.ensureAnimationInfo().mAnimator = animator0;
    }

    public void setArguments(Bundle bundle0) {
        if(this.mFragmentManager != null && this.isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle0;
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback0) {
        this.ensureAnimationInfo().mEnterTransitionCallback = sharedElementCallback0;
    }

    public void setEnterTransition(Object object0) {
        this.ensureAnimationInfo().mEnterTransition = object0;
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback0) {
        this.ensureAnimationInfo().mExitTransitionCallback = sharedElementCallback0;
    }

    public void setExitTransition(Object object0) {
        this.ensureAnimationInfo().mExitTransition = object0;
    }

    public void setHasOptionsMenu(boolean z) {
        if(this.mHasMenu != z) {
            this.mHasMenu = z;
            if(this.isAdded() && !this.isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    void setHideReplaced(boolean z) {
        this.ensureAnimationInfo().mIsHideReplaced = z;
    }

    public void setInitialSavedState(SavedState fragment$SavedState0) {
        if(this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        this.mSavedFragmentState = fragment$SavedState0 == null || fragment$SavedState0.mState == null ? null : fragment$SavedState0.mState;
    }

    public void setMenuVisibility(boolean z) {
        if(this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if(this.mHasMenu && this.isAdded() && !this.isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    void setNextAnim(int v) {
        if(this.mAnimationInfo == null && v == 0) {
            return;
        }
        this.ensureAnimationInfo().mNextAnim = v;
    }

    void setNextTransition(int v, int v1) {
        if(this.mAnimationInfo == null && v == 0 && v1 == 0) {
            return;
        }
        this.ensureAnimationInfo();
        this.mAnimationInfo.mNextTransition = v;
        this.mAnimationInfo.mNextTransitionStyle = v1;
    }

    void setOnStartEnterTransitionListener(OnStartEnterTransitionListener fragment$OnStartEnterTransitionListener0) {
        this.ensureAnimationInfo();
        if(fragment$OnStartEnterTransitionListener0 == this.mAnimationInfo.mStartEnterTransitionListener) {
            return;
        }
        if(fragment$OnStartEnterTransitionListener0 != null && this.mAnimationInfo.mStartEnterTransitionListener != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if(this.mAnimationInfo.mEnterTransitionPostponed) {
            this.mAnimationInfo.mStartEnterTransitionListener = fragment$OnStartEnterTransitionListener0;
        }
        if(fragment$OnStartEnterTransitionListener0 != null) {
            fragment$OnStartEnterTransitionListener0.startListening();
        }
    }

    public void setReenterTransition(Object object0) {
        this.ensureAnimationInfo().mReenterTransition = object0;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManagerImpl fragmentManagerImpl0 = this.mFragmentManager;
        if(fragmentManagerImpl0 != null) {
            if(z) {
                fragmentManagerImpl0.addRetainedFragment(this);
                return;
            }
            fragmentManagerImpl0.removeRetainedFragment(this);
            return;
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object object0) {
        this.ensureAnimationInfo().mReturnTransition = object0;
    }

    public void setSharedElementEnterTransition(Object object0) {
        this.ensureAnimationInfo().mSharedElementEnterTransition = object0;
    }

    public void setSharedElementReturnTransition(Object object0) {
        this.ensureAnimationInfo().mSharedElementReturnTransition = object0;
    }

    void setStateAfterAnimating(int v) {
        this.ensureAnimationInfo().mStateAfterAnimating = v;
    }

    public void setTargetFragment(Fragment fragment0, int v) {
        FragmentManager fragmentManager0 = this.getFragmentManager();
        FragmentManager fragmentManager1 = fragment0 == null ? null : fragment0.getFragmentManager();
        if(fragmentManager0 != null && fragmentManager1 != null && fragmentManager0 != fragmentManager1) {
            throw new IllegalArgumentException("Fragment " + fragment0 + " must share the same FragmentManager to be set as a target fragment");
        }
        for(Fragment fragment1 = fragment0; fragment1 != null; fragment1 = fragment1.getTargetFragment()) {
            if(fragment1 == this) {
                throw new IllegalArgumentException("Setting " + fragment0 + " as the target of " + this + " would create a target cycle");
            }
        }
        if(fragment0 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        }
        else if(this.mFragmentManager == null || fragment0.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment0;
        }
        else {
            this.mTargetWho = fragment0.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = v;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if(!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && this.isAdded() && this.mIsCreated) {
            this.mFragmentManager.performPendingDeferredStart(this);
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 3 && !z;
        if(this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String s) {
        return this.mHost == null ? false : this.mHost.onShouldShowRequestPermissionRationale(s);
    }

    public void startActivity(Intent intent0) {
        this.startActivity(intent0, null);
    }

    public void startActivity(Intent intent0, Bundle bundle0) {
        FragmentHostCallback fragmentHostCallback0 = this.mHost;
        if(fragmentHostCallback0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        fragmentHostCallback0.onStartActivityFromFragment(this, intent0, -1, bundle0);
    }

    public void startActivityForResult(Intent intent0, int v) {
        this.startActivityForResult(intent0, v, null);
    }

    public void startActivityForResult(Intent intent0, int v, Bundle bundle0) {
        FragmentHostCallback fragmentHostCallback0 = this.mHost;
        if(fragmentHostCallback0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        fragmentHostCallback0.onStartActivityFromFragment(this, intent0, v, bundle0);
    }

    public void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) throws IntentSender.SendIntentException {
        FragmentHostCallback fragmentHostCallback0 = this.mHost;
        if(fragmentHostCallback0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        fragmentHostCallback0.onStartIntentSenderFromFragment(this, intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    // 检测为 Lambda 实现
    public void startPostponedEnterTransition() [...]

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        DebugUtils.buildShortClassTag(this, stringBuilder0);
        stringBuilder0.append(" (");
        stringBuilder0.append(this.mWho);
        stringBuilder0.append(")");
        if(this.mFragmentId != 0) {
            stringBuilder0.append(" id=0x");
            stringBuilder0.append(Integer.toHexString(this.mFragmentId));
        }
        if(this.mTag != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.mTag);
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public void unregisterForContextMenu(View view0) {
        view0.setOnCreateContextMenuListener(null);
    }

    class androidx.fragment.app.Fragment.1 implements Runnable {
        @Override
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

}

