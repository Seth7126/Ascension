// 函数: _ZN14ascensionrules44CStateProcessDiscardAllButOneConstructInPlay11UpdateStateER13CStateMachine
// 地址: 0x13ed94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (zx.d(*(arg1 + 0x250)) != 0)
    int32_t* r6_1 = *(arg1 + 0x2a4)
    int32_t r0_1 = *(arg1 + 0x2a8)
    *(arg1 + 0x250) = 0
    
    if (r6_1 != r0_1)
        int32_t result
        
        do
            int32_t r7_1 = *r6_1
            int32_t r4_1 = *(arg1 + 0x24c)
            void** r0_2 = operator new(0x3c)
            CState::CState()
            *r0_2 = _vtable_for_ascensionrules::CStateDiscardConstruct + 8
            r0_2[0xc] = r4_1
            r0_2[0xd] = r7_1
            r0_2[0xe].b = 0
            CState::AddOwnedChild(arg1)
            CStateList::AppendState(arg1)
            result = *(arg1 + 0x2a8)
            r6_1 = &r6_1[1]
        while (r6_1 != result)
        
        return result

return CGameStateOptions::UpdateState(arg1) __tailcall
