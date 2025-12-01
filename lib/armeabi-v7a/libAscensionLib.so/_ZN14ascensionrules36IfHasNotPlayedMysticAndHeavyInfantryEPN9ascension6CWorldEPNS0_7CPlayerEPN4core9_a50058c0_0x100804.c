// 函数: _ZN14ascensionrules36IfHasNotPlayedMysticAndHeavyInfantryEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x100804
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r7 = *(arg1 + 0xb80)
int32_t r5 = *(arg1 + 0xb84)
int32_t r4
int32_t r10

if (r7 == r5)
    r4 = 0
    r10 = 0
else
    r10 = 0
    r4 = 0
    
    do
        if ((zx.d(r7[1].b) & 1) == 0)
            void* r0_7 = *r7
            
            if (r0_7 != 0)
                void* r0_8 = *(r0_7 + 0xc)
                
                if (*(r0_8 + 0x88) == 1 && *(r0_8 + 0x8c) == 0)
                    if (strcasecmp(r0_8 + 0x44, "Mystic") == 0)
                        r10 = 1
                    else
                        int32_t temp0_1 = 0
                        int32_t i = strcasecmp(r0_8 + 0x44, "Heavy Infantry")
                        
                        while (i != 0)
                            i u>>= 1
                            temp0_1 += 1
                        
                        r4 |= (0x20 - temp0_1) u>> 5
        
        r7 = &r7[2]
    while (r5 != r7)

return 1 & not.d(r4 & r10)
