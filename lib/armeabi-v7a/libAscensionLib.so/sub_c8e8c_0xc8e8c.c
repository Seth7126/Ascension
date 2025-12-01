// 函数: sub_c8e8c
// 地址: 0xc8e8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = arg1[8]
int32_t r12 = 0xf4240

if (r3 s> 0xf4240)
    r12 = sub_c8c5c(arg1, 6)
else
    int32_t r2_1 = 0xf4240
    
    if (0xf4240 s> r3 << 1)
        r2_1 = r3 << 1
    
    int32_t r0_3 = arg2 + ((arg1[2] - arg1[7]) s>> 4) + 5
    
    if (r2_1 s< r0_3)
        r2_1 = r0_3
    
    if (r2_1 s<= 0xf4240)
        return sub_c8d68(arg1, r2_1) __tailcall

sub_c89f0(arg1, "stack overflow", sub_c8d68(arg1, r12 + 0xc8))
noreturn
