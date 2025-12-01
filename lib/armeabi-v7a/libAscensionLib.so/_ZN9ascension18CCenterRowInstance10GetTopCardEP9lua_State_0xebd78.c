// 函数: _ZN9ascension18CCenterRowInstance10GetTopCardEP9lua_State
// 地址: 0xebd78
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = lua_touserdata(arg1, 1)
int32_t r1_1

if (r0 == 0)
    r1_1 = 0
else
    int32_t r1 = *(r0 + 0xc)
    int32_t r0_1 = *(r0 + 0x10)
    r1_1 = r1 - r0_1
    
    if (r1 != r0_1)
        r1_1 = r0_1 - 8

lua_pushlightuserdata(arg1, r1_1)
return 1
