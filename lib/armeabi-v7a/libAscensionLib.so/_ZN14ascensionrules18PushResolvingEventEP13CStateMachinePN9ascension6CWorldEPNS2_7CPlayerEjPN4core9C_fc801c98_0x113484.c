// 函数: _ZN14ascensionrules18PushResolvingEventEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x113484
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = *(arg2 + 0xa6c)

if (result == 0)
    return result

int32_t lr
int32_t var_4 = lr
uint32_t r5 = *(result + 0x10)
ascension::CWorld::PushResolveEffect(arg2, r5)
int32_t var_18 = 0
ascension::CWorld::OutputAnimationCard(arg2, r5, 7, 0xd, 0, 0xb, 0, 0)
return ascension::CWorld::OutputPauseForAllAnimation() __tailcall
