// 函数: _ZN14ascensionrules44MayAcquireThisCardAtNoCostIfDefeatedMonstersEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x10478c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 6)
    int32_t lr_1 = *(arg3 + 0x50)
    result = 1
    
    if (lr_1 s>= 1)
        int32_t r1 = *(arg2 + 0x10)
        int32_t r6_1 = 0
        int32_t* r4_2 = *(arg3 + 0x54) + 0x14
        
        do
            if (*(r4_2 - 0x14) == r1 && *(arg3 + 0x4c) == *(arg1 + 0xb20)
                    && arg4 u<= (*(arg1 + 0xba0) - *(arg1 + 0xb9c)) s>> 3)
                *r4_2 = 0
            
            r6_1 += 1
            r4_2 = &r4_2[0x11]
        while (r6_1 s< lr_1)

return result
