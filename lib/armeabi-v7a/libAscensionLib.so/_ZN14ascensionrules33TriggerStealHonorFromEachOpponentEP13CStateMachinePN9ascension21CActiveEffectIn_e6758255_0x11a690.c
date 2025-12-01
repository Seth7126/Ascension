// 函数: _ZN14ascensionrules33TriggerStealHonorFromEachOpponentEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11a690
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r9 = *(arg2 + 0x14)
int32_t r5 = *(r9 + 4)
int32_t result = (*(r5 + 0x1c) - *(r5 + 0x18)) s>> 2

if (result u>= 2)
    int32_t i = 1
    
    do
        int32_t r0_3 = ascension::CWorld::GetPlayerByTurnOrder(r5, r9)
        uint32_t r7_1 = *(r0_3 + 0x90)
        
        if (r7_1 s>= arg5)
            r7_1 = arg5
        
        if (r7_1 s>= 1)
            ascension::CPlayer::RemoveHonorTokens(r0_3)
            ascension::CPlayer::AddHonorTokens(r9)
            ascension::CWorld::AddHonorGainedThisTurn(r5)
            int32_t var_28_1 = 0
            ascension::CWorld::OutputAnimationHonor(r5, r7_1, r9, r0_3)
            core::CWorldBase::OutputMessageFormat(r5, "%s takes %d honor tokens from %s\n", 
                (*(*r9 + 0xc))(r9), r7_1, (*(*r0_3 + 0xc))(r0_3))
        
        i += 1
        result = *(r5 + 0x1c) - *(r5 + 0x18)
    while (i u< result s>> 2)

return result
