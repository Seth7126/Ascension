// 函数: __cxa_decrement_exception_refcount
// 地址: 0x19c430
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg1 == 0)
    return 

__dmb_ISH()
int32_t r1

do
    r1 = *(arg1 - 0x80)
    unimplemented  {strex r3, r2, [r0]}
while (arg4 != 0)

__dmb_ISH()

if (r1 != 1)
    return 

int32_t r1_1 = *(arg1 - 0x78)

if (r1_1 != 0)
    r1_1(arg1)

return sub_1a9e9c() __tailcall
