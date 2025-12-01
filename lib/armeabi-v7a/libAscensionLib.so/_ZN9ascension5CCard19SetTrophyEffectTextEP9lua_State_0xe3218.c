// 函数: _ZN9ascension5CCard19SetTrophyEffectTextEP9lua_State
// 地址: 0xe3218
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = lua_touserdata(arg1, 1)
char* s = lua_tolstring(arg1, 2, 0)
strlen(s)
char* r0_4 = ascension::CDatabase::AllocateTextBuffer(ascension::g_Database)

if (r0_4 != 0)
    strcpy(r0_4, s)
    *(r0 + 0x144) = r0_4

return 0
