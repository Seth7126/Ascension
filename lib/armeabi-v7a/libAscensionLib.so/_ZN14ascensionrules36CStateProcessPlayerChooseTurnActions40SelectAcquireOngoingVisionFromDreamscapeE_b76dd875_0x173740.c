// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions40SelectAcquireOngoingVisionFromDreamscapeER13CStateMachineP6CStateiPj
// 地址: 0x173740
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r5 = *(arg2 + 0x24c)
char* r7 = *(r5 + 4)
core::CInstance* result = core::CWorldBase::GetInstanceByID(r7)

if (result != 0)
    core::CInstance* result_1 = result
    result = *(arg2 + 0x254)
    
    if (result s>= 1)
        void* __offset(CState, 0x26c) r1_1 = arg2 + 0x26c
        int32_t r2 = 0
        
        do
            if (*(r1_1 - 0x14) == result_1)
                int32_t r1_2 = *r1_1
                int32_t var_30
                uint32_t var_2c
                int32_t var_28
                int32_t var_24
                
                if (r1_2 s< 1 || zx.d(r7[0xb3d]) == 0 || *(r7 + 0xb48) s< 1)
                    ascension::CPlayer::RemoveInsightCount(r5)
                else
                    uint32_t r0_3 = zx.d(r7[0xb29])
                    var_30 = r1_2
                    
                    if (r0_3 != 0)
                        r0_3 = 8
                    
                    var_2c = r0_3
                    var_28 = 8
                    var_24 = 0
                    ascensionrules::CreateStateMustPayResources(r5, result_1, 0, 0, var_30, var_2c, 
                        8, 0)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                core::CWorldBase::OutputMessageFormat(r7, "%s acquires %s\n", r5 + 0x10, 
                    (*(*result_1 + 0xc))(result_1), var_30, var_2c, var_28, var_24)
                ascensionrules::CreateStateProcessAcquireCardSequence(r5, result_1, 0x14, 
                    zx.d(*(r5 + 8)), 5, nullptr, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
                CState::CleanupEmbeddedState()
                void** r7_2 = *(arg2 + 0x20)
                CState::CState()
                *r7_2 = _vtable_for_ascensionrules::CStatePlayVisionFromDreamscape + 8
                r7_2[0xc] = r5
                r7_2[0xd] = result_1
                r7_2[0xe] = nullptr
                r7_2[0x20f].b = 0
                r7_2[0x210] = _vtable_for_ascension::CEventAcquireCard + 8
                r7_2[0x211] = 0x12
                r7_2[0x212] = 0
                r7_2[0x223] = r5
                r7_2[0x224] = result_1
                r7_2[0x225] = 0
                r7_2[0x226] = 0
                r7_2[0x227] = 0
                r7_2[0x228].b = 1
                r7_2[0x229] = 0
                r7_2[0xb].b = 0
                CState::SetEmbeddedState(arg2)
                return CStateList::AppendState(arg2) __tailcall
            
            r2 += 1
            r1_1 += 0x44
        while (r2 s< result)

return result
