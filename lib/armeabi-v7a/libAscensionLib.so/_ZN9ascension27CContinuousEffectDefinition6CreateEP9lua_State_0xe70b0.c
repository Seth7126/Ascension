// 函数: _ZN9ascension27CContinuousEffectDefinition6CreateEP9lua_State
// 地址: 0xe70b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r0 = lua_tolstring(arg1, 1, 0)
void** r0_1 = operator new(0x210)
*r0_1 = _vtable_for_ascension::CActiveEffectDefinition + 8
__aeabi_memclr8(&r0_1[2], 0x54)

if (r0 != 0)
    strncpy(&r0_1[7], r0, 0x40)
    *(r0_1 + 0x5b) = 0

__aeabi_memclr4(&r0_1[0x17], 0x168)
*r0_1 = _vtable_for_ascension::CContinuousEffectDefinition + 8
__aeabi_memclr4(&r0_1[0x71], 0x48)
lua_pushlightuserdata(arg1, r0_1)
return 1
