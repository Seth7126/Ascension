// 函数: _ZN14ascensionrules27ReduceCenterRowHeroRuneCostEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x1036a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 6)
    return 0

int32_t lr = *(arg3 + 0x50)

if (lr s>= 1)
    int32_t r2 = 0
    int32_t* r1_1 = *(arg3 + 0x54) + 0xc
    
    do
        if (*(r1_1 - 8) == 7 && *(*(*(r1_1 - 0xc) + 0xc) + 0x88) == 1)
            int32_t r0_6 = *r1_1
            
            if (r0_6 s> arg4)
                *r1_1 = r0_6 - arg4
            else if (r0_6 s>= 2)
                *r1_1 = 1
        
        r2 += 1
        r1_1 = &r1_1[0x11]
    while (r2 s< lr)

return 1
