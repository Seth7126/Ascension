// 函数: _ZN14ascensionrules35IfHasNotPlayedMysticOrHeavyInfantryEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x100754
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = *(arg1 + 0xb80)
int32_t r4 = *(arg1 + 0xb84)

if (r5 != r4)
    do
        if ((zx.d(r5[1].b) & 1) == 0)
            void* r0_1 = *r5
            
            if (r0_1 != 0)
                void* r0_2 = *(r0_1 + 0xc)
                
                if (*(r0_2 + 0x88) == 1 && *(r0_2 + 0x8c) == 0)
                    int32_t r0_4 = strcasecmp(r0_2 + 0x44, "Mystic")
                    int32_t r0_6
                    
                    if (r0_4 != 0)
                        r0_6 = strcasecmp(r0_2 + 0x44, "Heavy Infantry")
                    
                    if (r0_4 == 0 || r0_6 == 0)
                        return 0
        
        r5 = &r5[2]
    while (r4 != r5)

return 1
