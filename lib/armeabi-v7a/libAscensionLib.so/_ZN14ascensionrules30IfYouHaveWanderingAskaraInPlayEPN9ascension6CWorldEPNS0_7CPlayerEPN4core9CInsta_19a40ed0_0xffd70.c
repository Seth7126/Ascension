// 函数: _ZN14ascensionrules30IfYouHaveWanderingAskaraInPlayEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0xffd70
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = *(arg1 + 0xb80)
int32_t r1_1 = *(arg1 + 0xb84) - r5
int32_t r6 = r1_1 s>> 3

if (*(arg1 + 0x30) u> 7)
    uint32_t r7_1 = 0
    
    if (arg3 != 0)
        r7_1 = zx.d(*(arg3 + 8))
    
    if (r1_1 != 0)
        int32_t r4_1 = 0
        
        do
            int32_t* r1_3 = r5 + (r4_1 << 3)
            void* r0_2 = *r1_3
            
            if (r1_3[1] == 0 && r7_1 != zx.d(*(r0_2 + 8))
                    && strcasecmp(*(r0_2 + 0xc) + 4, "Wandering Askara") == 0)
                return 1
            
            r4_1 += 1
        while (r4_1 u< r6)
else if (r1_1 != 0)
    int32_t r7_2 = 0
    
    do
        int32_t* r1_7 = r5 + (r7_2 << 3)
        void* r0_6 = *r1_7
        
        if (r1_7[1] == 0 && zx.d(*(r0_6 + 8)) != zx.d(*(arg3 + 8))
                && strcasecmp(*(r0_6 + 0xc) + 4, *(arg3 + 0xc) + 4) == 0)
            return 1
        
        r7_2 += 1
    while (r7_2 u< r6)

return 0
