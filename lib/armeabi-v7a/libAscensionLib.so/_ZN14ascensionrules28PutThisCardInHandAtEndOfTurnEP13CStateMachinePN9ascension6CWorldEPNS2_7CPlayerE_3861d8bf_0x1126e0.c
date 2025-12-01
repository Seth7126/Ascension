// 函数: _ZN14ascensionrules28PutThisCardInHandAtEndOfTurnEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1126e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg5 == 0)
    return 

int32_t r0 = *(arg2 + 0xbd8)
int32_t r2 = *(arg2 + 0xbdc)

if (r2 != r0)
    int32_t i = 0
    
    do
        if (*(r0 + (i << 3)) == arg5 && *(r0 + (i << 3) + 4) == 7)
            return 
        
        i += 1
    while (i u< (r2 - r0) s>> 3)

ascension::CWorld::SetPlayedCardsFlags(arg2, arg5)
