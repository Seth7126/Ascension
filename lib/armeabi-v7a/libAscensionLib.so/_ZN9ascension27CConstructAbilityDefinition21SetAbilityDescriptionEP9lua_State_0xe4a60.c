// 函数: _ZN9ascension27CConstructAbilityDefinition21SetAbilityDescriptionEP9lua_State
// 地址: 0xe4a60
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = lua_touserdata(arg1, 1)
char* r0_2 = lua_tolstring(arg1, 2, 0)
strlen(r0_2)
char* r0_5 = ascension::CDatabase::AllocateTextBuffer(ascension::g_Database)

if (r0_5 != 0)
    strcpy(r0_5, r0_2)
    *(r0 + 0x2c) = r0_5

if (strcasecmp(r0_2, "Transform") == 0)
    *(r0 + 0x1a0) = 1

return 0
