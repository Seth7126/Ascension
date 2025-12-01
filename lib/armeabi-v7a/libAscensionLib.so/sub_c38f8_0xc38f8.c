// 函数: sub_c38f8
// 地址: 0xc38f8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_gettop()
int32_t r5

if (r0 s< 1)
    r5 = 1
else
    r5 = 0xffffffff
    int32_t r7_1 = 0
    
    do
        r7_1 += 1
        r5 &= luaL_checkunsigned(arg1, r7_1)
    while (r0 != r7_1)
    
    if (r5 != 0)
        r5 = 1

lua_pushboolean(arg1, r5)
return 1
