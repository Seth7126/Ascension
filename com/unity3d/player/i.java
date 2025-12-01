package com.unity3d.player;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class i extends Dialog implements TextWatcher, View.OnClickListener {
    static final class a {
        private static final int a;
        private static final int b;
        private static final int c;

        static {
            a.a = View.generateViewId();
            a.b = View.generateViewId();
            a.c = View.generateViewId();
        }
    }

    public boolean a;
    private Context b;
    private UnityPlayer c;
    private static int d = 0x61000000;
    private static int e = -1;
    private int f;
    private boolean g;

    static {
    }

    public i(Context context0, UnityPlayer unityPlayer0, String s, int v, boolean z, boolean z1, boolean z2, String s1, int v1, boolean z3, boolean z4) {
        super(context0);
        this.b = context0;
        this.c = unityPlayer0;
        Window window0 = this.getWindow();
        this.a = z4;
        window0.requestFeature(1);
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        windowManager$LayoutParams0.gravity = 80;
        windowManager$LayoutParams0.x = 0;
        windowManager$LayoutParams0.y = 0;
        window0.setAttributes(windowManager$LayoutParams0);
        window0.setBackgroundDrawable(new ColorDrawable(0));
        View view0 = this.createSoftInputView();
        this.setContentView(view0);
        window0.setLayout(-1, -2);
        window0.clearFlags(2);
        window0.clearFlags(0x8000000);
        window0.clearFlags(0x4000000);
        if(!this.a) {
            window0.addFlags(0x20);
            window0.addFlags(0x40000);
        }
        View view1 = this.findViewById(a.a());
        View view2 = this.findViewById(a.b());
        this.a(((EditText)view1), s, v, z, z1, z2, s1, v1);
        ((Button)view2).setOnClickListener(this);
        this.f = ((EditText)view1).getCurrentTextColor();
        this.a(z3);
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            final i b;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if(view0.isShown()) {
                    Rect rect0 = new Rect();
                    i.a(i.this).getWindowVisibleDisplayFrame(rect0);
                    int[] arr_v = new int[2];
                    i.a(i.this).getLocationOnScreen(arr_v);
                    Point point0 = new Point(rect0.left - arr_v[0], rect0.height() - view0.getHeight());
                    Point point1 = new Point();
                    i.this.getWindow().getWindowManager().getDefaultDisplay().getSize(point1);
                    int v = i.a(i.this).getHeight() - point1.y;
                    int v1 = i.a(i.this).getHeight() - point0.y;
                    if(v1 == v + view0.getHeight()) {
                        i.a(i.this).reportSoftInputIsVisible(false);
                    }
                    else {
                        i.a(i.this).reportSoftInputIsVisible(true);
                    }
                    Rect rect1 = new Rect(point0.x, point0.y, view0.getWidth(), v1);
                    i.a(i.this).reportSoftInputArea(rect1);
                }
            }
        });
        this.getWindow().setSoftInputMode(5);
        ((EditText)view1).requestFocus();
    }

    private static int a(int v, boolean z, boolean z1, boolean z2) {
        int v1 = (z ? 0x8000 : 0x80000) | (z1 ? 0x20000 : 0) | (z2 ? 0x80 : 0);
        if(v >= 0 && v <= 11) {
            int v2 = new int[]{1, 0x4001, 0x3002, 17, 2, 3, 0x2061, 33, 1, 0x4021, 17, 0x2002}[v];
            return (v2 & 2) == 0 ? v2 | v1 : v2;
        }
        return v1;
    }

    private void a(EditText editText0, String s, int v, boolean z, boolean z1, boolean z2, String s1, int v1) {
        editText0.setBackgroundColor(i.e);
        editText0.setImeOptions(6);
        editText0.setText(s);
        editText0.setHint(s1);
        editText0.setHintTextColor(i.d);
        editText0.setInputType(i.a(v, z, z1, z2));
        editText0.setImeOptions(0x2000000);
        if(v1 > 0) {
            editText0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(v1)});
        }
        editText0.addTextChangedListener(this);
        editText0.setSelection(editText0.getText().length());
        editText0.setClickable(true);
    }

    private void a(String s, boolean z) {
        ((EditText)this.findViewById(a.a())).setSelection(0, 0);
        this.c.reportSoftInputStr(s, 1, z);
    }

    public final String a() {
        InputMethodSubtype inputMethodSubtype0 = ((InputMethodManager)this.b.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if(inputMethodSubtype0 == null) {
            return null;
        }
        String s = inputMethodSubtype0.getLocale();
        return s == null || s.equals("") ? inputMethodSubtype0.getMode() + " " + inputMethodSubtype0.getExtraValue() : s;
    }

    public final void a(int v) {
        EditText editText0 = (EditText)this.findViewById(a.a());
        if(editText0 != null) {
            if(v > 0) {
                editText0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(v)});
                return;
            }
            editText0.setFilters(new InputFilter[0]);
        }
    }

    public final void a(int v, int v1) {
        EditText editText0 = (EditText)this.findViewById(a.a());
        if(editText0 != null) {
            int v2 = v1 + v;
            if(editText0.getText().length() >= v2) {
                editText0.setSelection(v, v2);
            }
        }
    }

    public final void a(String s) {
        EditText editText0 = (EditText)this.findViewById(a.a());
        if(editText0 != null) {
            editText0.setText(s);
            editText0.setSelection(s.length());
        }
    }

    public final void a(boolean z) {
        this.g = z;
        EditText editText0 = (EditText)this.findViewById(a.a());
        Button button0 = (Button)this.findViewById(a.b());
        View view0 = this.findViewById(a.c());
        if(z) {
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = (RelativeLayout.LayoutParams)editText0.getLayoutParams();
            relativeLayout$LayoutParams0.height = 1;
            editText0.setLayoutParams(relativeLayout$LayoutParams0);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = (RelativeLayout.LayoutParams)button0.getLayoutParams();
            relativeLayout$LayoutParams1.height = 1;
            button0.setLayoutParams(relativeLayout$LayoutParams1);
            view0.setPadding(0, 0, 0, 0);
            view0.setVisibility(4);
            return;
        }
        view0.setVisibility(0);
        view0.setPadding(16, 16, 16, 16);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = (RelativeLayout.LayoutParams)editText0.getLayoutParams();
        relativeLayout$LayoutParams2.height = -2;
        editText0.setLayoutParams(relativeLayout$LayoutParams2);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = (RelativeLayout.LayoutParams)button0.getLayoutParams();
        relativeLayout$LayoutParams3.height = -2;
        button0.setLayoutParams(relativeLayout$LayoutParams3);
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        this.c.reportSoftInputStr(editable0.toString(), 0, false);
        EditText editText0 = (EditText)this.findViewById(a.a());
        int v = editText0.getSelectionStart();
        int v1 = editText0.getSelectionEnd();
        this.c.reportSoftInputSelection(v, v1 - v);
    }

    private String b() {
        EditText editText0 = (EditText)this.findViewById(a.a());
        return editText0 == null ? null : editText0.getText().toString();
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    protected final View createSoftInputView() {
        View view0 = new RelativeLayout(this.b);
        ((RelativeLayout)view0).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((RelativeLayout)view0).setBackgroundColor(i.e);
        ((RelativeLayout)view0).setId(a.c);
        com.unity3d.player.i.2 i$20 = new EditText(this.b) {
            final i a;

            @Override  // android.widget.TextView
            public final boolean onKeyPreIme(int v, KeyEvent keyEvent0) {
                switch(v) {
                    case 4: {
                        String s = i.this.b();
                        i.this.a(s, true);
                        return true;
                    }
                    case 66: {
                        if(keyEvent0.getAction() == 0 && (this.getInputType() & 0x20000) == 0) {
                            String s1 = i.this.b();
                            i.this.a(s1, false);
                            return true;
                        }
                        return super.onKeyPreIme(66, keyEvent0);
                    }
                    case 84: {
                        return true;
                    }
                    default: {
                        return super.onKeyPreIme(v, keyEvent0);
                    }
                }
            }

            @Override  // android.widget.TextView
            protected final void onSelectionChanged(int v, int v1) {
                i.this.c.reportSoftInputSelection(v, v1 - v);
            }

            @Override  // android.widget.TextView
            public final void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if(z) {
                    ((InputMethodManager)i.this.b.getSystemService("input_method")).showSoftInput(this, 0);
                }
            }
        };
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams0.addRule(15);
        relativeLayout$LayoutParams0.addRule(0, a.a);
        i$20.setLayoutParams(relativeLayout$LayoutParams0);
        i$20.setId(a.b);
        ((RelativeLayout)view0).addView(i$20);
        Button button0 = new Button(this.b);
        button0.setText(this.b.getResources().getIdentifier("ok", "string", "android"));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(15);
        relativeLayout$LayoutParams1.addRule(11);
        button0.setLayoutParams(relativeLayout$LayoutParams1);
        button0.setId(a.a);
        button0.setBackgroundColor(0);
        ((RelativeLayout)view0).addView(button0);
        ((EditText)view0.findViewById(a.b)).setOnEditorActionListener(new TextView.OnEditorActionListener() {
            final i a;

            @Override  // android.widget.TextView$OnEditorActionListener
            public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
                if(v == 6) {
                    String s = i.this.b();
                    i.this.a(s, false);
                }
                return false;
            }
        });
        view0.setPadding(16, 16, 16, 16);
        return view0;
    }

    // 去混淆评级： 低(30)
    @Override  // android.app.Dialog
    public final boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        return this.a || motionEvent0.getAction() != 4 && !this.g ? super.dispatchTouchEvent(motionEvent0) : true;
    }

    @Override  // android.app.Dialog
    public final void onBackPressed() {
        this.a(this.b(), true);
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a(this.b(), false);
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }
}

