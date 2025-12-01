// 函数: sub_d4018
// 地址: 0xd4018
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r7 = *(arg1[3] + 0x34)
int32_t r2 = *(*arg1 + 0x40)
char const* const r0_1

if (r2 != 0)
    r0_1 = sub_d2f3c(r7, "function at line %d", r2)
else
    r0_1 = "main function"

char const* const var_20 = r0_1
int32_t r0_4 = sub_d2f3c(r7, "too many %s (limit is %d) in %s", arg3)
int64_t* pc
return sub_d4098(sub_ce78c(arg1[3], r0_4, pc), arg2, arg3, r7) __tailcall
