// 函数: _ZN14ascensionrules24CStateMayDoubleHonorGain11UpdateStateER13CStateMachine
// 地址: 0x154f5c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0 && zx.d(*(arg1 + 0x258)) == 0)
    int32_t var_1c_1 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa0f0, "Double Honor Reward", 
        ascensionrules::CStateMayDoubleHonorGain::SelectDoubleHonorGain)
    int32_t var_1c_2 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa0f1, "Pass", 
        ascensionrules::CStateMayDoubleHonorGain::SelectPass)
    int32_t entry_r1
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Double the Honor Reward?")

return CGameStateOptions::UpdateState(arg1) __tailcall
