// 函数: _ZN9ascension18CConstructInstance23IsSameConstructInstanceEP9lua_State
// 地址: 0xe5568
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = lua_touserdata(arg1, 1)
int32_t temp0 = 0
uint32_t i = r5 - lua_touserdata(arg1, 2)

while (i != 0)
    i u>>= 1
    temp0 += 1

if (r5 != 0)
    r5 = 1

lua_pushboolean(arg1, r5 & (0x20 - temp0) u>> 5)
return 1
