// 函数: _ZN14ascensionrules18CanAcquireFromVoidEP9lua_State
// 地址: 0x1561a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r0 = lua_touserdata(arg1, 1)
int32_t r6 = 0
int32_t r0_3 = ascension::GetCardTypeFromString(lua_tolstring(arg1, 2, 0))
char* r0_5 = lua_tolstring(arg1, 3, 0)

if (r0_5 != 0)
    r6 = ascension::GetCardFactionFromString(r0_5)

lua_pushboolean(arg1, ascensionrules::CanAcquireFromVoid(r0, r0_3, r6))
return 1
