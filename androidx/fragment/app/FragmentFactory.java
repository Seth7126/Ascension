package androidx.fragment.app;

import androidx.collection.SimpleArrayMap;
import java.lang.reflect.InvocationTargetException;

public class FragmentFactory {
    private static final SimpleArrayMap sClassMap;

    static {
        FragmentFactory.sClassMap = new SimpleArrayMap();
    }

    public Fragment instantiate(ClassLoader classLoader0, String s) {
        try {
            return (Fragment)FragmentFactory.loadFragmentClass(classLoader0, s).getConstructor().newInstance();
        }
        catch(InstantiationException instantiationException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", illegalAccessException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": could not find Fragment constructor", noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": calling Fragment constructor caused an exception", invocationTargetException0);
        }
    }

    static boolean isFragmentClass(ClassLoader classLoader0, String s) {
        try {
            Class class0 = FragmentFactory.loadClass(classLoader0, s);
            return Fragment.class.isAssignableFrom(class0);
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }

    private static Class loadClass(ClassLoader classLoader0, String s) throws ClassNotFoundException {
        SimpleArrayMap simpleArrayMap0 = FragmentFactory.sClassMap;
        Class class0 = (Class)simpleArrayMap0.get(s);
        if(class0 == null) {
            class0 = Class.forName(s, false, classLoader0);
            simpleArrayMap0.put(s, class0);
        }
        return class0;
    }

    public static Class loadFragmentClass(ClassLoader classLoader0, String s) {
        try {
            return FragmentFactory.loadClass(classLoader0, s);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists", classNotFoundException0);
        }
        catch(ClassCastException classCastException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class is a valid subclass of Fragment", classCastException0);
        }
    }
}

