// 函数: _ZN14ascensionrules27AcquireAllCenterRowTreasureEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10a8e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* result

for (core::CCardInstance* i = nullptr; i != 7; i += 1)
    result = ascension::CWorld::GetCenterRowCardStackList(arg2)
    
    if (result != 0)
        int32_t** result_1 = result
        result = *result
        int32_t r1_1 = result_1[1]
        
        if (r1_1 != result)
            int32_t j = 0
            
            do
                int32_t* r6_1
                
                if (result[j * 2 + 1] == 3)
                    r6_1 = result[j * 2]
                
                if (result[j * 2 + 1] != 3 || r6_1 == 0 || *(r6_1[3] + 0x88) != 6)
                    j += 1
                else
                    ascension::CWorld::RemoveCenterRowCard(arg2, i)
                    int32_t var_40_1 = 0
                    ascension::CWorld::AddToAcquiredCards(arg2, r6_1.b, 7, 3)
                    ascension::CWorld::OutputEvent(arg2, 4, zx.d(*(arg3 + 8)), zx.d(r6_1[2].w))
                    ascension::CPlayer::AddTurnLog(arg3, 3)
                    ascension::CPlayer::AddOwnedCard(arg3)
                    int32_t var_3c
                    uint32_t var_38
                    int32_t var_34
                    int32_t var_30
                    core::CWorldBase::OutputMessageFormat(arg2, "%s acquires %s\n", arg3 + 0x10, 
                        (*(*r6_1 + 0xc))(r6_1), 0, var_3c, var_38, var_34, var_30)
                    var_3c = 3
                    var_38 = zx.d(*(arg3 + 8))
                    var_34 = 0
                    var_30 = 0
                    ascension::CWorld::OutputAnimationCard(arg2, r6_1, 3, 7, i, 3, var_38, 0)
                    ascension::CPlayer::PutCardInDiscard(arg3)
                    result = *result_1
                    r1_1 = result_1[1]
            while (j u< (r1_1 - result) s>> 3)

return result
