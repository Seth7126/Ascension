// 函数: sub_c3840
// 地址: 0xc3840
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_gettop()
int32_t r5

if (r0 s< 1)
    r5 = 0
else
    int32_t r7_1 = 0
    r5 = 0
    
    do
        r7_1 += 1
        r5 |= luaL_checkunsigned(arg1, r7_1)
    while (r0 != r7_1)

lua_pushunsigned(arg1, r5)
return 1
