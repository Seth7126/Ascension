// 函数: _ZN14ascensionrules28ReduceCostOfPasytheaRedeemedEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x105278
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 6 && *(arg2 + 0x14) == *(arg3 + 0x4c))
    int32_t r6_1 = *(arg3 + 0x50)
    
    if (r6_1 s>= 1)
        int32_t r5_1 = 0
        int32_t* r7_1 = *(arg3 + 0x54) + 0x14
        
        do
            if (*(r7_1 - 0x10) == 0x1b
                    && strcasecmp("Pasythea, The Redeemed", *(*(r7_1 - 0x14) + 0xc) + 4) == 0)
                int32_t r0_9 = *r7_1 - arg4
                *r7_1 = r0_9 & not.d(r0_9 s>> 0x1f)
                return 1
            
            r5_1 += 1
            r7_1 = &r7_1[0x11]
        while (r5_1 s< r6_1)

return 0
