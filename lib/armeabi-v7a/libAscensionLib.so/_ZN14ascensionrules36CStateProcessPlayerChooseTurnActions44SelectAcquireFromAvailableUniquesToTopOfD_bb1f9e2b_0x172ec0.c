// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions44SelectAcquireFromAvailableUniquesToTopOfDeckER13CStateMachineP6CStateiPj
// 地址: 0x172ec0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r10 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r9 = *(r10 + 4)
core::CInstance* result = core::CWorldBase::GetInstanceByID(r9)

if (result != 0)
    core::CInstance* result_1 = result
    result = *(arg2 + 0x254)
    
    if (result s>= 1)
        int32_t r7_1 = 0
        int32_t r1_1 = 0
        
        do
            void* r5_1 = arg2 + r7_1
            
            if (*(r5_1 + 0x258) == result_1)
                void* r0_1 = *(r5_1 + 0x298)
                
                if (r0_1 == 0xffffffff)
                    r0_1 = memchr(r5_1 + 0x278, 2, *(r5_1 + 0x274)) - (r5_1 + 0x278)
                
                if (zx.d(*(arg2 + (r0_1 << 1) + r7_1 + 0x288)) != 0)
                    core::CWorldBase::GetInstanceByID(r9)
                    ascension::CWorld::PlayActiveEffect(r9)
                
                int32_t r8_2 = *(r5_1 + 0x26c)
                
                if (r8_2 s< 1 || zx.d(*(r9 + 0xb3d)) == 0 || *(r9 + 0xb48) s< 1)
                    ascension::CPlayer::RemoveInsightCount(r10)
                else
                    uint32_t r0_11 = zx.d(*(r9 + 0xb29))
                    
                    if (r0_11 != 0)
                        r0_11 = 8
                    
                    ascensionrules::CreateStateMustPayResources(r10, result_1, 0, 0, r8_2, r0_11, 
                        8, 0)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                int32_t var_38_2 = r8_2
                ascension::CWorld::OutputEvent(r9, 0x43, zx.d(*(r10 + 8)), zx.d(*(result_1 + 8)))
                ascensionrules::CreateStateProcessAcquireCardSequence(r10, result_1, 0x1b, 0, 2, 
                    nullptr, 0)
                CState::AddOwnedChild(arg2)
                return CStateList::AppendState(arg2) __tailcall
            
            r1_1 += 1
            r7_1 += 0x44
        while (r1_1 s< result)

return result
