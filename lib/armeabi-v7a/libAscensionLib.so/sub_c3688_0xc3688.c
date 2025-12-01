// 函数: sub_c3688
// 地址: 0xc3688
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (lua_checkstack(arg1, 1) != 0)
    lua_pushboolean(arg1, arg2)
    lua_replace(arg1, 1)
    return lua_gettop(arg1) __tailcall

lua_settop(arg1, 0)
lua_pushboolean(arg1, 0)
lua_pushstring(arg1, "stack overflow")
return 2
