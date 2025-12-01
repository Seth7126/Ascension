package androidx.lifecycle;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B/\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000BJ\b\u0010\u0011\u001A\u00020\u0012H\u0016R\u0012\u0010\f\u001A\u0004\u0018\u00018\u0000X\u0082\u000E¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\t\u001A\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000E\u001A\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Lazy;", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "factoryProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cached", "Landroidx/lifecycle/ViewModel;", "value", "getValue", "()Landroidx/lifecycle/ViewModel;", "isInitialized", "", "lifecycle-viewmodel-ktx_release"}, k = 1, mv = {1, 4, 1})
public final class ViewModelLazy implements Lazy {
    private ViewModel cached;
    private final Function0 factoryProducer;
    private final Function0 storeProducer;
    private final KClass viewModelClass;

    public ViewModelLazy(KClass kClass0, Function0 function00, Function0 function01) {
        Intrinsics.checkNotNullParameter(kClass0, "viewModelClass");
        Intrinsics.checkNotNullParameter(function00, "storeProducer");
        Intrinsics.checkNotNullParameter(function01, "factoryProducer");
        super();
        this.viewModelClass = kClass0;
        this.storeProducer = function00;
        this.factoryProducer = function01;
    }

    public ViewModel getValue() {
        ViewModel viewModel0 = this.cached;
        if(viewModel0 == null) {
            Factory viewModelProvider$Factory0 = (Factory)this.factoryProducer.invoke();
            viewModel0 = new ViewModelProvider(((ViewModelStore)this.storeProducer.invoke()), viewModelProvider$Factory0).get(JvmClassMappingKt.getJavaClass(this.viewModelClass));
            this.cached = viewModel0;
            Intrinsics.checkNotNullExpressionValue(viewModel0, "ViewModelProvider(store,…ed = it\n                }");
        }
        return viewModel0;
    }

    @Override  // kotlin.Lazy
    public Object getValue() {
        return this.getValue();
    }

    @Override  // kotlin.Lazy
    public boolean isInitialized() {
        return this.cached != null;
    }
}

