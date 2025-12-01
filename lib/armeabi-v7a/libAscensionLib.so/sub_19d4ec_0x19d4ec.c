// 函数: sub_19d4ec
// 地址: 0x19d4ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *(arg2 + 8)

if (arg1 == r0)
    return sub_19d460(r0, arg2, arg3, arg4) __tailcall

int32_t r5 = *(arg1 + 0xc)
uint32_t result = sub_19d4b4(arg1 + 0x10, arg2, arg3, arg4)

if (r5 s>= 2)
    void* i = arg1 + 0x18
    
    do
        sub_19d4b4(i, arg2, arg3, arg4)
        result = zx.d(*(arg2 + 0x36))
        
        if (result != 0)
            break
        
        i += 8
    while (i u< &(arg1 + 0x10)[r5 * 2])

return result
