// 函数: sub_d6df4
// 地址: 0xd6df4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r7 = *(arg1 + 0x40)
void* r1 = *(*(arg1 + 0x30) + 0x10)
int32_t i = sx.d(*(r1 + 4))

if (*(r7 + 0x1c) s> i)
    int32_t r5_1 = *(r7 + 0xc)
    int32_t r8_1 = i << 4
    
    do
        int32_t* r9_1 = *(r7 + 0x18)
        
        if (sub_d7cc4(*(r9_1 + r8_1), *(r5_1 + (arg2 << 4))) != 0)
            void* r6 = r9_1 + r8_1
            void* r1_2 = r5_1 + (arg2 << 4)
            uint32_t r2_1 = zx.d(*(r6 + 0xc))
            
            if (zx.d(*(r1_2 + 0xc)) u> r2_1
                    && (zx.d(*(r1 + 9)) != 0 || *(r7 + 0x1c) s> sx.d(*(r1 + 4))))
                sub_c40e4(*(arg1 + 0x30), *(r1_2 + 4), r2_1)
            
            int64_t* pc
            sub_d6d14(arg1, arg2, r6, pc)
            return 1
        
        i += 1
        r8_1 += 0x10
    while (i s< *(r7 + 0x1c))

return 0
