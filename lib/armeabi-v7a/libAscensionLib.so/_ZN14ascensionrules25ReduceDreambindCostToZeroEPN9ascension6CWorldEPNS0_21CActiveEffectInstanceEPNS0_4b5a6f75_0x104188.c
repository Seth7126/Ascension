// 函数: _ZN14ascensionrules25ReduceDreambindCostToZeroEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x104188
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 8 && *(arg3 + 0x4c) == *(arg2 + 0x14))
    int32_t lr_1 = *(arg3 + 0x50)
    result = 1
    
    if (lr_1 s< 1)
        return 1
    
    int32_t r3_2 = 0
    int32_t* r2_1 = *(arg3 + 0x54) + 0x10
    
    do
        r3_2 += 1
        
        if (*r2_1 != 0xffffffff)
            r2_1[1] = 0
        
        r2_1 = &r2_1[0xd]
    while (r3_2 s< lr_1)

return result
