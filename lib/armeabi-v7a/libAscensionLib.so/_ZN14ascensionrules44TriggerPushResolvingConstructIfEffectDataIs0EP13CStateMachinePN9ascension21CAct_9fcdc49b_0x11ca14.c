// 函数: _ZN14ascensionrules44TriggerPushResolvingConstructIfEffectDataIs0EP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11ca14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = ascension::CCardInPlayInstance::GetEffectData(arg3)

if (result s> 0)
    return result

core::CCardInstance* r5 = *(*(arg3 + 0xc) + 4)
ascension::CWorld::PushResolveEffect(r5, *(arg3 + 0x10))
int32_t var_18 = 0
ascension::CWorld::OutputAnimationCard(r5, *(arg3 + 0x10), 1, 4, zx.d(*(arg3 + 8)), 0xb, 0, 0)
return ascension::CWorld::OutputPauseForAllAnimation() __tailcall
