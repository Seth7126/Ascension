// 函数: _ZN14ascensionrules18PopResolvingTrophyEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x113218
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r5 = *(arg5 + 0x10)

if (ascension::CWorld::IsResolveEffect(arg2) != 0)
    ascension::CWorld::PopResolveEffect(arg2)

int32_t var_20 = 0
return ascension::CWorld::OutputAnimationCard(arg2, r5, 1, 0xb, 0, 5, zx.d(*(arg5 + 8)), 0)
