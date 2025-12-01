// 函数: _ZN14ascensionrules39TriggerPopResolveEffectFromAcquiredCardEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11c87c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* result = *(arg4 + 4)

if (result == 0x12)
    result = *(arg4 + 0x4c)
    
    if (result != 0)
        core::CCardInstance* r5_1 = *(result + 4)
        int32_t r1 = *(r5_1 + 0xbdc)
        
        if (*(r5_1 + 0xbd8) != r1 && *(r1 - 8) == arg3)
            int32_t var_18 = 0
            ascension::CWorld::OutputAnimationCard(r5_1, arg3, 1, 0xb, 0, *(arg4 + 0x58), 
                zx.d(*(result + 8)), 0)
            return ascension::CWorld::PopResolveEffect(r5_1) __tailcall

return result
