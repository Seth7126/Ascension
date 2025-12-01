// 函数: _ZN14ascensionrules16CheckForSerenityEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1162c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CEffectInstanceData* result = arg6

if (result != 0 && *(*(arg3 + 0x40) + 0x18) == 0)
    void* r2_1 = result + *result + 4
    uint32_t r1_3 = zx.d(*r2_1)
    
    if (r1_3 u> 7)
        return result
    
    *r2_1 = r1_3.b + 1
    result = result + (*result << 5) + (r1_3 << 2)
    *(result + 0x10) = 1

return result
