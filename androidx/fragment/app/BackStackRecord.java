package androidx.fragment.app;

import android.util.Log;
import androidx.core.util.LogWriter;
import androidx.lifecycle.Lifecycle.State;
import java.io.PrintWriter;
import java.util.ArrayList;

final class BackStackRecord extends FragmentTransaction implements BackStackEntry, OpGenerator {
    static final String TAG = "FragmentManager";
    boolean mCommitted;
    int mIndex;
    final FragmentManagerImpl mManager;

    public BackStackRecord(FragmentManagerImpl fragmentManagerImpl0) {
        this.mIndex = -1;
        this.mManager = fragmentManagerImpl0;
    }

    void bumpBackStackNesting(int v) {
        if(!this.mAddToBackStack) {
            return;
        }
        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + v);
        }
        int v1 = this.mOps.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Op fragmentTransaction$Op0 = (Op)this.mOps.get(v2);
            if(fragmentTransaction$Op0.mFragment != null) {
                fragmentTransaction$Op0.mFragment.mBackStackNesting += v;
                if(FragmentManagerImpl.DEBUG) {
                    Log.v("FragmentManager", "Bump nesting of " + fragmentTransaction$Op0.mFragment + " to " + fragmentTransaction$Op0.mFragment.mBackStackNesting);
                }
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public int commit() {
        return this.commitInternal(false);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
        return this.commitInternal(true);
    }

    int commitInternal(boolean z) {
        if(this.mCommitted) {
            throw new IllegalStateException("commit already called");
        }
        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter0 = new PrintWriter(new LogWriter("FragmentManager"));
            this.dump("  ", printWriter0);
            printWriter0.close();
        }
        this.mCommitted = true;
        this.mIndex = this.mAddToBackStack ? this.mManager.allocBackStackIndex(this) : -1;
        this.mManager.enqueueAction(this, z);
        return this.mIndex;
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
        this.disallowAddToBackStack();
        this.mManager.execSingleAction(this, false);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
        this.disallowAddToBackStack();
        this.mManager.execSingleAction(this, true);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction detach(Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment0.toString() + " is already attached to a FragmentManager.");
        }
        return super.detach(fragment0);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    void doAddOp(int v, Fragment fragment0, String s, int v1) {
        super.doAddOp(v, fragment0, s, v1);
        fragment0.mFragmentManager = this.mManager;
    }

    public void dump(String s, PrintWriter printWriter0) {
        this.dump(s, printWriter0, true);
    }

    public void dump(String s, PrintWriter printWriter0, boolean z) {
        String s1;
        if(z) {
            printWriter0.print(s);
            printWriter0.print("mName=");
            printWriter0.print(this.mName);
            printWriter0.print(" mIndex=");
            printWriter0.print(this.mIndex);
            printWriter0.print(" mCommitted=");
            printWriter0.println(this.mCommitted);
            if(this.mTransition != 0) {
                printWriter0.print(s);
                printWriter0.print("mTransition=#");
                printWriter0.print(Integer.toHexString(this.mTransition));
                printWriter0.print(" mTransitionStyle=#");
                printWriter0.println(Integer.toHexString(this.mTransitionStyle));
            }
            if(this.mEnterAnim != 0 || this.mExitAnim != 0) {
                printWriter0.print(s);
                printWriter0.print("mEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.mEnterAnim));
                printWriter0.print(" mExitAnim=#");
                printWriter0.println(Integer.toHexString(this.mExitAnim));
            }
            if(this.mPopEnterAnim != 0 || this.mPopExitAnim != 0) {
                printWriter0.print(s);
                printWriter0.print("mPopEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.mPopEnterAnim));
                printWriter0.print(" mPopExitAnim=#");
                printWriter0.println(Integer.toHexString(this.mPopExitAnim));
            }
            if(this.mBreadCrumbTitleRes != 0 || this.mBreadCrumbTitleText != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbTitleRes=#");
                printWriter0.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter0.print(" mBreadCrumbTitleText=");
                printWriter0.println(this.mBreadCrumbTitleText);
            }
            if(this.mBreadCrumbShortTitleRes != 0 || this.mBreadCrumbShortTitleText != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbShortTitleRes=#");
                printWriter0.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter0.print(" mBreadCrumbShortTitleText=");
                printWriter0.println(this.mBreadCrumbShortTitleText);
            }
        }
        if(!this.mOps.isEmpty()) {
            printWriter0.print(s);
            printWriter0.println("Operations:");
            int v = this.mOps.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Op fragmentTransaction$Op0 = (Op)this.mOps.get(v1);
                switch(fragmentTransaction$Op0.mCmd) {
                    case 0: {
                        s1 = "NULL";
                        break;
                    }
                    case 1: {
                        s1 = "ADD";
                        break;
                    }
                    case 2: {
                        s1 = "REPLACE";
                        break;
                    }
                    case 3: {
                        s1 = "REMOVE";
                        break;
                    }
                    case 4: {
                        s1 = "HIDE";
                        break;
                    }
                    case 5: {
                        s1 = "SHOW";
                        break;
                    }
                    case 6: {
                        s1 = "DETACH";
                        break;
                    }
                    case 7: {
                        s1 = "ATTACH";
                        break;
                    }
                    case 8: {
                        s1 = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 9: {
                        s1 = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 10: {
                        s1 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    default: {
                        s1 = "cmd=" + fragmentTransaction$Op0.mCmd;
                    }
                }
                printWriter0.print(s);
                printWriter0.print("  Op #");
                printWriter0.print(v1);
                printWriter0.print(": ");
                printWriter0.print(s1);
                printWriter0.print(" ");
                printWriter0.println(fragmentTransaction$Op0.mFragment);
                if(z) {
                    if(fragmentTransaction$Op0.mEnterAnim != 0 || fragmentTransaction$Op0.mExitAnim != 0) {
                        printWriter0.print(s);
                        printWriter0.print("enterAnim=#");
                        printWriter0.print(Integer.toHexString(fragmentTransaction$Op0.mEnterAnim));
                        printWriter0.print(" exitAnim=#");
                        printWriter0.println(Integer.toHexString(fragmentTransaction$Op0.mExitAnim));
                    }
                    if(fragmentTransaction$Op0.mPopEnterAnim != 0 || fragmentTransaction$Op0.mPopExitAnim != 0) {
                        printWriter0.print(s);
                        printWriter0.print("popEnterAnim=#");
                        printWriter0.print(Integer.toHexString(fragmentTransaction$Op0.mPopEnterAnim));
                        printWriter0.print(" popExitAnim=#");
                        printWriter0.println(Integer.toHexString(fragmentTransaction$Op0.mPopExitAnim));
                    }
                }
            }
        }
    }

    void executeOps() {
        int v = this.mOps.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Op fragmentTransaction$Op0 = (Op)this.mOps.get(v1);
            Fragment fragment0 = fragmentTransaction$Op0.mFragment;
            if(fragment0 != null) {
                fragment0.setNextTransition(this.mTransition, this.mTransitionStyle);
            }
            switch(fragmentTransaction$Op0.mCmd) {
                case 1: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mEnterAnim);
                    this.mManager.addFragment(fragment0, false);
                    break;
                }
                case 3: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mExitAnim);
                    this.mManager.removeFragment(fragment0);
                    break;
                }
                case 4: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mExitAnim);
                    this.mManager.hideFragment(fragment0);
                    break;
                }
                case 5: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mEnterAnim);
                    this.mManager.showFragment(fragment0);
                    break;
                }
                case 6: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mExitAnim);
                    this.mManager.detachFragment(fragment0);
                    break;
                }
                case 7: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mEnterAnim);
                    this.mManager.attachFragment(fragment0);
                    break;
                }
                case 8: {
                    this.mManager.setPrimaryNavigationFragment(fragment0);
                    break;
                }
                case 9: {
                    this.mManager.setPrimaryNavigationFragment(null);
                    break;
                }
                case 10: {
                    this.mManager.setMaxLifecycle(fragment0, fragmentTransaction$Op0.mCurrentMaxState);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + fragmentTransaction$Op0.mCmd);
                }
            }
            if(!this.mReorderingAllowed && fragmentTransaction$Op0.mCmd != 1 && fragment0 != null) {
                this.mManager.moveFragmentToExpectedState(fragment0);
            }
        }
        if(!this.mReorderingAllowed) {
            this.mManager.moveToState(this.mManager.mCurState, true);
        }
    }

    void executePopOps(boolean z) {
        for(int v = this.mOps.size() - 1; v >= 0; --v) {
            Op fragmentTransaction$Op0 = (Op)this.mOps.get(v);
            Fragment fragment0 = fragmentTransaction$Op0.mFragment;
            if(fragment0 != null) {
                fragment0.setNextTransition(FragmentManagerImpl.reverseTransit(this.mTransition), this.mTransitionStyle);
            }
            switch(fragmentTransaction$Op0.mCmd) {
                case 1: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mPopExitAnim);
                    this.mManager.removeFragment(fragment0);
                    break;
                }
                case 3: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mPopEnterAnim);
                    this.mManager.addFragment(fragment0, false);
                    break;
                }
                case 4: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mPopEnterAnim);
                    this.mManager.showFragment(fragment0);
                    break;
                }
                case 5: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mPopExitAnim);
                    this.mManager.hideFragment(fragment0);
                    break;
                }
                case 6: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mPopEnterAnim);
                    this.mManager.attachFragment(fragment0);
                    break;
                }
                case 7: {
                    fragment0.setNextAnim(fragmentTransaction$Op0.mPopExitAnim);
                    this.mManager.detachFragment(fragment0);
                    break;
                }
                case 8: {
                    this.mManager.setPrimaryNavigationFragment(null);
                    break;
                }
                case 9: {
                    this.mManager.setPrimaryNavigationFragment(fragment0);
                    break;
                }
                case 10: {
                    this.mManager.setMaxLifecycle(fragment0, fragmentTransaction$Op0.mOldMaxState);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + fragmentTransaction$Op0.mCmd);
                }
            }
            if(!this.mReorderingAllowed && fragmentTransaction$Op0.mCmd != 3 && fragment0 != null) {
                this.mManager.moveFragmentToExpectedState(fragment0);
            }
        }
        if(!this.mReorderingAllowed && z) {
            this.mManager.moveToState(this.mManager.mCurState, true);
        }
    }

    Fragment expandOps(ArrayList arrayList0, Fragment fragment0) {
        for(int v = 0; v < this.mOps.size(); ++v) {
            Op fragmentTransaction$Op0 = (Op)this.mOps.get(v);
            int v1 = fragmentTransaction$Op0.mCmd;
            if(v1 == 1) {
                arrayList0.add(fragmentTransaction$Op0.mFragment);
            }
            else {
                switch(v1) {
                    case 2: {
                        Fragment fragment1 = fragmentTransaction$Op0.mFragment;
                        int v2 = fragment1.mContainerId;
                        int v3 = arrayList0.size() - 1;
                        boolean z = false;
                        while(v3 >= 0) {
                            Fragment fragment2 = (Fragment)arrayList0.get(v3);
                            if(fragment2.mContainerId == v2) {
                                if(fragment2 == fragment1) {
                                    z = true;
                                }
                                else {
                                    if(fragment2 == fragment0) {
                                        this.mOps.add(v, new Op(9, fragment2));
                                        ++v;
                                        fragment0 = null;
                                    }
                                    Op fragmentTransaction$Op1 = new Op(3, fragment2);
                                    fragmentTransaction$Op1.mEnterAnim = fragmentTransaction$Op0.mEnterAnim;
                                    fragmentTransaction$Op1.mPopEnterAnim = fragmentTransaction$Op0.mPopEnterAnim;
                                    fragmentTransaction$Op1.mExitAnim = fragmentTransaction$Op0.mExitAnim;
                                    fragmentTransaction$Op1.mPopExitAnim = fragmentTransaction$Op0.mPopExitAnim;
                                    this.mOps.add(v, fragmentTransaction$Op1);
                                    arrayList0.remove(fragment2);
                                    ++v;
                                }
                            }
                            --v3;
                        }
                        if(z) {
                            this.mOps.remove(v);
                            --v;
                        }
                        else {
                            fragmentTransaction$Op0.mCmd = 1;
                            arrayList0.add(fragment1);
                        }
                        break;
                    }
                    case 3: 
                    case 6: {
                        arrayList0.remove(fragmentTransaction$Op0.mFragment);
                        if(fragmentTransaction$Op0.mFragment == fragment0) {
                            this.mOps.add(v, new Op(9, fragmentTransaction$Op0.mFragment));
                            ++v;
                            fragment0 = null;
                        }
                        break;
                    }
                    case 7: {
                        arrayList0.add(fragmentTransaction$Op0.mFragment);
                        break;
                    }
                    case 8: {
                        this.mOps.add(v, new Op(9, fragment0));
                        ++v;
                        fragment0 = fragmentTransaction$Op0.mFragment;
                    }
                }
            }
        }
        return fragment0;
    }

    @Override  // androidx.fragment.app.FragmentManagerImpl$OpGenerator
    public boolean generateOps(ArrayList arrayList0, ArrayList arrayList1) {
        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList0.add(this);
        arrayList1.add(Boolean.FALSE);
        if(this.mAddToBackStack) {
            this.mManager.addBackStackState(this);
        }
        return true;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public CharSequence getBreadCrumbShortTitle() {
        return this.mBreadCrumbShortTitleRes == 0 ? this.mBreadCrumbShortTitleText : this.mManager.mHost.getContext().getText(this.mBreadCrumbShortTitleRes);
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public int getBreadCrumbShortTitleRes() {
        return this.mBreadCrumbShortTitleRes;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public CharSequence getBreadCrumbTitle() {
        return this.mBreadCrumbTitleRes == 0 ? this.mBreadCrumbTitleText : this.mManager.mHost.getContext().getText(this.mBreadCrumbTitleRes);
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public int getBreadCrumbTitleRes() {
        return this.mBreadCrumbTitleRes;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public int getId() {
        return this.mIndex;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public String getName() {
        return this.mName;
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction hide(Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment0.toString() + " is already attached to a FragmentManager.");
        }
        return super.hide(fragment0);
    }

    boolean interactsWith(int v) {
        int v1 = this.mOps.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Op fragmentTransaction$Op0 = (Op)this.mOps.get(v2);
            int v3 = fragmentTransaction$Op0.mFragment == null ? 0 : fragmentTransaction$Op0.mFragment.mContainerId;
            if(v3 != 0 && v3 == v) {
                return true;
            }
        }
        return false;
    }

    boolean interactsWith(ArrayList arrayList0, int v, int v1) {
        if(v1 == v) {
            return false;
        }
        int v2 = this.mOps.size();
        int v3 = -1;
        for(int v4 = 0; v4 < v2; ++v4) {
            Op fragmentTransaction$Op0 = (Op)this.mOps.get(v4);
            int v5 = fragmentTransaction$Op0.mFragment == null ? 0 : fragmentTransaction$Op0.mFragment.mContainerId;
            if(v5 != 0 && v5 != v3) {
                for(int v6 = v; v6 < v1; ++v6) {
                    BackStackRecord backStackRecord0 = (BackStackRecord)arrayList0.get(v6);
                    int v7 = backStackRecord0.mOps.size();
                    for(int v8 = 0; v8 < v7; ++v8) {
                        Op fragmentTransaction$Op1 = (Op)backStackRecord0.mOps.get(v8);
                        if((fragmentTransaction$Op1.mFragment == null ? 0 : fragmentTransaction$Op1.mFragment.mContainerId) == v5) {
                            return true;
                        }
                    }
                }
                v3 = v5;
            }
        }
        return false;
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }

    // 去混淆评级： 低(40)
    private static boolean isFragmentPostponed(Op fragmentTransaction$Op0) {
        return fragmentTransaction$Op0.mFragment != null && fragmentTransaction$Op0.mFragment.mAdded && fragmentTransaction$Op0.mFragment.mView != null && !fragmentTransaction$Op0.mFragment.mDetached && !fragmentTransaction$Op0.mFragment.mHidden && fragmentTransaction$Op0.mFragment.isPostponed();
    }

    boolean isPostponed() {
        for(int v = 0; v < this.mOps.size(); ++v) {
            if(BackStackRecord.isFragmentPostponed(((Op)this.mOps.get(v)))) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction remove(Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment0.toString() + " is already attached to a FragmentManager.");
        }
        return super.remove(fragment0);
    }

    public void runOnCommitRunnables() {
        if(this.mCommitRunnables != null) {
            for(int v = 0; v < this.mCommitRunnables.size(); ++v) {
                ((Runnable)this.mCommitRunnables.get(v)).run();
            }
            this.mCommitRunnables = null;
        }
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction setMaxLifecycle(Fragment fragment0, State lifecycle$State0) {
        if(fragment0.mFragmentManager != this.mManager) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.mManager);
        }
        if(!lifecycle$State0.isAtLeast(State.CREATED)) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + State.CREATED);
        }
        return super.setMaxLifecycle(fragment0, lifecycle$State0);
    }

    void setOnStartPostponedListener(OnStartEnterTransitionListener fragment$OnStartEnterTransitionListener0) {
        for(int v = 0; v < this.mOps.size(); ++v) {
            Op fragmentTransaction$Op0 = (Op)this.mOps.get(v);
            if(BackStackRecord.isFragmentPostponed(fragmentTransaction$Op0)) {
                fragmentTransaction$Op0.mFragment.setOnStartEnterTransitionListener(fragment$OnStartEnterTransitionListener0);
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment0) {
        if(fragment0 != null && fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment0.toString() + " is already attached to a FragmentManager.");
        }
        return super.setPrimaryNavigationFragment(fragment0);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction show(Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment0.toString() + " is already attached to a FragmentManager.");
        }
        return super.show(fragment0);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("BackStackEntry{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        if(this.mIndex >= 0) {
            stringBuilder0.append(" #");
            stringBuilder0.append(this.mIndex);
        }
        if(this.mName != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.mName);
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    Fragment trackAddedFragmentsInPop(ArrayList arrayList0, Fragment fragment0) {
        for(int v = this.mOps.size() - 1; v >= 0; --v) {
            Op fragmentTransaction$Op0 = (Op)this.mOps.get(v);
            switch(fragmentTransaction$Op0.mCmd) {
                case 3: 
                case 6: {
                    arrayList0.add(fragmentTransaction$Op0.mFragment);
                    break;
                }
                case 1: 
                case 7: {
                    arrayList0.remove(fragmentTransaction$Op0.mFragment);
                    break;
                }
                case 8: {
                    fragment0 = null;
                    break;
                }
                case 9: {
                    fragment0 = fragmentTransaction$Op0.mFragment;
                    break;
                }
                case 10: {
                    fragmentTransaction$Op0.mCurrentMaxState = fragmentTransaction$Op0.mOldMaxState;
                }
            }
        }
        return fragment0;
    }
}

