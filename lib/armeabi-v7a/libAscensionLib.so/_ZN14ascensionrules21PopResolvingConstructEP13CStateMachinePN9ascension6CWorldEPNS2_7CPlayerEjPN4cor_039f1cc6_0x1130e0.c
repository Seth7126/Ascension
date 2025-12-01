// 函数: _ZN14ascensionrules21PopResolvingConstructEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1130e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6 = *(arg5 + 0xc)
uint32_t r5 = *(r6 + 0x10)

if (ascension::CWorld::IsResolveEffect(arg2) != 0)
    ascension::CWorld::PopResolveEffect(arg2)

ascension::CWorld* r0_6

if (arg4 != 1)
    int32_t var_28_1 = 0
    ascension::CWorld::OutputAnimationCard(arg2, r5, 1, 0xb, 0, 4, zx.d(*(r6 + 8)), 0)
    r0_6 = arg2
else
    int32_t var_28 = 0
    ascension::CWorld::OutputAnimationCard(arg2, r5, 1, 0xb, 0, 3, zx.d(*(arg3 + 8)), 0)
    r0_6 = arg2

return ascension::CWorld::OutputPauseForAnimationToDestination(r0_6) __tailcall
