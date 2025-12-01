// 函数: _ZN9ascension27CallLuaContinuousEffectFuncEPKcPNS_6CWorldEPNS_21CActiveEffectInstanceEPNS_6CEventEj
// 地址: 0xec54c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = lua_gettop(data_1e415c)
lua_getglobal(data_1e415c, arg1)
lua_pushlightuserdata(data_1e415c, arg2)
lua_pushlightuserdata(data_1e415c, arg3)
lua_pushlightuserdata(data_1e415c, arg4)
lua_pushinteger(data_1e415c, arg5)
int32_t r0_8 = lua_pcallk(data_1e415c, 4, 0xffffffff, 0, 0, 0)

if (r0_8 != 0)
    printf("lua error (%s): %d\n", arg1, r0_8)
    printf("    %s\n", lua_tolstring(data_1e415c, 0xffffffff, 0))

int32_t result = lua_toboolean(data_1e415c, 0xffffffff)
int32_t r0_14 = lua_gettop(data_1e415c)

if (r0_14 s> r0_1)
    lua_settop(data_1e415c, r0_1 + not.d(r0_14))

if (result != 0)
    return 1

return result
