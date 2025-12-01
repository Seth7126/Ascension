package androidx.compose.ui.text.intl;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\tH&R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "", "current", "", "Landroidx/compose/ui/text/intl/PlatformLocale;", "getCurrent", "()Ljava/util/List;", "parseLanguageTag", "languageTag", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface PlatformLocaleDelegate {
    List getCurrent();

    PlatformLocale parseLanguageTag(String arg1);
}

