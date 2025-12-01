// 函数: _ZN14ascensionrules30TransformIntoOtherworldlyGuideEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x113820
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = *(arg2 + 0xbd8)
int32_t r3 = *(arg2 + 0xbdc)

if (r3 != result)
    int32_t i = 0
    
    do
        if (*(result + (i << 3)) == arg5 && *(result + (i << 3) + 4) == 7)
            return result
        
        i += 1
    while (i u< (r3 - result) s>> 3)

return ascensionrules::TransformCard(arg2, arg3, arg5, "Otherworldly Guide", false)
