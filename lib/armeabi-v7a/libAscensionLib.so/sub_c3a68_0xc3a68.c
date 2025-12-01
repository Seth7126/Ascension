// 函数: sub_c3a68
// 地址: 0xc3a68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_checkunsigned(arg1, 1)
int32_t r0_2 = luaL_checkinteger(arg1, 2)
int32_t r1

if (r0_2 s<= 0xffffffff)
    r1 = 0
    
    if (r0_2 s>= 0xffffffe1)
        r1 = r0 u>> (0 - r0_2)
else
    r1 = r0 << r0_2
    
    if (r0_2 s> 0x1f)
        r1 = 0

lua_pushunsigned(arg1, r1)
return 1
