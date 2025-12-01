// 函数: _ZN14ascensionrules30CStateProcessOptionalDrawCards15BuildOptionListER13CStateMachine
// 地址: 0x148e30
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r1 = *(arg1 + 0x24c)
void* r0 = *(r1 + 0x38)

if (*(r0 + 0x18) == 0 && *(*(r1 + 0x40) + 0x18) == 0)
    int32_t result = *(arg1 + 0x250)
    *(arg1 + 0x254) = result
    return result

int32_t var_1c = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0 + 8), 0xa035, "Draw Card", 
    ascensionrules::CStateProcessOptionalDrawCards::SelectDrawCard)
int32_t var_1c_1 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 
    ascensionrules::CStateProcessOptionalDrawCards::SelectNone)
*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
