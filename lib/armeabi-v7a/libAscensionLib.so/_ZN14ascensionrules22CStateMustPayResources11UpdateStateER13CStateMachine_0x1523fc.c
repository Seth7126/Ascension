// 函数: _ZN14ascensionrules22CStateMustPayResources11UpdateStateER13CStateMachine
// 地址: 0x1523fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0 && zx.d(*(arg1 + 0x26c)) == 0)
    void* r2_1 = *(arg1 + 0x250)
    uint16_t r1 = 0
    
    if (r2_1 != 0)
        r1 = *(r2_1 + 8)
    
    int32_t var_14_1 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, r1, 0xa0c0, "Pay Resources", 
        ascensionrules::CStateMustPayResources::SelectPay)
    int32_t entry_r1
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "You Must Pay the Cost")

return CGameStateOptions::UpdateState(arg1) __tailcall
