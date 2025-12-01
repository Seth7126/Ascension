// 函数: sub_cae14
// 地址: 0xcae14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = zx.d(*(arg2 + 4)) - 4
*(arg2 + 5) &= 0xfc

if (r0_1 u<= 0x22)
    r0_1 = jump_table_cae4c[r0_1]
    int32_t r0_3
    
    switch (r0_1)
        case 0x8c
            r0_3 = *(arg2 + 0xc) + 0x11
        label_cafa4:
            *(arg2 + 5) |= 4
            r0_1 = *(arg1 + 0x10) + r0_3
            *(arg1 + 0x10) = r0_1
        case 0x98
            int32_t r0_4 = *(arg1 + 0x54)
            *(arg2 + 8) = r0_4
            *(arg1 + 0x54) = arg2
            return r0_4
        case 0xa8
            int32_t r0_5 = *(arg1 + 0x54)
            *(arg2 + 0x18) = r0_5
            *(arg1 + 0x54) = arg2
            return r0_5
        case 0xb8
            void* r1_2 = *(arg2 + 8)
            
            if (r1_2 != 0 && (zx.d(*(r1_2 + 5)) & 3) != 0)
                sub_cae14(arg1, r1_2)
            
            void* r1_3 = *(arg2 + 0xc)
            
            if (r1_3 != 0 && (zx.d(*(r1_3 + 5)) & 3) != 0)
                sub_cae14(arg1, r1_3)
            
            r0_3 = *(arg2 + 0x10) + 0x18
            goto label_cafa4
        case 0xf4
            int32_t r0_11 = *(arg1 + 0x54)
            *(arg2 + 0x3c) = r0_11
            *(arg1 + 0x54) = arg2
            return r0_11
        case 0x104
            int32_t r0_12 = *(arg1 + 0x54)
            *(arg2 + 0x48) = r0_12
            *(arg1 + 0x54) = arg2
            return r0_12
        case 0x114
            int32_t* r0_13 = *(arg2 + 8)
            
            if ((zx.d(r0_13[2].b) & 0x40) != 0 && (zx.d(*(*r0_13 + 5)) & 3) != 0)
                sub_cae14(arg1)
                r0_13 = *(arg2 + 8)
            
            if (r0_13 != arg2 + 0x10)
                return r0_13
            
            r0_3 = 0x20
            goto label_cafa4

return r0_1
