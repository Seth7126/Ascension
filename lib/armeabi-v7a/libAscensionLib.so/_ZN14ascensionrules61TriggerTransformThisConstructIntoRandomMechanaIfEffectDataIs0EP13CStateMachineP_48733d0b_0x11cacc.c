// 函数: _ZN14ascensionrules61TriggerTransformThisConstructIntoRandomMechanaIfEffectDataIs0EP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11cacc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (ascension::CCardInPlayInstance::GetEffectData(arg3) s<= 0)
    ascension::CPlayer* r6_1 = *(arg3 + 0xc)
    core::CCardInstance* r5_1 = *(arg3 + 0x10)
    
    if (ascension::CPlayer::RemoveConstructFromPlay(r6_1) != 0)
        int32_t r7_1 = 0
        core::CCardInstance* r6_2 = *(r6_1 + 4)
        char* r0_5 = *(r6_2 + 0xa28)
        int32_t var_12c[0x40]
        
        for (int32_t* i = *(r6_2 + 0xad4); i != *(r6_2 + 0xad8); i = &i[1])
            void* r4_1 = *i
            
            if (ascension::CCard::IsCardFaction(r4_1) != 0 && *(r4_1 + 0x98) s>= 7)
                var_12c[r7_1] = r4_1
                r7_1 += 1
        
        int32_t* i_1 = *(r6_2 + 0xae0)
        core::CCardInstance* r5_2
        
        if (i_1 == *(r6_2 + 0xae4))
            r5_2 = r5_1
            
            if (r7_1 s>= 1)
            label_11cc34:
                void* r0_23 = var_12c[(*(*r6_2 + 0xc))(r6_2, r7_1)]
                
                if (r0_23 != 0)
                    ascensionrules::TransformCard(r6_2, r6_1, r5_2, r0_23 + 4, false)
        else
            r5_2 = r5_1
            
            do
                void* r4_2 = *i_1
                
                if (ascension::CCard::IsCardFaction(r4_2) != 0 && *(r4_2 + 0x98) s>= 7)
                    int32_t r0_15 = *(r4_2 + 0x150)
                    
                    if (r0_15 != 0)
                        var_12c[r7_1] = r0_15
                        r7_1 += 1
                    else if (zx.d(*(r4_2 + 0xa8)) == 0 || (zx.d(*r0_5) & 0x30) != 0)
                        var_12c[r7_1] = r4_2
                        r7_1 += 1
                
                i_1 = &i_1[1]
            while (i_1 != *(r6_2 + 0xae4))
            
            if (r7_1 s>= 1)
                goto label_11cc34
        ascension::CWorld::PopResolveEffect(r6_2)

int32_t r0_26 = *__stack_chk_guard

if (r0_26 == r0)
    return r0_26 - r0

__stack_chk_fail()
noreturn
