// 函数: _ZN9ascension6CWorld16PrepareCenterRowEv
// 地址: 0xf5420
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
core::CCardInstance* entry_r0

if (zx.d(*(entry_r0 + 0xa2c)) == 0)
    *(entry_r0 + 0xa3c)
    core::CCardStack::Shuffle()

int32_t r9 = 0

while (true)
    if (zx.d(*(entry_r0 + 0xa14)) == 0)
        if (*(*(entry_r0 + 0xa3c) + 0x18) == 0)
            ascension::CWorld::ShuffleVoidCardsIntoPortalDeck()
            *(entry_r0 + 0xa3c)
        
        int32_t r0_6 = core::CCardStack::RemoveTopCard()
        
        if (r0_6 == 0)
        labelid_6:
            r9 += 1
        else
            int32_t r6_1 = r0_6
            
            while (*(*(r6_1 + 0xc) + 0x88) == 4)
                int32_t r1_2 = *(entry_r0 + 0xa6c)
                
                if (r1_2 != 0)
                    ascension::CWorld::RemoveEventCardInPlay(entry_r0, r1_2.b)
                
                ascension::CWorld::PutEventCardInPlay(entry_r0)
                
                if (zx.d(*(entry_r0 + 0xa14)) != 0)
                    goto label_f55d8_1
                
                if (*(*(entry_r0 + 0xa3c) + 0x18) == 0)
                    ascension::CWorld::ShuffleVoidCardsIntoPortalDeck()
                    *(entry_r0 + 0xa3c)
                
                int32_t r0_15 = core::CCardStack::RemoveTopCard()
                r6_1 = r0_15
                
                if (r0_15 == 0)
                    goto label_f55d8_1
            
            int32_t var_48 = 0x8000001
            int32_t var_44_1 = 0x8000201
            char var_40_1 = 7
            int32_t var_3c_1 = 0
            int32_t var_38_1 = r9
            int32_t var_30_1 = 0
            uint32_t var_34_1 = zx.d(*(r6_1 + 8))
            int32_t var_2c_1 = 0
            core::CWorldBase::SendStateChange(entry_r0, &var_48)
            int32_t r0_19 = *(*(r6_1 + 0xc) + 0x88)
            
            if (r0_19 != 6)
                if (r9 s>= 0)
                    int32_t r1_9 = *(entry_r0 + 0xa40)
                    
                    if (r9 s< (*(entry_r0 + 0xa44) - r1_9) s>> 2)
                        if (r0_19 == 8)
                            ascension::CWorld::AssignPortalCard(entry_r0)
                            r1_9 = *(entry_r0 + 0xa40)
                        
                        ascension::CCenterRowInstance::PutCardOnTop(*(r1_9 + (r9 << 2)), r6_1)
                
            label_f55d8:
                r9 += 1
            else if (r9 s>= 0)
                int32_t r0_20 = *(entry_r0 + 0xa40)
                
                if (r9 s< (*(entry_r0 + 0xa44) - r0_20) s>> 2)
                    ascension::CCenterRowInstance::PutCardOnTop(*(r0_20 + (r9 << 2)), r6_1)
                    
                    if (r9 s>= 6)
                        break
                    
                    continue
    else
    label_f55d8_1:
        r9 += 1
    
    if (r9 s>= 6)
        break

int32_t r0_25 = *__stack_chk_guard

if (r0_25 == r0)
    return r0_25 - r0

__stack_chk_fail()
noreturn
