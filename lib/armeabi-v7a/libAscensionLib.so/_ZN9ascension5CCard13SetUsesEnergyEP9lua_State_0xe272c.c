// 函数: _ZN9ascension5CCard13SetUsesEnergyEP9lua_State
// 地址: 0xe272c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = lua_touserdata(arg1, 1)
int32_t r0_2 = lua_toboolean(arg1, 2)

if (r0_2 != 0)
    r0_2 = 1

*(r0 + 0xa8) = r0_2.b
return 0
