// 函数: _ZN14ascensionrules17CStateProcessGame11UpdateStateER13CStateMachine
// 地址: 0x153678
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *__stack_chk_guard

if (*(arg1 + 0x30) == 0)
    CState::DeleteState(*(arg1 + 0x3c))
    char* r6_1 = *(arg1 + 0x38)
    *(arg1 + 0x3c) = 0
    
    if (zx.d(r6_1[0xb1c]) == 0 && *(r6_1 + 0xb0c) s< 1)
        if (zx.d(*(arg1 + 0x40)) == 0 && zx.d(r6_1[0xa2d]) != 0)
            int32_t* i = *(r6_1 + 0x18)
            
            if (i != *(r6_1 + 0x1c))
                do
                    *i
                    CState* j_2 = ascension::CPlayer::GetNextPendingAsyncState()
                    
                    if (j_2 != 0)
                        CState* j_1 = j_2
                        CState* j
                        
                        do
                            if (ascensionrules::IsProcessPendingAsyncResolveEffectAtEndOfGame(j_1)
                                    == 0)
                                CState::DeleteState(j_1)
                            else
                                CState::AddOwnedChild(arg1)
                                CStateList::AppendState(arg1)
                            
                            j = ascension::CPlayer::GetNextPendingAsyncState()
                            j_1 = j
                        while (j != 0)
                    
                    i = &i[1]
                while (i != *(*(arg1 + 0x38) + 0x1c))
            
            *(arg1 + 0x40) = 1
            goto label_1536b4
        
        core::CWorldBase::OutputMessageFormat(r6_1, "\n\nThe game is over!\n")
        int32_t var_38_1 = 0
        ascension::CWorld::OutputEvent(*(arg1 + 0x38), 0x23, 0, 0)
        int32_t var_2c_1 = 0
        int32_t* var_30 = nullptr
        int32_t var_28_1 = 0
        ascension::CWorld::CalculateResultOrder(*(arg1 + 0x38), &var_30, 1)
        int32_t* r6_2 = var_30
        int32_t r0_18 = var_2c_1
        
        if (r6_2 != r0_18)
            do
                *r6_2
                core::CWorldBase::AddResultPlayer(*(arg1 + 0x38))
                r0_18 = var_2c_1
                r6_2 = &r6_2[1]
            while (r6_2 != r0_18)
            
            r6_2 = var_30
        
        if (r0_18 != r6_2)
            core::CWorldBase::OutputMessageFormat(*(arg1 + 0x38), "%s wins!\n", *r6_2 + 0x10)
        
        core::CWorldBase::SetGameComplete((*(arg1 + 0x38)).b)
        int32_t* r0_22 = var_30
        
        if (r0_22 != 0)
            int32_t* var_2c_2 = r0_22
            operator delete(r0_22)
        
        goto label_1536b0
    
    void** r0_8 = operator new(0x3c)
    CState::CState()
    *r0_8 = _vtable_for_ascensionrules::CStateProcessRound + 8
    r0_8[0xc] = r6_1
    r0_8[0xd] = 0
    r0_8[0xe] = 0
    *(arg1 + 0x3c) = r0_8
    CState* entry_r1
    
    if (*__stack_chk_guard == r0)
        return CStateMachine::PushState(entry_r1) __tailcall
else
label_1536b0:
    CStateList::UpdateState(arg1)
label_1536b4:
    int32_t r0_3 = *__stack_chk_guard
    
    if (r0_3 == r0)
        return r0_3 - r0

__stack_chk_fail()
noreturn
