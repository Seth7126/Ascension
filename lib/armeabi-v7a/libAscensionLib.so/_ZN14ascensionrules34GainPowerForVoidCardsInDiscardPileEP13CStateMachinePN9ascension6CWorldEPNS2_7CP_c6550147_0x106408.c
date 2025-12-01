// 函数: _ZN14ascensionrules34GainPowerForVoidCardsInDiscardPileEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x106408
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg3 + 0x40)
int32_t r7 = 0
int32_t* i = *(r0 + 0xc)

if (i != *(r0 + 0x10))
    do
        int32_t r2 = *i
        i = &i[1]
        r7 += ascension::CWorld::QueryCardFaction(arg2, arg3, r2)
    while (i != *(*(arg3 + 0x40) + 0x10))

core::CInstance* r7_1 = r7 * arg4
ascension::CWorld::OutputAnimationPower(arg2, r7_1, arg5)
ascension::CWorld::AddCurrentTurnPower(arg2)
return core::CWorldBase::OutputMessageFormat(arg2, "%s gains %d power\n", (*(*arg3 + 0xc))(arg3), 
    r7_1) __tailcall
