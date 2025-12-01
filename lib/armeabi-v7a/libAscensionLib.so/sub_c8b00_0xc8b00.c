// 函数: sub_c8b00
// 地址: 0xc8b00
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = arg1[0x11]

if (r0 == 0)
    sub_c8c5c(arg1, 2)
else
    int32_t* r0_1 = arg1[7] + r0
    
    if ((r0_1[2] & 0xf) == 6)
        int32_t* r1_4 = arg1[2]
        int32_t r3_1 = *(r1_4 - 0xc)
        int32_t r12_2 = *(r1_4 - 8)
        *r1_4 = *(r1_4 - 0x10)
        r1_4[1] = r3_1
        r1_4[2] = r12_2
        int32_t r1_5 = arg1[2]
        int32_t r2_2 = *r0_1
        *(r1_5 - 0xc) = r0_1[1]
        *(r1_5 - 0x10) = r2_2
        *(r1_5 - 8) = r0_1[2]
        int32_t r0_3 = arg1[2]
        arg1[2] = r0_3 + 0x10
        int32_t r8
        sub_c9774(arg1, r0_3 - 0x10, 1, 0, r8)
        sub_c8c5c(arg1, 2)

return sub_c8b90(sub_c8c5c(arg1, 6)) __tailcall
