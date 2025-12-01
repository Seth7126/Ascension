// 函数: lua_yieldk
// 地址: 0xc9dc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(arg1[9].w) == 0)
    int32_t* r12_1 = arg1[4]
    *(arg1 + 6) = 1
    int32_t lr_1 = arg1[7]
    int32_t temp1_1 = zx.d(*(r12_1 + 0x12)) & 1
    
    if (temp1_1 != 0)
        arg1 = nullptr
    
    r12_1[5] = *r12_1 - lr_1
    
    if (temp1_1 != 0)
        return 
    
    r12_1[7] = arg4
    
    if (arg4 != 0)
        r12_1[6] = arg3
    
    *r12_1 = arg1[2] - (arg2 << 4) - 0x10
    arg1, arg3 = sub_c8c5c(arg1, 1)

if (*(arg1[3] + 0xac) != arg1)
    sub_c89f0(arg1, "attempt to yield across a C-call boundary", arg3)
    noreturn

sub_c89f0(arg1, "attempt to yield from outside a coroutine", arg3)
noreturn
