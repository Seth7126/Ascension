// 函数: sub_d71e4
// 地址: 0xd71e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r10
int32_t var_c = r10
int32_t r6 = *arg4
int32_t r5 = arg2 - arg3
int32_t* r4 = *(arg1 + 0x30)
int32_t result = r6 - 0xc

if (result u>= 2)
    if (r6 != 0)
        result, r4, r5 = sub_c482c(r4, arg4, r10.b)
    
    if (r5 s>= 1)
        uint32_t r6_1 = zx.d(r4[0xc].b)
        sub_c4328(r4, r5)
        return sub_c3c44(r4, r6_1, r5) __tailcall
else
    int32_t r5_1 = (r5 + 1) & not.d((r5 + 1) s>> 0x1f)
    result = sub_c4608(r4, arg4, r5_1)
    
    if (r5_1 s>= 2)
        return sub_c4328(r4, r5_1 - 1) __tailcall

return result
