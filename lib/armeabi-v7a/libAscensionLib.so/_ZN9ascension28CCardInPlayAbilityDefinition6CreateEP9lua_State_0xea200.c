// 函数: _ZN9ascension28CCardInPlayAbilityDefinition6CreateEP9lua_State
// 地址: 0xea200
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r0 = lua_tolstring(arg1, 1, 0)
char* r0_1 = operator new(0x198)
*(r0_1 + 0x194) = 0
__aeabi_memclr4(&r0_1[0x20], 0x172)
strncpy(r0_1, r0, 0x20)
r0_1[0x1f] = 0
lua_pushlightuserdata(arg1, r0_1)
return 1
