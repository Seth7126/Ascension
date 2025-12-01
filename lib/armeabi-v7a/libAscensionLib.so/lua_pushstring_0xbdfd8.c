// 函数: lua_pushstring
// 地址: 0xbdfd8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 == 0)
    void* r1_4 = arg1[2]
    *(r1_4 + 8) = 0
    arg1[2] = r1_4 + 0x10
    return 0

if (*(arg1[3] + 0xc) s>= 1)
    sub_cc158(arg1)

void* r0_4 = sub_d807c(arg1, arg2)
int32_t* r1_1 = arg1[2]
*r1_1 = r0_4
r1_1[2] = zx.d(*(r0_4 + 4)) | 0x40
arg1[2] += 0x10
return r0_4 + 0x10
