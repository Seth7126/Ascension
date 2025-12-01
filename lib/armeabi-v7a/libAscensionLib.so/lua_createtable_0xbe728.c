// 函数: lua_createtable
// 地址: 0xbe728
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1[3] + 0xc) s>= 1)
    sub_cc158(arg1)

void* r0_4 = sub_dafac(arg1)
void** r0_5 = arg1[2]
bool cond:0 = arg2 s< 0

if (arg2 s<= 0)
    cond:0 = arg3 s< 1

r0_5[2] = 0x45
*r0_5 = r0_4
int32_t result = arg1[2] + 0x10
arg1[2] = result

if (cond:0)
    return result

int32_t r8
return sub_daa54(arg1, r0_4, arg2, arg3, r8) __tailcall
