// 函数: _ZN14ascensionrules22CStateMustPayResources15BuildOptionListER13CStateMachine
// 地址: 0x1522c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = *(arg1 + 0x250)
uint16_t r1 = 0

if (r2 != 0)
    r1 = *(r2 + 8)

int32_t var_14 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, r1, 0xa0c0, "Pay Resources", 
    ascensionrules::CStateMustPayResources::SelectPay)
*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
