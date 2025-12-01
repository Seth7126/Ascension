// 函数: lua_gc
// 地址: 0xbf5c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 u> 0xb)
    return 0xffffffff

void* r5 = arg1[3]

switch (arg2)
    case 0
        *(r5 + 0x3f) = 0
        return 0
    case 1
        sub_d74f0(r5, 0)
        *(r5 + 0x3f) = 1
        return 0
    case 2
        sub_cc180(arg1, 0)
        return 0
    case 3
        int32_t r0_5
        int32_t r1_1
        r1_1:r0_5 = *(r5 + 8)
        return (r1_1 + r0_5) u>> 0xa
    case 4
        int32_t r0_8
        int32_t r1_2
        r1_2:r0_8 = *(r5 + 8)
        return (r1_2 + r0_8) & 0x3ff
    case 5
        int32_t r0_12
        
        if (zx.d(*(r5 + 0x3e)) != 2)
            int32_t r1_3 = 0xfffff9c0 + (arg3 << 0xa)
            
            if (zx.d(*(r5 + 0x3f)) != 0)
                r1_3 += *(r5 + 0xc)
            
            sub_d74f0(r5, r1_3)
            sub_cbdc0(arg1)
            int32_t temp0_1 = 0
            uint32_t i = zx.d(*(r5 + 0x3d)) - 5
            
            while (i != 0)
                i u>>= 1
                temp0_1 += 1
            
            r0_12 = 0x20 - temp0_1
        else
            uint32_t i_2 = *(r5 + 0x14)
            sub_cbdc0(arg1)
            int32_t temp0 = 0
            uint32_t i_1 = i_2
            
            while (i_1 != 0)
                i_1 u>>= 1
                temp0 += 1
            
            r0_12 = 0x20 - temp0
        
        return r0_12 u>> 5
    case 6
        int32_t r4_6 = *(r5 + 0x9c)
        *(r5 + 0x9c) = arg3
        return r4_6
    case 7
        int32_t r4_4 = *(r5 + 0xa4)
        *(r5 + 0xa4) = arg3
        return r4_4
    case 8
        int32_t r4_7 = *(r5 + 0xa0)
        *(r5 + 0xa0) = arg3
        return r4_7
    case 9
        return zx.d(*(r5 + 0x3f))
    case 0xa
        sub_cb1ec(arg1, 2)
        return 0
    case 0xb
        sub_cb1ec(arg1, 0)
        return 0
