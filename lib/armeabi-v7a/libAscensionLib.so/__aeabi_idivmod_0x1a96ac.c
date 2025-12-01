// 函数: __aeabi_idivmod
// 地址: 0x1a96ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 != 0)
    return sub_1a95d8(arg1, arg2)

bool cond:0 = arg1 s< 0

if (arg1 s> 0)
    arg1 = 0x7fffffff

if (cond:0)
    arg1 = 0x80000000

return __aeabi_idiv0(arg1) __tailcall
