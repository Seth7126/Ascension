// 函数: sub_19ddc8
// 地址: 0x19ddc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r6
int32_t var_c = r6
int32_t r5
int32_t var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_28 = &__saved_r7
int32_t var_2c = r6
int32_t var_30 = r5
int32_t var_34 = r4
int32_t** var_38 = arg4
uint32_t r0 = sub_19d38c(arg1, *(arg2 + 8), arg6)

if (r0 != 0)
    return sub_19d9fc(r0, arg2, arg3, arg4, arg5) __tailcall

char result = *(arg2 + 0x34)
char r0_2 = *(arg2 + 0x35)
int32_t r11 = *(arg1 + 0xc)
*(arg2 + 0x34) = 0
*(arg2 + 0x35) = 0
sub_19dc1a(arg1 + 0x10, arg2, arg3, arg4, arg5, arg6)

if (r11 s>= 2)
    void* r6_3 = arg1 + 0x18
    
    while (zx.d(*(arg2 + 0x36)) == 0)
        if (zx.d(*(arg2 + 0x34)) != 0)
            if (*(arg2 + 0x18) == 1)
                break
            
            if (zx.d(*(arg1 + 8)) << 0x1e s>= 0)
                break
        else if (zx.d(*(arg2 + 0x35)) != 0 && zx.d(*(arg1 + 8)) << 0x1f == 0)
            break
        
        *(arg2 + 0x34) = 0
        sub_19dc1a(r6_3, arg2, arg3, arg4, arg5, arg6)
        r6_3 += 8
        
        if (r6_3 u>= arg1 + 0x10 + (r11 << 3))
            break

*(arg2 + 0x35) = r0_2
*(arg2 + 0x34) = result
return result
