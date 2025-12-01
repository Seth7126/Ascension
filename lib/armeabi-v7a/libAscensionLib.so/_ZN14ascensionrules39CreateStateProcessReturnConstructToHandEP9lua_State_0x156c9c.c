// 函数: _ZN14ascensionrules39CreateStateProcessReturnConstructToHandEP9lua_State
// 地址: 0x156c9c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r0 = lua_touserdata(arg1, 1)
int32_t r6 = 0
int32_t r0_2 = lua_tointegerx(arg1, 2, 0)
char* r0_4 = lua_tolstring(arg1, 3, 0)

if (r0_4 != 0)
    r6 = ascension::GetCardFactionFromString(r0_4)

lua_pushlightuserdata(arg1, 
    ascensionrules::CreateStateProcessReturnConstructToHand(r0, r0_2, r6, lua_touserdata(arg1, 4)))
return 1
