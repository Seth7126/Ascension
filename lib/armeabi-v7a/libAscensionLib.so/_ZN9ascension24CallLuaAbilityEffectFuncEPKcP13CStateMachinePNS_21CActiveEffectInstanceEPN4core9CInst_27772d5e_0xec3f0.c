// 函数: _ZN9ascension24CallLuaAbilityEffectFuncEPKcP13CStateMachinePNS_21CActiveEffectInstanceEPN4core9CInstanceEPNS_6CEventEj
// 地址: 0xec3f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0_1 = lua_gettop(data_1e415c)
lua_getglobal(data_1e415c, arg1)
lua_pushlightuserdata(data_1e415c, arg2)
lua_pushlightuserdata(data_1e415c, arg3)
lua_pushlightuserdata(data_1e415c, arg4)
lua_pushlightuserdata(data_1e415c, arg5)
lua_pushinteger(data_1e415c, arg6)
int32_t r0_9 = lua_pcallk(data_1e415c, 5, 0xffffffff, 0, 0, 0)

if (r0_9 != 0)
    printf("lua error (%s): %d\n", arg1, r0_9)
    printf("    %s\n", lua_tolstring(data_1e415c, 0xffffffff, 0))

int32_t result = lua_gettop(data_1e415c)

if (result s<= r0_1)
    return result

return lua_settop(data_1e415c, r0_1 + not.d(result)) __tailcall
