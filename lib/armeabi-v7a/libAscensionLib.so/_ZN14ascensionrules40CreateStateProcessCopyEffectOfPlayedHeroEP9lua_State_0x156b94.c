// 函数: _ZN14ascensionrules40CreateStateProcessCopyEffectOfPlayedHeroEP9lua_State
// 地址: 0x156b94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r0 = lua_touserdata(arg1, 1)
core::CCardInstance* r2 = nullptr

if (lua_gettop(arg1) == 2)
    r2 = lua_touserdata(arg1, 2, 0)

lua_pushlightuserdata(arg1, 
    ascensionrules::CreateStateProcessCopyEffectOfPlayedHero(r0, 0, r2, r2, nullptr, nullptr))
return 1
