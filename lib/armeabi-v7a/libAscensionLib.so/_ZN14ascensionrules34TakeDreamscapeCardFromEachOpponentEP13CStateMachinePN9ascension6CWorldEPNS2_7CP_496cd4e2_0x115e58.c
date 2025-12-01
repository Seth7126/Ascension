// 函数: _ZN14ascensionrules34TakeDreamscapeCardFromEachOpponentEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x115e58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int64_t* entry_r10
int64_t* var_c = entry_r10
void* result = *(arg2 + 0x1c) - *(arg2 + 0x18)

if (result s>= 5)
    int32_t r8_1 = result s>> 2
    int32_t r6_1 = 1
    
    do
        core::CCardInstance* r0_2 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        result = *(r0_2 + 0x44)
        
        if (result != 0)
            int32_t r1_2 = *(result + 0x18)
            
            if (r1_2 s>= 1)
                result = (*(*arg2 + 0xc))(arg2, r1_2)
                int32_t* r1_4 = *(r0_2 + 0x44) + 0xc
                int32_t r2_2 = *r1_4
                int32_t temp1_1 = (r1_4[1] - r2_2) s>> 2
                core::CInstance* var_38
                ascension::CEffectInstanceData* var_34
                uint32_t var_30
                
                if (result u>= temp1_1)
                    CStateMachine* r0_20
                    ascension::CWorld* r1_12
                    ascension::CPlayer* r2_4
                    uint32_t r3_3
                    int32_t lr
                    r0_20, r1_12, r2_4, r3_3, lr =
                        std::__ndk1::__vector_base_common<true>::__throw_out_of_range()
                    pc
                    
                    if (result == temp1_1)
                        *entry_r10 = r0_20:pc
                    return ascensionrules::SendPlayHeroEvent(r0_20, r1_12, r2_4, r3_3, var_38, 
                        var_34, var_30) __tailcall
                
                uint32_t r4_1 = *(r2_2 + (result << 2))
                
                if (r4_1 != 0)
                    ascension::CPlayer::RemoveCardFromDreamscape(r0_2)
                    ascension::CPlayer::PutCardInDreamscape(arg3)
                    int32_t r1_7 = zx.d(*(r0_2 + 8))
                    var_30 = zx.d(*(arg3 + 8))
                    var_34 = 0x14
                    int32_t var_28_1 = r1_7
                    ascension::CWorld::OutputAnimationCard(arg2, r4_1, 0, 0x14, r1_7, 0x14, var_30, 
                        8)
                    entry_r10 = (*(*arg3 + 0xc))(arg3)
                    int32_t r0_14 = (*(*r4_1 + 0xc))(r4_1)
                    var_38 = (*(*r0_2 + 0xc))(r0_2)
                    result = core::CWorldBase::OutputMessageFormat(arg2, 
                        "%s takes %s from %s dreamscape\n", entry_r10, r0_14, var_38)
        
        r6_1 += 1
    while (r6_1 s< r8_1)

return result
