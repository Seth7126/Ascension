// 函数: _ZN14ascensionrules23CStateProcessCardEffect11UpdateStateER13CStateMachine
// 地址: 0x14d884
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0)
    ascension::CWorld* r2_1 = *(arg1 + 0x19c)
    ascension::CPlayer* r3_1 = *(arg1 + 0x38)
    core::CInstance* r12_1 = *(arg1 + 0x3c)
    CStateMachine* r0_1 = *(arg1 + 0x40)
    ascension::CEvent* r1 = *(arg1 + 0x44)
    ascension::CEffectInstanceData* lr_2 = *(arg1 + 0x48)
    *(arg1 + 0x4c) = r2_1
    void* __offset(CStateMachine, 0x4c) var_1c_1 = arg1 + 0x4c
    uint32_t entry_r1
    
    if (ascension::CEffect::ProcessEffect(r0_1, entry_r1, r2_1, r3_1, r12_1, r1, lr_2) != 0)
        int32_t result = *(arg1 + 0x19c) + 1
        *(arg1 + 0x19c) = result
        return result

return CStateList::UpdateState(arg1) __tailcall
