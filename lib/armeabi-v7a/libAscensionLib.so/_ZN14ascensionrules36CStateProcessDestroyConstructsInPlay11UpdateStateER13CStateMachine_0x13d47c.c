// 函数: _ZN14ascensionrules36CStateProcessDestroyConstructsInPlay11UpdateStateER13CStateMachine
// 地址: 0x13d47c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    if (zx.d(*(arg1 + 0x2b8)) != 0)
        int32_t* i = *(arg1 + 0x2ac)
        int32_t r0_5 = *(arg1 + 0x2b0)
        *(arg1 + 0x2b8) = 0
        
        if (i != r0_5)
            do
                int32_t r7_1 = *i
                int32_t r4_1 = *(arg1 + 0x24c)
                void** r0_6 = operator new(0x3c)
                CState::CState()
                *r0_6 = _vtable_for_ascensionrules::CStateDiscardConstruct + 8
                r0_6[0xc] = r4_1
                r0_6[0xd] = r7_1
                r0_6[0xe].b = 0
                CState::AddOwnedChild(arg1)
                CStateList::AppendState(arg1)
                i = &i[1]
            while (i != *(arg1 + 0x2b0))
            
            int32_t* r0_10 = *(arg1 + 0x254)
            
            if (r0_10 != 0)
                void* r2_3 = r0_10 + *r0_10 + 4
                uint32_t r1_5 = zx.d(*r2_3)
                
                if (r1_5 u<= 7)
                    *r2_3 = r1_5.b + 1
                    r0_10[*r0_10 * 8 + r1_5 + 4] = 1
            
            int32_t result = *(arg1 + 0x2ac)
            *(arg1 + 0x2b0) = result
            return result
    
    if (*(arg1 + 0x258) s< *(arg1 + 0x250))
        ascensionrules::CStateProcessDestroyConstructsInPlay::BuildDestroyOptions(arg1)

return CGameStateOptions::UpdateState(arg1) __tailcall
