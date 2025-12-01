// 函数: _ZN14ascensionrules40TriggerPushResolveEffectFromAcquiredCardEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11c7f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = *(arg4 + 4)

if (result == 0x12)
    void* r7_1 = *(arg4 + 0x4c)
    
    if (r7_1 != 0)
        core::CCardInstance* r6 = *(r7_1 + 4)
        ascension::CWorld::PushResolveEffect(r6, arg3)
        int32_t var_20 = 0
        ascension::CWorld::OutputAnimationCard(r6, arg3, 1, *(arg4 + 0x58), zx.d(*(r7_1 + 8)), 0xb, 
            0, 0)
        return ascension::CWorld::OutputPauseForAnimationToDestination(r6) __tailcall

return result
