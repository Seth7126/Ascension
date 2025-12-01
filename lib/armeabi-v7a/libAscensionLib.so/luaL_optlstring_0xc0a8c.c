// 函数: luaL_optlstring
// 地址: 0xc0a8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (lua_type() s> 0)
    return luaL_checklstring(arg1, arg2, arg4) __tailcall

if (arg4 != 0)
    uint32_t r0_4
    
    if (arg3 == 0)
        r0_4 = 0
    else
        r0_4 = strlen(arg3)
    
    *arg4 = r0_4

return arg3
