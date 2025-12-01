// 函数: GetResolveCardPositionIndex
// 地址: 0x18b288
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r1 = *s_pWorldData

if (r1 != 0)
    void* r1_2 = *(r1 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    
    if (r1_2 != 0)
        int32_t r2_2 = *(r1_2 + 0xbd8)
        int32_t r1_3 = *(r1_2 + 0xbdc)
        
        if (r1_3 != r2_2)
            int32_t i = 0
            
            do
                void* r1_5 = *(r2_2 + (i << 3))
                
                if (r1_5 != 0)
                    uint32_t r1_6 = zx.d(*(r1_5 + 8))
                    int32_t r4_2 = *(r2_2 + (i << 3) + 4)
                    
                    if (r4_2 == 9)
                        r1_6 += 0x5000
                    else if (r4_2 == 0xc)
                        r1_6 += 0x6000
                    
                    if ((r1_6 & 0xffff) == arg1)
                        return i
                
                i += 1
            while (i u< (r1_3 - r2_2) s>> 3)

return 0xffffffff
