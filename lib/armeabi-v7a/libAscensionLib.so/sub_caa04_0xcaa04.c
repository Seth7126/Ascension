// 函数: sub_caa04
// 地址: 0xcaa04
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t var_20 = 0
void* result = sub_cb0b8(arg1, 6, 0x10 + (arg2 << 2), 0)
*(result + 0xc) = 0
*(result + 6) = arg2.b

if (arg2 != 0)
    __aeabi_memclr4(result + 0x10, arg2 << 2)

return result
