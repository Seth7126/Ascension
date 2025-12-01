// 函数: _ZN14ascensionrules22PopResolvingCardInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1132f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r7 = *(arg5 + 0xc)
*(r7 + 0x10)
ascension::CWorld::PopResolveEffect(arg2)
uint32_t r1_1 = *(r7 + 0x10)
ascension::CWorld* r0_4

if (arg4 != 1)
    int32_t var_20_1 = 0
    ascension::CWorld::OutputAnimationCard(arg2, r1_1, 1, 0xb, 0, 5, zx.d(*(r7 + 8)), 0)
    r0_4 = arg2
else
    int32_t var_20 = 0
    ascension::CWorld::OutputAnimationCard(arg2, r1_1, 1, 0xb, 0, 3, zx.d(*(arg3 + 8)), 0)
    r0_4 = arg2

return ascension::CWorld::OutputPauseForAnimationToDestination(r0_4) __tailcall
