// 函数: _ZN9ascension5CCard6CreateEP9lua_State
// 地址: 0xe227c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

lua_tolstring(arg1, 1, 0)
char* r0_2 = lua_tolstring(arg1, 2, 0)
void** r0_3 = operator new(0x430)
core::CCard::CCard()
*r0_3 = _vtable_for_ascension::CCard + 8
r0_3[0x59].b = 0
r0_3[0x57] = 0
r0_3[0x58] = 0
r0_3[0x22] = 0
r0_3[0x23] = 0
r0_3[0x24] = 0xffffffff
__builtin_memset(&r0_3[0x25], 0, 0x15)
__aeabi_memclr4(&r0_3[0x2b], 0x2d)
r0_3[0x39].w = 0
r0_3[0x37] = 0
r0_3[0x38] = 0
__aeabi_memclr4(&r0_3[0x3a], 0x71)
__aeabi_memclr4(&r0_3[0x5a], 0x2c8)
core::CCard::SetCardName(r0_3)
core::CCard::SetDisplayName(r0_3)
int32_t r0_11 = ascension::GetCardTypeFromString(r0_2)
r0_3[0x22] = r0_11

if (r0_11 - 1 u<= 1)
    r0_3[0x33] = 1

lua_pushlightuserdata(arg1, r0_3)
return 1
