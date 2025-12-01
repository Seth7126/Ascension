package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat.Params.Builder;
import androidx.core.text.PrecomputedTextCompat.Params;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class TextViewCompat {
    @Retention(RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    static class OreoCallback implements ActionMode.Callback {
        private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
        private final ActionMode.Callback mCallback;
        private boolean mCanUseMenuBuilderReferences;
        private boolean mInitializedMenuBuilderReferences;
        private Class mMenuBuilderClass;
        private Method mMenuBuilderRemoveItemAtMethod;
        private final TextView mTextView;

        OreoCallback(ActionMode.Callback actionMode$Callback0, TextView textView0) {
            this.mCallback = actionMode$Callback0;
            this.mTextView = textView0;
            this.mInitializedMenuBuilderReferences = false;
        }

        private Intent createProcessTextIntent() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent createProcessTextIntentForResolveInfo(ResolveInfo resolveInfo0, TextView textView0) {
            return this.createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !this.isEditable(textView0)).setClassName(resolveInfo0.activityInfo.packageName, resolveInfo0.activityInfo.name);
        }

        private List getSupportedActivities(Context context0, PackageManager packageManager0) {
            List list0 = new ArrayList();
            if(!(context0 instanceof Activity)) {
                return list0;
            }
            for(Object object0: packageManager0.queryIntentActivities(this.createProcessTextIntent(), 0)) {
                ResolveInfo resolveInfo0 = (ResolveInfo)object0;
                if(this.isSupportedActivity(resolveInfo0, context0)) {
                    list0.add(resolveInfo0);
                }
            }
            return list0;
        }

        // 去混淆评级： 低(30)
        private boolean isEditable(TextView textView0) {
            return textView0 instanceof Editable && textView0.onCheckIsTextEditor() && textView0.isEnabled();
        }

        private boolean isSupportedActivity(ResolveInfo resolveInfo0, Context context0) {
            if("com.playdekgames.android.Ascension".equals(resolveInfo0.activityInfo.packageName)) {
                return true;
            }
            return resolveInfo0.activityInfo.exported ? resolveInfo0.activityInfo.permission == null || context0.checkSelfPermission(resolveInfo0.activityInfo.permission) == 0 : false;
        }

        @Override  // android.view.ActionMode$Callback
        public boolean onActionItemClicked(ActionMode actionMode0, MenuItem menuItem0) {
            return this.mCallback.onActionItemClicked(actionMode0, menuItem0);
        }

        @Override  // android.view.ActionMode$Callback
        public boolean onCreateActionMode(ActionMode actionMode0, Menu menu0) {
            return this.mCallback.onCreateActionMode(actionMode0, menu0);
        }

        @Override  // android.view.ActionMode$Callback
        public void onDestroyActionMode(ActionMode actionMode0) {
            this.mCallback.onDestroyActionMode(actionMode0);
        }

        @Override  // android.view.ActionMode$Callback
        public boolean onPrepareActionMode(ActionMode actionMode0, Menu menu0) {
            this.recomputeProcessTextMenuItems(menu0);
            return this.mCallback.onPrepareActionMode(actionMode0, menu0);
        }

        private void recomputeProcessTextMenuItems(Menu menu0) {
            Context context0 = this.mTextView.getContext();
            PackageManager packageManager0 = context0.getPackageManager();
            if(!this.mInitializedMenuBuilderReferences) {
                try {
                    this.mInitializedMenuBuilderReferences = true;
                    Class class0 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.mMenuBuilderClass = class0;
                    this.mMenuBuilderRemoveItemAtMethod = class0.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.mCanUseMenuBuilderReferences = true;
                }
                catch(ClassNotFoundException | NoSuchMethodException unused_ex) {
                    this.mMenuBuilderClass = null;
                    this.mMenuBuilderRemoveItemAtMethod = null;
                    this.mCanUseMenuBuilderReferences = false;
                }
            }
            try {
                Method method0 = !this.mCanUseMenuBuilderReferences || !this.mMenuBuilderClass.isInstance(menu0) ? menu0.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE) : this.mMenuBuilderRemoveItemAtMethod;
                for(int v = menu0.size() - 1; v >= 0; --v) {
                    MenuItem menuItem0 = menu0.getItem(v);
                    if(menuItem0.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(menuItem0.getIntent().getAction())) {
                        method0.invoke(menu0, v);
                    }
                }
            }
            catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException unused_ex) {
                return;
            }
            List list0 = this.getSupportedActivities(context0, packageManager0);
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(v1);
                menu0.add(0, 0, v1 + 100, resolveInfo0.loadLabel(packageManager0)).setIntent(this.createProcessTextIntentForResolveInfo(resolveInfo0, this.mTextView)).setShowAsAction(1);
            }
        }
    }

    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
    private static final int LINES = 1;
    private static final String LOG_TAG = "TextViewCompat";
    private static Field sMaxModeField;
    private static boolean sMaxModeFieldFetched;
    private static Field sMaximumField;
    private static boolean sMaximumFieldFetched;
    private static Field sMinModeField;
    private static boolean sMinModeFieldFetched;
    private static Field sMinimumField;
    private static boolean sMinimumFieldFetched;

    public static int getAutoSizeMaxTextSize(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return textView0.getAutoSizeMaxTextSize();
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeMaxTextSize() : -1;
    }

    public static int getAutoSizeMinTextSize(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return textView0.getAutoSizeMinTextSize();
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeMinTextSize() : -1;
    }

    public static int getAutoSizeStepGranularity(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return textView0.getAutoSizeStepGranularity();
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeStepGranularity() : -1;
    }

    public static int[] getAutoSizeTextAvailableSizes(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return textView0.getAutoSizeTextAvailableSizes();
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeTextAvailableSizes() : new int[0];
    }

    public static int getAutoSizeTextType(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return textView0.getAutoSizeTextType();
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeTextType() : 0;
    }

    public static ColorStateList getCompoundDrawableTintList(TextView textView0) {
        Preconditions.checkNotNull(textView0);
        if(Build.VERSION.SDK_INT >= 24) {
            return textView0.getCompoundDrawableTintList();
        }
        return textView0 instanceof TintableCompoundDrawablesView ? ((TintableCompoundDrawablesView)textView0).getSupportCompoundDrawablesTintList() : null;
    }

    public static PorterDuff.Mode getCompoundDrawableTintMode(TextView textView0) {
        Preconditions.checkNotNull(textView0);
        if(Build.VERSION.SDK_INT >= 24) {
            return textView0.getCompoundDrawableTintMode();
        }
        return textView0 instanceof TintableCompoundDrawablesView ? ((TintableCompoundDrawablesView)textView0).getSupportCompoundDrawablesTintMode() : null;
    }

    public static Drawable[] getCompoundDrawablesRelative(TextView textView0) {
        return textView0.getCompoundDrawablesRelative();
    }

    public static int getFirstBaselineToTopHeight(TextView textView0) {
        return textView0.getPaddingTop() - textView0.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(TextView textView0) {
        return textView0.getPaddingBottom() + textView0.getPaint().getFontMetricsInt().bottom;
    }

    public static int getMaxLines(TextView textView0) {
        return textView0.getMaxLines();
    }

    public static int getMinLines(TextView textView0) {
        return textView0.getMinLines();
    }

    private static int getTextDirection(TextDirectionHeuristic textDirectionHeuristic0) {
        if(textDirectionHeuristic0 == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 1;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic0 == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    private static TextDirectionHeuristic getTextDirectionHeuristic(TextView textView0) {
        boolean z = false;
        if(textView0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if(Build.VERSION.SDK_INT >= 28 && (textView0.getInputType() & 15) == 3) {
            switch(Character.getDirectionality(DecimalFormatSymbols.getInstance(textView0.getTextLocale()).getDigitStrings()[0].codePointAt(0))) {
                case 1: 
                case 2: {
                    return TextDirectionHeuristics.RTL;
                }
                default: {
                    return TextDirectionHeuristics.LTR;
                }
            }
        }
        if(textView0.getLayoutDirection() == 1) {
            z = true;
        }
        switch(textView0.getTextDirection()) {
            case 2: {
                return TextDirectionHeuristics.ANYRTL_LTR;
            }
            case 3: {
                return TextDirectionHeuristics.LTR;
            }
            case 4: {
                return TextDirectionHeuristics.RTL;
            }
            case 5: {
                return TextDirectionHeuristics.LOCALE;
            }
            case 6: {
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            case 7: {
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            default: {
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        }
    }

    public static Params getTextMetricsParams(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return new Params(textView0.getTextMetricsParams());
        }
        Builder precomputedTextCompat$Params$Builder0 = new Builder(new TextPaint(textView0.getPaint()));
        if(Build.VERSION.SDK_INT >= 23) {
            precomputedTextCompat$Params$Builder0.setBreakStrategy(textView0.getBreakStrategy());
            precomputedTextCompat$Params$Builder0.setHyphenationFrequency(textView0.getHyphenationFrequency());
        }
        precomputedTextCompat$Params$Builder0.setTextDirection(TextViewCompat.getTextDirectionHeuristic(textView0));
        return precomputedTextCompat$Params$Builder0.build();
    }

    private static Field retrieveField(String s) {
        Field field0 = null;
        try {
            field0 = TextView.class.getDeclaredField(s);
            field0.setAccessible(true);
        }
        catch(NoSuchFieldException unused_ex) {
            Log.e("TextViewCompat", "Could not retrieve " + s + " field.");
        }
        return field0;
    }

    private static int retrieveIntFromField(Field field0, TextView textView0) {
        try {
            return field0.getInt(textView0);
        }
        catch(IllegalAccessException unused_ex) {
            Log.d("TextViewCompat", "Could not retrieve value of " + field0.getName() + " field.");
            return -1;
        }
    }

    public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView0, int v, int v1, int v2, int v3) throws IllegalArgumentException {
        if(Build.VERSION.SDK_INT >= 27) {
            textView0.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
            return;
        }
        if(textView0 instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView)textView0).setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
        }
    }

    public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView0, int[] arr_v, int v) throws IllegalArgumentException {
        if(Build.VERSION.SDK_INT >= 27) {
            textView0.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
            return;
        }
        if(textView0 instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView)textView0).setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
        }
    }

    public static void setAutoSizeTextTypeWithDefaults(TextView textView0, int v) {
        if(Build.VERSION.SDK_INT >= 27) {
            textView0.setAutoSizeTextTypeWithDefaults(v);
            return;
        }
        if(textView0 instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView)textView0).setAutoSizeTextTypeWithDefaults(v);
        }
    }

    public static void setCompoundDrawableTintList(TextView textView0, ColorStateList colorStateList0) {
        Preconditions.checkNotNull(textView0);
        if(Build.VERSION.SDK_INT >= 24) {
            textView0.setCompoundDrawableTintList(colorStateList0);
            return;
        }
        if(textView0 instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView)textView0).setSupportCompoundDrawablesTintList(colorStateList0);
        }
    }

    public static void setCompoundDrawableTintMode(TextView textView0, PorterDuff.Mode porterDuff$Mode0) {
        Preconditions.checkNotNull(textView0);
        if(Build.VERSION.SDK_INT >= 24) {
            textView0.setCompoundDrawableTintMode(porterDuff$Mode0);
            return;
        }
        if(textView0 instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView)textView0).setSupportCompoundDrawablesTintMode(porterDuff$Mode0);
        }
    }

    public static void setCompoundDrawablesRelative(TextView textView0, Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        textView0.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView0, int v, int v1, int v2, int v3) {
        textView0.setCompoundDrawablesRelativeWithIntrinsicBounds(v, v1, v2, v3);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView0, Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        textView0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
    }

    public static void setCustomSelectionActionModeCallback(TextView textView0, ActionMode.Callback actionMode$Callback0) {
        textView0.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(textView0, actionMode$Callback0));
    }

    public static void setFirstBaselineToTopHeight(TextView textView0, int v) {
        Preconditions.checkArgumentNonnegative(v);
        if(Build.VERSION.SDK_INT >= 28) {
            textView0.setFirstBaselineToTopHeight(v);
            return;
        }
        Paint.FontMetricsInt paint$FontMetricsInt0 = textView0.getPaint().getFontMetricsInt();
        int v1 = textView0.getIncludeFontPadding() ? paint$FontMetricsInt0.top : paint$FontMetricsInt0.ascent;
        if(v > Math.abs(v1)) {
            textView0.setPadding(textView0.getPaddingLeft(), v + v1, textView0.getPaddingRight(), textView0.getPaddingBottom());
        }
    }

    public static void setLastBaselineToBottomHeight(TextView textView0, int v) {
        Preconditions.checkArgumentNonnegative(v);
        Paint.FontMetricsInt paint$FontMetricsInt0 = textView0.getPaint().getFontMetricsInt();
        int v1 = textView0.getIncludeFontPadding() ? paint$FontMetricsInt0.bottom : paint$FontMetricsInt0.descent;
        if(v > Math.abs(v1)) {
            textView0.setPadding(textView0.getPaddingLeft(), textView0.getPaddingTop(), textView0.getPaddingRight(), v - v1);
        }
    }

    public static void setLineHeight(TextView textView0, int v) {
        Preconditions.checkArgumentNonnegative(v);
        int v1 = textView0.getPaint().getFontMetricsInt(null);
        if(v != v1) {
            textView0.setLineSpacing(((float)(v - v1)), 1.0f);
        }
    }

    public static void setPrecomputedText(TextView textView0, PrecomputedTextCompat precomputedTextCompat0) {
        if(Build.VERSION.SDK_INT >= 29) {
            textView0.setText(precomputedTextCompat0.getPrecomputedText());
            return;
        }
        if(!TextViewCompat.getTextMetricsParams(textView0).equalsWithoutTextDirection(precomputedTextCompat0.getParams())) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView0.setText(precomputedTextCompat0);
    }

    public static void setTextAppearance(TextView textView0, int v) {
        if(Build.VERSION.SDK_INT >= 23) {
            textView0.setTextAppearance(v);
            return;
        }
        textView0.setTextAppearance(textView0.getContext(), v);
    }

    public static void setTextMetricsParams(TextView textView0, Params precomputedTextCompat$Params0) {
        textView0.setTextDirection(TextViewCompat.getTextDirection(precomputedTextCompat$Params0.getTextDirection()));
        if(Build.VERSION.SDK_INT < 23) {
            float f = precomputedTextCompat$Params0.getTextPaint().getTextScaleX();
            textView0.getPaint().set(precomputedTextCompat$Params0.getTextPaint());
            if(f == textView0.getTextScaleX()) {
                textView0.setTextScaleX(f / 2.0f + 1.0f);
            }
            textView0.setTextScaleX(f);
            return;
        }
        textView0.getPaint().set(precomputedTextCompat$Params0.getTextPaint());
        textView0.setBreakStrategy(precomputedTextCompat$Params0.getBreakStrategy());
        textView0.setHyphenationFrequency(precomputedTextCompat$Params0.getHyphenationFrequency());
    }

    public static ActionMode.Callback wrapCustomSelectionActionModeCallback(TextView textView0, ActionMode.Callback actionMode$Callback0) {
        return Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 27 && !(actionMode$Callback0 instanceof OreoCallback) ? new OreoCallback(actionMode$Callback0, textView0) : actionMode$Callback0;
    }
}

