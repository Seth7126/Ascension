// 函数: _ZN14ascensionrules41CreateStateProcessBanishFromHandOrDiscardEP9lua_State
// 地址: 0x1566d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r0 = lua_touserdata(arg1, 1)
int32_t r0_2 = lua_tointegerx(arg1, 2, 0)
char* r0_4 = lua_tolstring(arg1, 3, 0)
int32_t r7 = 0

if (r0_4 != 0)
    r7 = ascension::GetCardTypeFromString(r0_4)

lua_pushlightuserdata(arg1, 
    ascensionrules::CreateStateProcessBanishFromHandOrDiscardOrSource(r0, r0_2, true, true, false, 
        r7, nullptr, lua_touserdata(arg1, 4), nullptr, nullptr, 0))
return 1
