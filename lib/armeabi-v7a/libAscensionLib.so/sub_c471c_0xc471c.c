// 函数: sub_c471c
// 地址: 0xc471c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

switch (*arg2 - 7)
    case 0
        *arg2 = 6
    case 1
        arg2[2]
    label_c47d8:
        arg2[2] = sub_c4198(arg1)
        *arg2 = 0xb
    case 2
        int32_t r1_5 = sx.d(arg2[2].w)
        
        if ((r1_5 & 0x100) == 0 && zx.d(*(arg1 + 0x2e)) s<= r1_5)
            arg1[0xc].b -= 1
        
        if (zx.d(*(arg2 + 0xb)) == 7 && zx.d(*(arg1 + 0x2e)) u<= zx.d(*(arg2 + 0xa)))
            arg1[0xc].b -= 1
        
        arg2[2].w
        *(arg2 + 0xa)
        goto label_c47d8
    case 5
        *arg2 = 6
        arg2[2] = *(*(*arg1 + 0xc) + (arg2[2] << 2)) u>> 6 & 0xff
    case 6
        int32_t r1_12 = arg2[2]
        int32_t r0_6 = *(*arg1 + 0xc)
        *(r0_6 + (r1_12 << 2)) = (*(r0_6 + (r1_12 << 2)) & 0x7fffff) | 0x1000000
        *arg2 = 0xb
