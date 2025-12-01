// 函数: _ZN4core10CWorldBase13OutputMessageEP9lua_State
// 地址: 0xb7f58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = lua_touserdata(arg1, 1)
int32_t r0_2 = lua_tolstring(arg1, 2, 0)
int32_t r2 = *(r0 + 0xa04)

if (r2 != 0)
    r2(*(r0 + 0xa08), r0_2)

return 0
