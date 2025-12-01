// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroOrConstruct34SelectAcquireFromCenterRowIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x122498
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r9 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r10 = *(r9 + 4)
core::CInstance* result = ascension::CWorld::GetCenterRowCard(r10)

if (result != 0)
    core::CInstance* result_1 = result
    result = *(arg2 + 0x264)
    
    if (result s>= 1)
        int32_t r6_1 = 0
        int32_t r1_1 = 0
        
        do
            void* r3 = arg2 + r6_1
            
            if (result_1 == *(r3 + 0x268))
                void* r5_1 = *(r3 + 0x2a8)
                void* r0_2 = memchr(r3 + 0x288, 4, *(r3 + 0x284))
                
                if (r5_1 == 0xffffffff)
                    r5_1 = r0_2 - (r3 + 0x288)
                
                uint32_t r1_2 = zx.d(*(arg2 + r5_1 + r6_1 + 0x290))
                
                if (r1_2 != 0)
                    uint32_t r0_6
                    uint32_t r2_2
                    
                    if (zx.d(*(r10 + 0xb3d)) != 0)
                        r2_2 = zx.d(*(r10 + 0xb29))
                        r0_6 = r2_2
                        
                        if (r2_2 != 0)
                            r0_6 = 8
                    
                    if (zx.d(*(r10 + 0xb3d)) == 0
                            || (*(r10 + 0xb48) s<= 0 && (r2_2 == 0 || *(r10 + 0xb40) s< 1)))
                        ascension::CPlayer::RemoveInsightCount(r9)
                    else
                        ascensionrules::CreateStateMustPayResources(r9, result_1, 0, 0, r1_2, r0_6, 
                            8, 0)
                        CState::AddOwnedChild(arg2)
                        CStateList::AppendState(arg2)
                
                if (zx.d(*(arg2 + (r5_1 << 1) + r6_1 + 0x298)) != 0)
                    core::CWorldBase::GetInstanceByID(r10)
                    ascension::CWorld::PlayActiveEffect(r10)
                
                int32_t var_3c_2 = 4
                ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
                    operator new(0x990), r9, result_1, 7, arg3)
                CState::AddOwnedChild(arg2)
                return CStateList::AppendState(arg2) __tailcall
            
            r1_1 += 1
            r6_1 += 0x44
        while (r1_1 s< result)

return result
