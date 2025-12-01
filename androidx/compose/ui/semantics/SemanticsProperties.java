package androidx.compose.ui.semantics;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u0007R\u001D\u0010\u000B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u0007R\u0017\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00100\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00130\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\r0\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0007R\u0017\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00180\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u0007R\u0017\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00100\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u0007R\u0017\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001D0\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u0007R\u001A\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020 0\u0004\u00F8\u0001\u0000\u00A2\u0006\b\n\u0000\u001A\u0004\b!\u0010\u0007R#\u0010\"\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020$0#0\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010\u0007R\"\u0010&\u001A\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\'\u0010\u0002\u001A\u0004\b(\u0010\u0007R\u0017\u0010)\u001A\b\u0012\u0004\u0012\u00020\u00100\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010\u0007R\u0017\u0010+\u001A\b\u0012\u0004\u0012\u00020\u00100\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010\u0007R\u001A\u0010-\u001A\b\u0012\u0004\u0012\u00020.0\u0004\u00F8\u0001\u0000\u00A2\u0006\b\n\u0000\u001A\u0004\b/\u0010\u0007R\u0017\u00100\u001A\b\u0012\u0004\u0012\u00020\r0\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b1\u0010\u0007R\u0017\u00102\u001A\b\u0012\u0004\u0012\u00020\u00100\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b3\u0010\u0007R\u0017\u00104\u001A\b\u0012\u0004\u0012\u0002050\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b6\u0010\u0007R\u001A\u00107\u001A\b\u0012\u0004\u0012\u0002080\u0004\u00F8\u0001\u0000\u00A2\u0006\b\n\u0000\u001A\u0004\b9\u0010\u0007R\u0017\u0010:\u001A\b\u0012\u0004\u0012\u00020\u00100\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b;\u0010\u0007R\u0017\u0010<\u001A\b\u0012\u0004\u0012\u00020\u00180\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b=\u0010\u0007R\u0017\u0010>\u001A\b\u0012\u0004\u0012\u00020\r0\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b?\u0010\u0007R\u0017\u0010@\u001A\b\u0012\u0004\u0012\u00020\r0\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bA\u0010\u0007R\u001D\u0010B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bC\u0010\u0007R\u001A\u0010D\u001A\b\u0012\u0004\u0012\u00020E0\u0004\u00F8\u0001\u0000\u00A2\u0006\b\n\u0000\u001A\u0004\bF\u0010\u0007R\u0017\u0010G\u001A\b\u0012\u0004\u0012\u00020H0\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bI\u0010\u0007R\u0017\u0010J\u001A\b\u0012\u0004\u0012\u00020\u001D0\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bK\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006L"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "()V", "CollectionInfo", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "CollectionItemInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "getCollectionItemInfo", "ContentDescription", "", "", "getContentDescription", "Disabled", "", "getDisabled", "EditableText", "Landroidx/compose/ui/text/AnnotatedString;", "getEditableText", "Error", "getError", "Focused", "", "getFocused", "Heading", "getHeading", "HorizontalScrollAxisRange", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "ImeAction", "Landroidx/compose/ui/text/input/ImeAction;", "getImeAction", "IndexForKey", "Lkotlin/Function1;", "", "getIndexForKey", "InvisibleToUser", "getInvisibleToUser$annotations", "getInvisibleToUser", "IsDialog", "getIsDialog", "IsPopup", "getIsPopup", "LiveRegion", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getLiveRegion", "PaneTitle", "getPaneTitle", "Password", "getPassword", "ProgressBarRangeInfo", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getProgressBarRangeInfo", "Role", "Landroidx/compose/ui/semantics/Role;", "getRole", "SelectableGroup", "getSelectableGroup", "Selected", "getSelected", "StateDescription", "getStateDescription", "TestTag", "getTestTag", "Text", "getText", "TextSelectionRange", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "ToggleableState", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "VerticalScrollAxisRange", "getVerticalScrollAxisRange", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsProperties {
    public static final int $stable;
    private static final SemanticsPropertyKey CollectionInfo;
    private static final SemanticsPropertyKey CollectionItemInfo;
    private static final SemanticsPropertyKey ContentDescription;
    private static final SemanticsPropertyKey Disabled;
    private static final SemanticsPropertyKey EditableText;
    private static final SemanticsPropertyKey Error;
    private static final SemanticsPropertyKey Focused;
    private static final SemanticsPropertyKey Heading;
    private static final SemanticsPropertyKey HorizontalScrollAxisRange;
    public static final SemanticsProperties INSTANCE;
    private static final SemanticsPropertyKey ImeAction;
    private static final SemanticsPropertyKey IndexForKey;
    private static final SemanticsPropertyKey InvisibleToUser;
    private static final SemanticsPropertyKey IsDialog;
    private static final SemanticsPropertyKey IsPopup;
    private static final SemanticsPropertyKey LiveRegion;
    private static final SemanticsPropertyKey PaneTitle;
    private static final SemanticsPropertyKey Password;
    private static final SemanticsPropertyKey ProgressBarRangeInfo;
    private static final SemanticsPropertyKey Role;
    private static final SemanticsPropertyKey SelectableGroup;
    private static final SemanticsPropertyKey Selected;
    private static final SemanticsPropertyKey StateDescription;
    private static final SemanticsPropertyKey TestTag;
    private static final SemanticsPropertyKey Text;
    private static final SemanticsPropertyKey TextSelectionRange;
    private static final SemanticsPropertyKey ToggleableState;
    private static final SemanticsPropertyKey VerticalScrollAxisRange;

    static {
        SemanticsProperties.INSTANCE = new SemanticsProperties();
        SemanticsProperties.ContentDescription = new SemanticsPropertyKey("ContentDescription", SemanticsProperties.ContentDescription.1.INSTANCE);
        SemanticsProperties.StateDescription = new SemanticsPropertyKey("StateDescription", null, 2, null);
        SemanticsProperties.ProgressBarRangeInfo = new SemanticsPropertyKey("ProgressBarRangeInfo", null, 2, null);
        SemanticsProperties.PaneTitle = new SemanticsPropertyKey("PaneTitle", SemanticsProperties.PaneTitle.1.INSTANCE);
        SemanticsProperties.SelectableGroup = new SemanticsPropertyKey("SelectableGroup", null, 2, null);
        SemanticsProperties.CollectionInfo = new SemanticsPropertyKey("CollectionInfo", null, 2, null);
        SemanticsProperties.CollectionItemInfo = new SemanticsPropertyKey("CollectionItemInfo", null, 2, null);
        SemanticsProperties.Heading = new SemanticsPropertyKey("Heading", null, 2, null);
        SemanticsProperties.Disabled = new SemanticsPropertyKey("Disabled", null, 2, null);
        SemanticsProperties.LiveRegion = new SemanticsPropertyKey("LiveRegion", null, 2, null);
        SemanticsProperties.Focused = new SemanticsPropertyKey("Focused", null, 2, null);
        SemanticsProperties.InvisibleToUser = new SemanticsPropertyKey("InvisibleToUser", SemanticsProperties.InvisibleToUser.1.INSTANCE);
        SemanticsProperties.HorizontalScrollAxisRange = new SemanticsPropertyKey("HorizontalScrollAxisRange", null, 2, null);
        SemanticsProperties.VerticalScrollAxisRange = new SemanticsPropertyKey("VerticalScrollAxisRange", null, 2, null);
        SemanticsProperties.IsPopup = new SemanticsPropertyKey("IsPopup", SemanticsProperties.IsPopup.1.INSTANCE);
        SemanticsProperties.IsDialog = new SemanticsPropertyKey("IsDialog", SemanticsProperties.IsDialog.1.INSTANCE);
        SemanticsProperties.Role = new SemanticsPropertyKey("Role", SemanticsProperties.Role.1.INSTANCE);
        SemanticsProperties.TestTag = new SemanticsPropertyKey("TestTag", SemanticsProperties.TestTag.1.INSTANCE);
        SemanticsProperties.Text = new SemanticsPropertyKey("Text", SemanticsProperties.Text.1.INSTANCE);
        SemanticsProperties.EditableText = new SemanticsPropertyKey("EditableText", null, 2, null);
        SemanticsProperties.TextSelectionRange = new SemanticsPropertyKey("TextSelectionRange", null, 2, null);
        SemanticsProperties.ImeAction = new SemanticsPropertyKey("ImeAction", null, 2, null);
        SemanticsProperties.Selected = new SemanticsPropertyKey("Selected", null, 2, null);
        SemanticsProperties.ToggleableState = new SemanticsPropertyKey("ToggleableState", null, 2, null);
        SemanticsProperties.Password = new SemanticsPropertyKey("Password", null, 2, null);
        SemanticsProperties.Error = new SemanticsPropertyKey("Error", null, 2, null);
        SemanticsProperties.IndexForKey = new SemanticsPropertyKey("IndexForKey", null, 2, null);
    }

    public final SemanticsPropertyKey getCollectionInfo() {
        return SemanticsProperties.CollectionInfo;
    }

    public final SemanticsPropertyKey getCollectionItemInfo() {
        return SemanticsProperties.CollectionItemInfo;
    }

    public final SemanticsPropertyKey getContentDescription() {
        return SemanticsProperties.ContentDescription;
    }

    public final SemanticsPropertyKey getDisabled() {
        return SemanticsProperties.Disabled;
    }

    public final SemanticsPropertyKey getEditableText() {
        return SemanticsProperties.EditableText;
    }

    public final SemanticsPropertyKey getError() {
        return SemanticsProperties.Error;
    }

    public final SemanticsPropertyKey getFocused() {
        return SemanticsProperties.Focused;
    }

    public final SemanticsPropertyKey getHeading() {
        return SemanticsProperties.Heading;
    }

    public final SemanticsPropertyKey getHorizontalScrollAxisRange() {
        return SemanticsProperties.HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey getImeAction() {
        return SemanticsProperties.ImeAction;
    }

    public final SemanticsPropertyKey getIndexForKey() {
        return SemanticsProperties.IndexForKey;
    }

    public final SemanticsPropertyKey getInvisibleToUser() {
        return SemanticsProperties.InvisibleToUser;
    }

    @ExperimentalComposeUiApi
    public static void getInvisibleToUser$annotations() {
    }

    public final SemanticsPropertyKey getIsDialog() {
        return SemanticsProperties.IsDialog;
    }

    public final SemanticsPropertyKey getIsPopup() {
        return SemanticsProperties.IsPopup;
    }

    public final SemanticsPropertyKey getLiveRegion() {
        return SemanticsProperties.LiveRegion;
    }

    public final SemanticsPropertyKey getPaneTitle() {
        return SemanticsProperties.PaneTitle;
    }

    public final SemanticsPropertyKey getPassword() {
        return SemanticsProperties.Password;
    }

    public final SemanticsPropertyKey getProgressBarRangeInfo() {
        return SemanticsProperties.ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey getRole() {
        return SemanticsProperties.Role;
    }

    public final SemanticsPropertyKey getSelectableGroup() {
        return SemanticsProperties.SelectableGroup;
    }

    public final SemanticsPropertyKey getSelected() {
        return SemanticsProperties.Selected;
    }

    public final SemanticsPropertyKey getStateDescription() {
        return SemanticsProperties.StateDescription;
    }

    public final SemanticsPropertyKey getTestTag() {
        return SemanticsProperties.TestTag;
    }

    public final SemanticsPropertyKey getText() {
        return SemanticsProperties.Text;
    }

    public final SemanticsPropertyKey getTextSelectionRange() {
        return SemanticsProperties.TextSelectionRange;
    }

    public final SemanticsPropertyKey getToggleableState() {
        return SemanticsProperties.ToggleableState;
    }

    public final SemanticsPropertyKey getVerticalScrollAxisRange() {
        return SemanticsProperties.VerticalScrollAxisRange;
    }
}

