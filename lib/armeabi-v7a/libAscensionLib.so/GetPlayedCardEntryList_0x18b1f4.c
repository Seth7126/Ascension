// 函数: GetPlayedCardEntryList
// 地址: 0x18b1f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2 = *s_pWorldData
int32_t result = 0

if (r2 == 0)
    return 0

void* r1_2 = *(r2 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)

if (r1_2 != 0)
    int32_t lr_1 = *(r1_2 + 0xb80)
    int32_t r1_3 = *(r1_2 + 0xb84)
    
    if (r1_3 != lr_1)
        result = (r1_3 - lr_1) s>> 3
        int32_t r3_1 = 0
        
        do
            void* r2_1 = *(lr_1 + (r3_1 << 3))
            uint32_t r1_5 = 0
            
            if (r2_1 != 0)
                r1_5 = zx.d(*(r2_1 + 8))
            
            int32_t* r2_3 = arg1 + (r3_1 << 3)
            *r2_3 = r1_5
            void* r1_6 = lr_1 + (r3_1 << 3)
            r3_1 += 1
            r2_3[1] = *(r1_6 + 4)
        while (r3_1 u< result)

return result
