// 函数: lua_setglobal
// 地址: 0xbe978
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10
int128_t q4
int32_t* r0_2 = sub_db664(*(arg1[3] + 0x28), 2, r10, q4)
int32_t* r7 = arg1[2]
arg1[2] = &r7[4]
void* r0_5 = sub_d807c(arg1, arg2)
*r7 = r0_5
r7[2] = zx.d(*(r0_5 + 4)) | 0x40
int32_t r0_8 = arg1[2]
int32_t r8
sub_de974(arg1, r0_2, r0_8 - 0x10, r0_8 - 0x20, r8)
int32_t result = arg1[2] - 0x20
arg1[2] = result
return result
