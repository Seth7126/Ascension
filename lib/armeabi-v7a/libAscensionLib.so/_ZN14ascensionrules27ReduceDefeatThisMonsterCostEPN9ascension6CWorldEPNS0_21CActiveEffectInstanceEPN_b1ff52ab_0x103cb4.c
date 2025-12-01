// 函数: _ZN14ascensionrules27ReduceDefeatThisMonsterCostEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x103cb4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 8)
    int32_t r12 = *(arg3 + 0x50)
    result = 1
    
    if (r12 s< 1)
        return 1
    
    int32_t lr_1 = *(arg2 + 0x14)
    int32_t r1 = 0
    int32_t* r2_1 = *(arg3 + 0x54) + 0xc
    
    do
        r1 += 1
        
        if (*(r2_1 - 0xc) == lr_1)
            *r2_1 -= arg4
        
        r2_1 = &r2_1[0xd]
    while (r1 s< r12)

return result
