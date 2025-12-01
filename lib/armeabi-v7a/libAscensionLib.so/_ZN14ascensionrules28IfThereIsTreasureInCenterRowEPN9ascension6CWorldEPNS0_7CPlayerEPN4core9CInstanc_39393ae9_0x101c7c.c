// 函数: _ZN14ascensionrules28IfThereIsTreasureInCenterRowEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x101c7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

for (int32_t i = 0; i u< 7; i += 1)
    int32_t* r0_3 = ascension::CWorld::GetCenterRowCardStackList(arg1)
    
    if (r0_3 != 0)
        int32_t r1_1 = *r0_3
        int32_t r0_4 = r0_3[1]
        
        if (r0_4 != r1_1)
            int32_t j = 0
            
            do
                if (*(r1_1 + (j << 3) + 4) == 3)
                    void* r3_2 = *(r1_1 + (j << 3))
                    
                    if (r3_2 == 0)
                        j += 1
                    else if (*(*(r3_2 + 0xc) + 0x88) == 6)
                        return 1
                
                j += 1
            while (j u< (r0_4 - r1_1) s>> 3)

return 0
