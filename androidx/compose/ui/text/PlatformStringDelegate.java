package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.PlatformLocale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&J\u0018\u0010\u0007\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&J\u0018\u0010\b\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&J\u0018\u0010\t\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/PlatformStringDelegate;", "", "capitalize", "", "string", "locale", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface PlatformStringDelegate {
    String capitalize(String arg1, PlatformLocale arg2);

    String decapitalize(String arg1, PlatformLocale arg2);

    String toLowerCase(String arg1, PlatformLocale arg2);

    String toUpperCase(String arg1, PlatformLocale arg2);
}

