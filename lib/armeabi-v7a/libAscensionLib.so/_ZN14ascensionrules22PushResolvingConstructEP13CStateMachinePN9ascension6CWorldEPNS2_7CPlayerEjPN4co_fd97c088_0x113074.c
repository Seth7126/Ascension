// 函数: _ZN14ascensionrules22PushResolvingConstructEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x113074
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6 = *(arg5 + 0xc)
uint32_t r5 = *(r6 + 0x10)
ascension::CWorld::PushResolveEffect(arg2, r5)
int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(arg2, r5, 1, 4, zx.d(*(r6 + 8)), 0xb, 0, 0)
return ascension::CWorld::OutputPauseForAllAnimation() __tailcall
