// 函数: _ZN14ascensionrules25TriggerPushResolvingEventEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11c914
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r4 = *(arg3 + 4)
uint32_t r5 = *(arg3 + 0x10)
ascension::CWorld::PushResolveEffect(r4, r5)
int32_t var_18 = 0
ascension::CWorld::OutputAnimationCard(r4, r5, 7, 0xd, 0, 0xb, 0, 0)
return ascension::CWorld::OutputPauseForAllAnimation() __tailcall
