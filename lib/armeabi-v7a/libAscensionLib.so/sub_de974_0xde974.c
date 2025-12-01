// 函数: sub_de974
// 地址: 0xde974
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r7 = arg2
int32_t r1 = arg2[2]
void* r2_2

for (int32_t i = 0; i u<= 0x63; )
    int32_t* r0_4
    
    if (r1 != 0x45)
        r0_4 = sub_dc704(arg1, r7, 1)
        r2_2 = &r0_4[2]
        r1 = *r2_2
        
        if (r1 == 0)
            sub_c841c(arg1, r7, "index")
            noreturn
    else
        void* r5_1 = *r7
        int128_t q4
        void* r0_1 = sub_db788(r5_1, arg3, arg1, q4)
        void* r6_1 = r0_1
        
        if (*(r0_1 + 8) != 0)
            goto label_dea6c
        
        void* r0_3 = *(r5_1 + 8)
        
        if (r0_3 != 0 && (zx.d(*(r0_3 + 6)) & 2) == 0)
            r0_4 = sub_dc6c8(r0_3, 1, *(arg1[3] + 0xbc))
        
        if (r0_3 == 0 || (zx.d(*(r0_3 + 6)) & 2) != 0 || r0_4 == 0)
            if (r6_1 != &data_1d13d0)
                goto label_dea6c
            
            int32_t __saved_r11
            r6_1 = sub_db070(arg1, r5_1, arg3, i, r5_1, r6_1, r7, arg4, arg3, arg1, &__saved_r11)
        label_dea6c:
            int32_t r1_6 = arg4[1]
            *r6_1 = *arg4
            *(r6_1 + 4) = r1_6
            *(r6_1 + 8) = arg4[2]
            *(r5_1 + 6) = 0
            uint32_t result = zx.d(arg4[2].b)
            
            if ((result & 0x40) != 0)
                result = zx.d(*(*arg4 + 5))
                
                if ((result & 3) != 0)
                    result = zx.d(*(r5_1 + 5))
                    
                    if ((result & 4) != 0)
                        return sub_cafb8(arg1, r5_1) __tailcall
            
            return result
        
        r2_2 = &r0_4[2]
        r1 = *r2_2
    
    if ((r1 & 0xf) == 6)
        int32_t* r1_7 = arg1[2]
        arg1[2] = &r1_7[4]
        int32_t r3_2 = r0_4[1]
        *r1_7 = *r0_4
        r1_7[1] = r3_2
        r1_7[2] = *r2_2
        int32_t* r0_14 = arg1[2]
        arg1[2] = &r0_14[4]
        int32_t r2_5 = r7[1]
        *r0_14 = *r7
        r0_14[1] = r2_5
        r0_14[2] = r7[2]
        int32_t* r0_15 = arg1[2]
        arg1[2] = &r0_15[4]
        int32_t r2_6 = arg3[1]
        *r0_15 = *arg3
        r0_15[1] = r2_6
        r0_15[2] = arg3[2]
        int32_t* r0_16 = arg1[2]
        arg1[2] = &r0_16[4]
        int32_t r2_7 = arg4[1]
        *r0_16 = *arg4
        r0_16[1] = r2_7
        r0_16[2] = arg4[2]
        return sub_c9774(arg1, arg1[2] - 0x40, 0, zx.d(*(arg1[4] + 0x12)) & 1, arg5) __tailcall
    
    i += 1
    r7 = r0_4

sub_c89f0(arg1, "loop in settable", r2_2)
noreturn
