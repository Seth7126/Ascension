// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions35SelectAcquireFromDreamscapeIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x1734fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r9 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r7 = *(r9 + 4)
core::CInstance* result = core::CWorldBase::GetInstanceByID(r7)

if (result != 0)
    core::CInstance* result_1 = result
    result = *(arg2 + 0x254)
    
    if (result s>= 1)
        int32_t r5_1 = 0
        int32_t r1_1 = 0
        
        do
            void* r10_1 = arg2 + r5_1
            
            if (*(r10_1 + 0x258) == result_1)
                void* r2_1 = *(r10_1 + 0x298)
                
                if (r2_1 == 0xffffffff)
                    r2_1 = memchr(r10_1 + 0x278, 4, *(r10_1 + 0x274)) - (r10_1 + 0x278)
                
                int32_t r8_2 = *(r10_1 + 0x26c)
                uint32_t r3 = zx.d(*(arg2 + r2_1 + r5_1 + 0x280))
                void* r10_2
                
                if (r8_2 s< 1 || zx.d(*(r7 + 0xb3d)) == 0 || *(r7 + 0xb48) s< 1)
                    result = *(r9 + 0x8c)
                    
                    if (r8_2 + r3 s<= result)
                        r10_2 = r2_1
                        ascension::CPlayer::RemoveInsightCount(r9)
                    label_1736c0:
                        int32_t var_40_3 = r8_2
                        ascension::CWorld::OutputEvent(r7, 0x1b, zx.d(*(r9 + 8)), 
                            zx.d(*(result_1 + 8)))
                        
                        if (zx.d(*(arg2 + (r10_2 << 1) + r5_1 + 0x288)) != 0)
                            core::CWorldBase::GetInstanceByID(r7)
                            ascension::CWorld::PlayActiveEffect(r7)
                        
                        ascensionrules::CreateStateProcessAcquireCardSequence(r9, result_1, 0x14, 
                            zx.d(*(r9 + 8)), 4, nullptr, 0)
                        CState::AddOwnedChild(arg2)
                        return CStateList::AppendState(arg2) __tailcall
                    
                    break
                
                uint32_t r12_1 = zx.d(*(r7 + 0xb29))
                r10_2 = r2_1
                
                if (r12_1 != 0)
                    r12_1 = 8
                
                int32_t var_40_1
                uint32_t var_3c_1
                
                if (*(r7 + 0x30) u< 0x18)
                    int32_t var_30_1 = ascensionrules::CreateStateMustPayResources(r9, result_1, 0, 
                        0, r8_2, r12_1, 8, 0)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                    var_40_1 = r3
                    var_3c_1 = r12_1
                    int32_t var_38_2 = 8
                else
                    var_40_1 = r8_2 + r3
                    var_3c_1 = r12_1
                    int32_t var_38_1 = 8
                
                int32_t var_28_2 = ascensionrules::CreateStateMustPayResources(r9, result_1, 0, 0, 
                    var_40_1, var_3c_1, 8, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
                goto label_1736c0
            
            r1_1 += 1
            r5_1 += 0x44
        while (r1_1 s< result)

return result
