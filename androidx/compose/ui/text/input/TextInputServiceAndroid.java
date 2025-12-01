package androidx.compose.ui.text.input;

import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000F\b\u0010\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\u0002\u0010\u0007J\u0010\u0010(\u001A\u0004\u0018\u00010)2\u0006\u0010*\u001A\u00020+J\b\u0010,\u001A\u00020\u001CH\u0016J\u0006\u0010-\u001A\u00020\u000FJ\u0011\u0010.\u001A\u00020\u001CH\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010/J\u0010\u00100\u001A\u00020\u001C2\u0006\u00101\u001A\u000202H\u0016J\b\u00103\u001A\u00020\u001CH\u0002J\b\u00104\u001A\u00020\u001CH\u0016JI\u00105\u001A\u00020\u001C2\u0006\u00106\u001A\u00020\"2\u0006\u0010\u0014\u001A\u00020\u00152\u0018\u0010\u0018\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0\u001A\u0012\u0004\u0012\u00020\u001C0\u00192\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u001C0\u0019H\u0016\u00F8\u0001\u0000J\b\u00107\u001A\u00020\u001CH\u0016J\u001A\u00108\u001A\u00020\u001C2\b\u00109\u001A\u0004\u0018\u00010\"2\u0006\u0010:\u001A\u00020\"H\u0016R\u001B\u0010\b\u001A\u00020\t8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\n\u0010\u000BR\u000E\u0010\u000E\u001A\u00020\u000FX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0013X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0014\u001A\u00020\u0015X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0016\u001A\u00020\u0017X\u0082\u0004\u00A2\u0006\u0002\n\u0000R \u0010\u0018\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0\u001A\u0012\u0004\u0012\u00020\u001C0\u0019X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001D\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u001C0\u0019X\u0082\u000E\u00F8\u0001\u0000\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u000F0 X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001E\u0010#\u001A\u00020\"2\u0006\u0010!\u001A\u00020\"@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b$\u0010%R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b&\u0010\'\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006;"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "(Landroid/view/View;Landroidx/compose/ui/text/input/InputMethodManager;)V", "baseInputConnection", "Landroid/view/inputmethod/BaseInputConnection;", "getBaseInputConnection", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection$delegate", "Lkotlin/Lazy;", "editorHasFocus", "", "focusedRect", "Landroid/graphics/Rect;", "ic", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onEditCommand", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "showKeyboardChannel", "Lkotlinx/coroutines/channels/Channel;", "<set-?>", "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getView", "()Landroid/view/View;", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "hideSoftwareKeyboard", "isEditorFocused", "keyboardVisibilityEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyFocusedRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "restartInput", "showSoftwareKeyboard", "startInput", "value", "stopInput", "updateState", "oldValue", "newValue", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextInputServiceAndroid implements PlatformTextInputService {
    private final Lazy baseInputConnection$delegate;
    private boolean editorHasFocus;
    private Rect focusedRect;
    private RecordingInputConnection ic;
    private ImeOptions imeOptions;
    private final InputMethodManager inputMethodManager;
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    private Function1 onEditCommand;
    private Function1 onImeActionPerformed;
    private final Channel showKeyboardChannel;
    private TextFieldValue state;
    private final View view;

    static {
    }

    public TextInputServiceAndroid(View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Context context0 = view0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "view.context");
        this(view0, new InputMethodManagerImpl(context0));
    }

    public TextInputServiceAndroid(View view0, InputMethodManager inputMethodManager0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(inputMethodManager0, "inputMethodManager");
        super();
        this.view = view0;
        this.inputMethodManager = inputMethodManager0;
        this.onEditCommand = androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1.INSTANCE;
        this.onImeActionPerformed = androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1.INSTANCE;
        this.state = new TextFieldValue("", 0L, null, 4, null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        Function0 function00 = new Function0() {
            {
                TextInputServiceAndroid.this = textInputServiceAndroid0;
                super(0);
            }

            public final BaseInputConnection invoke() {
                return new BaseInputConnection(TextInputServiceAndroid.this.getView(), false);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.baseInputConnection$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, function00);
        this.showKeyboardChannel = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Rect rect0 = TextInputServiceAndroid.this.focusedRect;
                if(rect0 != null) {
                    Rect rect1 = new Rect(rect0);
                    TextInputServiceAndroid.this.getView().requestRectangleOnScreen(rect1);
                }
            }
        };
        view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                if(view0 != null) {
                    View view1 = view0.getRootView();
                    if(view1 != null) {
                        ViewTreeObserver viewTreeObserver0 = view1.getViewTreeObserver();
                        if(viewTreeObserver0 != null) {
                            viewTreeObserver0.addOnGlobalLayoutListener(TextInputServiceAndroid.this.layoutListener);
                        }
                    }
                }
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                if(view0 != null) {
                    View view1 = view0.getRootView();
                    if(view1 != null) {
                        ViewTreeObserver viewTreeObserver0 = view1.getViewTreeObserver();
                        if(viewTreeObserver0 != null) {
                            viewTreeObserver0.removeOnGlobalLayoutListener(TextInputServiceAndroid.this.layoutListener);
                        }
                    }
                }
            }
        });

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001A\u00020\u00032\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Landroidx/compose/ui/text/input/EditCommand;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1 INSTANCE;

            static {
                androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1.INSTANCE = new androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1();
            }

            androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((List)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(List list0) {
                Intrinsics.checkNotNullParameter(list0, "it");
            }
        }


        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1 INSTANCE;

            static {
                androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1.INSTANCE = new androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1();
            }

            androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke-KlQnJC8(((ImeAction)object0).unbox-impl());
                return Unit.INSTANCE;
            }

            public final void invoke-KlQnJC8(int v) {
            }
        }

    }

    public final InputConnection createInputConnection(EditorInfo editorInfo0) {
        Intrinsics.checkNotNullParameter(editorInfo0, "outAttrs");
        if(!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(editorInfo0, this.imeOptions, this.state);
        TextFieldValue textFieldValue0 = this.state;
        boolean z = this.imeOptions.getAutoCorrect();
        RecordingInputConnection recordingInputConnection0 = new RecordingInputConnection(textFieldValue0, new InputEventCallback2() {
            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(List list0) {
                Intrinsics.checkNotNullParameter(list0, "editCommands");
                TextInputServiceAndroid.this.onEditCommand.invoke(list0);
            }

            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void onImeAction-KlQnJC8(int v) {
                TextInputServiceAndroid.this.onImeActionPerformed.invoke(ImeAction.box-impl(v));
            }

            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent0) {
                Intrinsics.checkNotNullParameter(keyEvent0, "event");
                TextInputServiceAndroid.this.getBaseInputConnection().sendKeyEvent(keyEvent0);
            }
        }, z);
        this.ic = recordingInputConnection0;
        return recordingInputConnection0;
    }

    private final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection)this.baseInputConnection$delegate.getValue();
    }

    public final TextFieldValue getState$ui_release() {
        return this.state;
    }

    public final View getView() {
        return this.view;
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        this.showKeyboardChannel.trySend-JP2dKIU(Boolean.FALSE);
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    public final Object keyboardVisibilityEventLoop(Continuation continuation0) {
        ChannelIterator channelIterator0;
        TextInputServiceAndroid textInputServiceAndroid0;
        androidx.compose.ui.text.input.TextInputServiceAndroid.keyboardVisibilityEventLoop.1 textInputServiceAndroid$keyboardVisibilityEventLoop$10;
        if(continuation0 instanceof androidx.compose.ui.text.input.TextInputServiceAndroid.keyboardVisibilityEventLoop.1) {
            textInputServiceAndroid$keyboardVisibilityEventLoop$10 = (androidx.compose.ui.text.input.TextInputServiceAndroid.keyboardVisibilityEventLoop.1)continuation0;
            if((textInputServiceAndroid$keyboardVisibilityEventLoop$10.label & 0x80000000) == 0) {
                textInputServiceAndroid$keyboardVisibilityEventLoop$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return continuation0.keyboardVisibilityEventLoop(this);
                    }
                };
            }
            else {
                textInputServiceAndroid$keyboardVisibilityEventLoop$10.label ^= 0x80000000;
            }
        }
        else {
            textInputServiceAndroid$keyboardVisibilityEventLoop$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return continuation0.keyboardVisibilityEventLoop(this);
                }
            };
        }
        Object object0 = textInputServiceAndroid$keyboardVisibilityEventLoop$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(textInputServiceAndroid$keyboardVisibilityEventLoop$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                textInputServiceAndroid0 = this;
                channelIterator0 = this.showKeyboardChannel.iterator();
                goto label_29;
            }
            case 1: {
                channelIterator0 = (ChannelIterator)textInputServiceAndroid$keyboardVisibilityEventLoop$10.L$1;
                textInputServiceAndroid0 = (TextInputServiceAndroid)textInputServiceAndroid$keyboardVisibilityEventLoop$10.L$0;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(((Boolean)object0).booleanValue()) {
            boolean z = ((Boolean)channelIterator0.next()).booleanValue();
            Boolean boolean0 = (Boolean)ChannelResult.getOrNull-impl(textInputServiceAndroid0.showKeyboardChannel.tryReceive-PtdJZtk());
            if(boolean0 != null) {
                z = boolean0.booleanValue();
            }
            if(z) {
                textInputServiceAndroid0.inputMethodManager.showSoftInput(textInputServiceAndroid0.getView());
            }
            else {
                IBinder iBinder0 = textInputServiceAndroid0.getView().getWindowToken();
                textInputServiceAndroid0.inputMethodManager.hideSoftInputFromWindow(iBinder0);
            }
        label_29:
            textInputServiceAndroid$keyboardVisibilityEventLoop$10.L$0 = textInputServiceAndroid0;
            textInputServiceAndroid$keyboardVisibilityEventLoop$10.L$1 = channelIterator0;
            textInputServiceAndroid$keyboardVisibilityEventLoop$10.label = 1;
            object0 = channelIterator0.hasNext(textInputServiceAndroid$keyboardVisibilityEventLoop$10);
            if(object0 != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        Rect rect1 = new Rect(MathKt.roundToInt(rect0.getLeft()), MathKt.roundToInt(rect0.getTop()), MathKt.roundToInt(rect0.getRight()), MathKt.roundToInt(rect0.getBottom()));
        this.focusedRect = rect1;
        if(this.ic == null) {
            this.getView().requestRectangleOnScreen(new Rect(rect1));
        }
    }

    private final void restartInput() {
        this.inputMethodManager.restartInput(this.view);
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        this.showKeyboardChannel.trySend-JP2dKIU(Boolean.TRUE);
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue textFieldValue0, ImeOptions imeOptions0, Function1 function10, Function1 function11) {
        Intrinsics.checkNotNullParameter(textFieldValue0, "value");
        Intrinsics.checkNotNullParameter(imeOptions0, "imeOptions");
        Intrinsics.checkNotNullParameter(function10, "onEditCommand");
        Intrinsics.checkNotNullParameter(function11, "onImeActionPerformed");
        this.editorHasFocus = true;
        this.state = textFieldValue0;
        this.imeOptions = imeOptions0;
        this.onEditCommand = function10;
        this.onImeActionPerformed = function11;
        Runnable runnable0 = new Runnable() {
            @Override
            public final void run() {
                TextInputServiceAndroid.this.restartInput();
                TextInputServiceAndroid.this.showSoftwareKeyboard();
            }
        };
        this.view.post(runnable0);
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1.INSTANCE;
        this.onImeActionPerformed = androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2.INSTANCE;
        this.focusedRect = null;
        this.restartInput();
        this.editorHasFocus = false;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001A\u00020\u00032\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Landroidx/compose/ui/text/input/EditCommand;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1 INSTANCE;

            static {
                androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1.INSTANCE = new androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1();
            }

            androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((List)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(List list0) {
                Intrinsics.checkNotNullParameter(list0, "it");
            }
        }


        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2 extends Lambda implements Function1 {
            public static final androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2 INSTANCE;

            static {
                androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2.INSTANCE = new androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2();
            }

            androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke-KlQnJC8(((ImeAction)object0).unbox-impl());
                return Unit.INSTANCE;
            }

            public final void invoke-KlQnJC8(int v) {
            }
        }

    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue textFieldValue0, TextFieldValue textFieldValue1) {
        Intrinsics.checkNotNullParameter(textFieldValue1, "newValue");
        this.state = textFieldValue1;
        RecordingInputConnection recordingInputConnection0 = this.ic;
        if(recordingInputConnection0 != null) {
            recordingInputConnection0.setMTextFieldValue$ui_release(textFieldValue1);
        }
        if(Intrinsics.areEqual(textFieldValue0, textFieldValue1)) {
            return;
        }
        if(textFieldValue0 != null && (!Intrinsics.areEqual(textFieldValue0.getText(), textFieldValue1.getText()) || TextRange.equals-impl0(textFieldValue0.getSelection-d9O1mEE(), textFieldValue1.getSelection-d9O1mEE()) && !Intrinsics.areEqual(textFieldValue0.getComposition-MzsxiRA(), textFieldValue1.getComposition-MzsxiRA()))) {
            this.restartInput();
            return;
        }
        RecordingInputConnection recordingInputConnection1 = this.ic;
        if(recordingInputConnection1 != null) {
            recordingInputConnection1.updateInputState(this.state, this.inputMethodManager, this.view);
        }
    }
}

