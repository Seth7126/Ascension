// 函数: sub_d1388
// 地址: 0xd1388
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t __saved_r11
int32_t* r11 = &__saved_r11
int32_t r8 = arg5
int32_t* r4 = arg1
int32_t r6 = *arg3

if (r6 s< (r8 + (r8 u>> 0x1f)) s>> 1)
    r8 = 4
    
    if (r6 << 1 s> 4)
        r8 = r6 << 1
    
    goto label_d13dc

if (r6 s< r8)
label_d13dc:
    
    if (r8 + 1 u> __aeabi_uidiv(0xfffffffd, arg4))
        sub_d14b4(r4)
        noreturn
    
    int32_t r6_1 = r6 * arg4
    int32_t** r7_1 = r4[3]
    int32_t* var_28_1 = r4
    int32_t r5_1 = r8 * arg4
    r4 = *r7_1
    int32_t result = r4(r7_1[1], arg2, r6_1, r5_1, var_28_1)
    
    if (r5_1 == 0 || result != 0)
    label_d146c:
        
        if (arg2 != 0)
            r5_1 -= r6_1
        
        r7_1[3] += r5_1
        *arg3 = r8
        return result
    
    if (zx.d(*(r7_1 + 0x3f)) != 0)
        sub_cc180(var_28_1, 1)
        r4 = *r7_1
        result = r4(r7_1[1], arg2, r6_1, r5_1)
    
    if (zx.d(*(r7_1 + 0x3f)) != 0 && result != 0)
        goto label_d146c
    
    r11 = sub_c8c5c(var_28_1, 4)

sub_c89f0(r4, "too many %s (limit is %d)", r11[3])
noreturn
