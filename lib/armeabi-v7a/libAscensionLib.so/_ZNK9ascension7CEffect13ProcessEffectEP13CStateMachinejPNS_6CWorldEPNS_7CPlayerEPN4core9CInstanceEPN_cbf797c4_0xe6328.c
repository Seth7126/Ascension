// 函数: _ZNK9ascension7CEffect13ProcessEffectEP13CStateMachinejPNS_6CWorldEPNS_7CPlayerEPN4core9CInstanceEPNS_6CEventEPNS_19CEffectInstanceDataE
// 地址: 0xe6328
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg1 + 0x94) u> arg3)
    void* r6_1 = arg1 + arg3 * 0x90
    ascension::CEffectInstanceData* r12_1 = arg7
    int32_t r7_1 = *(r6_1 + 0xd8)
    int32_t arg_c
    int32_t r0_2
    
    if (r7_1 != 0)
        r0_2 = r7_1(arg4, arg5, arg6, *(r6_1 + 0xdc), arg_c, r12_1)
        r12_1 = arg7
        result = 1
    
    if (r7_1 == 0 || r0_2 != 0)
        int32_t r7_2 = *(r6_1 + 0x120)
        result = 0
        
        if (r7_2 != 0)
            r7_2(arg2, arg4, arg5, *(r6_1 + 0x124), arg6, arg_c, r12_1)
            return 1

return result
