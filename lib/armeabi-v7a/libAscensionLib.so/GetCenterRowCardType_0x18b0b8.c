// 函数: GetCenterRowCardType
// 地址: 0x18b0b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *s_pWorldData

if (r0 != 0)
    int32_t r0_2 = *(r0 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    
    if (r0_2 != 0)
        int32_t* r0_3 = ascension::CWorld::GetCenterRowCardStackList(r0_2)
        
        if (r0_3 != 0)
            int32_t* r1_1 = *r0_3
            int32_t r0_4 = r0_3[1]
            
            if (r1_1 != r0_4)
                do
                    void* r2_2 = *r1_1
                    
                    if (r2_2 != 0 && zx.d(*(r2_2 + 8)) == arg2)
                        return r1_1[1]
                    
                    r1_1 = &r1_1[2]
                while (r0_4 != r1_1)

return 0xffffffff
