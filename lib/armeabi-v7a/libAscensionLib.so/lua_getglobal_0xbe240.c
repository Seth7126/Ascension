// 函数: lua_getglobal
// 地址: 0xbe240
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10
int128_t q4
int32_t* r0_2 = sub_db664(*(arg1[3] + 0x28), 2, r10, q4)
int32_t* r7 = arg1[2]
arg1[2] = &r7[4]
void* r0_5 = sub_d807c(arg1, arg2)
*r7 = r0_5
r7[2] = zx.d(*(r0_5 + 4)) | 0x40
int32_t* r2 = arg1[2] - 0x10
return sub_de7c0(arg1, r0_2, r2, r2) __tailcall
