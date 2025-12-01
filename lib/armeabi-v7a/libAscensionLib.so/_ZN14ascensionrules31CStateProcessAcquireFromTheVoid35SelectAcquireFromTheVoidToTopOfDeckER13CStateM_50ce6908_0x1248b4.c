// 函数: _ZN14ascensionrules31CStateProcessAcquireFromTheVoid35SelectAcquireFromTheVoidToTopOfDeckER13CStateMachineP6CStateiPj
// 地址: 0x1248b4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (arg3 != 0)
    int32_t r0_1 = *(arg2 + 0x258)
    
    if (r0_1 s>= 1)
        core::CCardInstance* r12_1 = *(arg2 + 0x24c)
        ascension::CActiveEffectInstance* r10_1 = *(r12_1 + 4)
        int32_t* r9_1 = *(arg2 + 0x25c) + 0x40
        int32_t r1_1 = 0
        
        do
            if (*(r9_1 - 0x40) == arg3)
                void* r6_1 = *(arg3 + 0xc)
                void* r1_2 = *r9_1
                uint32_t __n = *(r9_1 - 0x24)
                int32_t r1_3 = *(r6_1 + 0x88)
                int32_t r0_2 = *(r9_1 - 0x34)
                uint32_t r7_1 = zx.d(*(r9_1 - 0x28))
                int32_t r3 = *(r6_1 + 0xa0)
                core::CCardInstance* var_30_1 = r12_1
                int32_t var_2c_1
                
                if (r1_3 == 1)
                    if (zx.d(*(r10_1 + 0xb2c)) != 0)
                        int32_t r1_7 = *(r6_1 + 0xa4) + r0_2 - *(r9_1 - 0x38)
                        
                        if (r0_2 s> r1_7)
                            r0_2 = r1_7 & not.d(r1_7 s>> 0x1f)
                            r3 = 0
                    
                    var_2c_1 = r0_2
                    
                    if (r3 s>= 1)
                        goto label_1249d0
                    
                    goto label_1249e8
                
                var_2c_1 = r0_2
                
                if (r1_3 == 2)
                    if (ascension::CWorld::QueryCardFaction(r10_1, r12_1, arg3) != 0)
                        ascension::CWorld::RemoveCurrentTurnRunesForMechanaConstruct(r10_1)
                    
                    r12_1 = var_30_1
                
                uint32_t r0_6
                uint32_t r7_2
                
                if (r3 s< 1)
                label_1249e8:
                    r0_6 = 0
                    
                    if (r7_1 != 0 || zx.d(*(r6_1 + 0xd5)) != 0 || zx.d(*(r10_1 + 0xb2b)) != 0)
                        r7_2 = 2
                    else
                        r7_2 = 0
                else
                label_1249d0:
                    r0_6 = zx.d(*(r10_1 + 0xb29))
                    
                    if (r0_6 != 0)
                        r0_6 = 4
                    
                    if (r7_1 != 0 || zx.d(*(r6_1 + 0xd5)) != 0 || zx.d(*(r10_1 + 0xb2b)) != 0)
                        r7_2 = 2
                    else
                        r7_2 = 0
                
                uint32_t r2_3 = 0
                uint32_t r1_12 = 0
                
                if (zx.d(*(r6_1 + 0xd6)) == 0)
                    goto label_124a4c
                
                uint32_t r6_3
                
                if (zx.d(*(r10_1 + 0xb3d)) != 0)
                    r1_12 = 2
                    r6_3 = 2
                    
                    if (*(r10_1 + 0x30) u<= 0x17)
                        goto label_124a4c
                    
                    goto label_124a5c
                
                r1_12 = 2
            label_124a4c:
                r6_3 = r7_2
                
                if (r7_2 != 0)
                label_124a5c:
                    r2_3 = r6_3
                    
                    if (*(r10_1 + 0xb48) s> 0)
                        goto label_124ab4
                
                if (r1_12 == 0 || *(r12_1 + 0x8c) s<= 0)
                    if (r0_6 != 0)
                        r6_3 = r2_3
                    
                    if (r0_6 != 0 && *(r10_1 + 0xb40) s>= 1)
                        goto label_124ab4
                    
                    ascension::CWorld::RemoveCurrentTurnRunes(r10_1)
                    
                    if (r3 s>= 1)
                        ascension::CWorld::RemoveCurrentTurnPower(r10_1)
                else
                    r6_3 = r2_3
                label_124ab4:
                    ascensionrules::CreateStateMustPayResources(r12_1, arg3, var_2c_1, r3, 0, r0_6, 
                        r6_3, r1_12)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                if (ascension::CWorld::RemoveCardFromVoid(r10_1) != 0)
                    void* r0_13 = r1_2
                    
                    if (r0_13 == 0xffffffff)
                        r0_13 = memchr(r9_1 - 0x20, 2, __n) - (r9_1 - 0x20)
                    
                    if (zx.d(*(r9_1 + (r0_13 << 1) - 0x10)) != 0)
                        core::CWorldBase::GetInstanceByID(r10_1)
                        ascension::CWorld::PlayActiveEffect(r10_1)
                    
                    int32_t var_4c_2 = 2
                    ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
                        operator new(0x990), var_30_1, arg3, 9, 0)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                break
            
            r1_1 += 1
            r9_1 = &r9_1[0x11]
        while (r1_1 s< r0_1)

int32_t r0_24 = *__stack_chk_guard

if (r0_24 == r0)
    return r0_24 - r0

__stack_chk_fail()
noreturn
