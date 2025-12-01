// 函数: _ZN14ascensionrules40CStateProcessGainRunesOrAcquireConstruct21SelectAcquireIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x12c294
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r10 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r6 = *(r10 + 4)
core::CInstance* result = ascension::CWorld::GetCenterRowCard(r6)

if (result != 0)
    core::CInstance* result_1 = result
    result = *(arg2 + 0x258)
    
    if (result s>= 1)
        int32_t r5_1 = 0
        int32_t r1_1 = 0
        
        do
            void* r2 = arg2 + r5_1
            
            if (result_1 == *(r2 + 0x25c))
                void* r9 = *(r2 + 0x29c)
                
                if (r9 == 0xffffffff)
                    r9 = memchr(r2 + 0x27c, 4, *(r2 + 0x278)) - (r2 + 0x27c)
                
                uint32_t r1_2 = zx.d(*(arg2 + r9 + r5_1 + 0x284))
                
                if (r1_2 != 0)
                    if (zx.d(*(r6 + 0xb3d)) == 0 || *(r6 + 0xb48) s< 1)
                        ascension::CPlayer::RemoveInsightCount(r10)
                    else
                        uint32_t r0_7 = zx.d(*(r6 + 0xb29))
                        
                        if (r0_7 != 0)
                            r0_7 = 8
                        
                        int32_t var_28_1 = ascensionrules::CreateStateMustPayResources(r10, 
                            result_1, 0, 0, r1_2, r0_7, 8, 0)
                        CState::AddOwnedChild(arg2)
                        CStateList::AppendState(arg2)
                
                if (zx.d(*(arg2 + (r9 << 1) + r5_1 + 0x28c)) != 0)
                    core::CWorldBase::GetInstanceByID(r6)
                    ascension::CWorld::PlayActiveEffect(r6)
                
                uint32_t var_38_2 = zx.d(*(r10 + 8))
                ascension::CWorld::OutputEvent(r6, 5, zx.d(*(*(arg2 + 0x254) + 8)), 
                    zx.d(*(result_1 + 8)))
                int32_t var_34_2 = 4
                ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
                    operator new(0x990), r10, result_1, 7, arg3)
                CState::AddOwnedChild(arg2)
                return CStateList::AppendState(arg2) __tailcall
            
            r1_1 += 1
            r5_1 += 0x44
        while (r1_1 s< result)

return result
