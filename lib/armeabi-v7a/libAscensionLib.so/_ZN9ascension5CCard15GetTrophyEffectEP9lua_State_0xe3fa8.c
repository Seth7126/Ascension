// 函数: _ZN9ascension5CCard15GetTrophyEffectEP9lua_State
// 地址: 0xe3fa8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(lua_touserdata(arg1, 1) + 0xf0)

if (r1 == 0)
    lua_pushnil(arg1, r1)
    return 1

lua_pushlightuserdata(arg1, r1)
return 1
