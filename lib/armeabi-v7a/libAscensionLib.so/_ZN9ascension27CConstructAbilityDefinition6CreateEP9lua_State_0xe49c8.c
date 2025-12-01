// 函数: _ZN9ascension27CConstructAbilityDefinition6CreateEP9lua_State
// 地址: 0xe49c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r0 = lua_tolstring(arg1, 1, 0)
char* r0_1 = operator new(0x1a4)
*(r0_1 + 0x19c) = 0
r0_1[0x1a0] = 0
__aeabi_memclr4(&r0_1[0x28], 0x172)
strncpy(r0_1, r0, 0x28)
r0_1[0x27] = 0
lua_pushlightuserdata(arg1, r0_1)
return 1
