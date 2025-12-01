// 函数: _ZN14ascensionrules31CStatePlayPhantasmFromCenterRow11UpdateStateER13CStateMachine
// 地址: 0x16a508
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
CState::DeleteState(*(arg1 + 0x98))
ascension::CPlayer* r4 = *(arg1 + 0x30)
int32_t r1 = *(arg1 + 0x3c)
*(arg1 + 0x98) = 0
ascension::CWorld* result = *(r4 + 4)
*(arg1 + 0x3c) = r1 + 1
CState* entry_r1

if (r1 u> 3)
    return CStateMachine::PopState(entry_r1)

switch (r1)
    case 0
        ascensionrules::CreateStateRemoveCenterRowCard(r4, *(arg1 + 0x34), nullptr, true, false, 0, 
            0, false, nullptr, nullptr, 0, nullptr, 0)
        return CStateMachine::PushState(entry_r1) __tailcall
    case 1
        void* r1_5 = *(arg1 + 0x38)
        *(arg1 + 0x94) = 1
        *(arg1 + 0x8c) = r4
        *(arg1 + 0x90) = r1_5
        
        if (zx.d(*(*(r1_5 + 0xc) + 0xca)) == 0)
            *(arg1 + 0x98) =
                ascensionrules::CreateStatePreHandleEvent(result, arg1 + 0x40, arg1 + 0x9c, 0x800)
            return CStateMachine::PushState(entry_r1) __tailcall
    case 2
        core::CInstance* r3_1 = *(arg1 + 0x38)
        ascension::CEffect* r2_2 = *(*(r3_1 + 0xc) + 0xe8)
        
        if (r2_2 != 0)
            *(arg1 + 0x98) = ascensionrules::CreateStateProcessCardEffect(result, r4, r2_2, r3_1, 
                arg1 + 0x40, arg1 + 0x9c, 0x800)
            return CStateMachine::PushState(entry_r1) __tailcall
    case 3
        bool r2_4
        
        if (zx.d(*(*(*(arg1 + 0x38) + 0xc) + 0xca)) != 0)
            r2_4 = true
        else
            r2_4 = false
        
        *(arg1 + 0x98) =
            ascensionrules::CreateStateHandleEvent(result, arg1 + 0x40, r2_4, 0, arg1 + 0x9c, 0x800)
        return CStateMachine::PushState(entry_r1) __tailcall

return result
