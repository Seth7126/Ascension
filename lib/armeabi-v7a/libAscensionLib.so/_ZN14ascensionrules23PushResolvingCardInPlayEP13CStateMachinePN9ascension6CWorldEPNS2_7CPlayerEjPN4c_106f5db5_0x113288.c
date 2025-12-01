// 函数: _ZN14ascensionrules23PushResolvingCardInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x113288
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r5 = *(arg5 + 0xc)
ascension::CWorld::PushResolveEffect(arg2, *(r5 + 0x10))
int32_t var_18 = 0
ascension::CWorld::OutputAnimationCard(arg2, *(r5 + 0x10), 1, 5, zx.d(*(r5 + 8)), 0xb, 0, 0)
return ascension::CWorld::OutputPauseForAllAnimation() __tailcall
